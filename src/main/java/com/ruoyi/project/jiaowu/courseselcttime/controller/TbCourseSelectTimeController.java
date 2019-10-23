package com.ruoyi.project.jiaowu.courseselcttime.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.project.jiaowu.courseselcttime.domain.TbCourseSelectTime;
import com.ruoyi.project.jiaowu.courseselcttime.service.ITbCourseSelectTimeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;

import java.util.List;

/**
 * 选课时间Controller
 * 
 * @author zhoujie
 * @date 2019-10-23
 */
@Controller
@RequestMapping("/website/courseselecttime")
public class TbCourseSelectTimeController extends BaseController
{
    private String prefix = "system/jiaowucourseselecttime";

    @Autowired
    private ITbCourseSelectTimeService tbCourseSelectTimeService;

    @RequiresPermissions("website:courseselecttime:view")
    @GetMapping()
    public String time()
    {
        return prefix + "/time";
    }

    /**
     * 查询选课时间列表
     */
    @RequiresPermissions("website:courseselecttime:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbCourseSelectTime tbCourseSelectTime)
    {
        startPage();
        List<TbCourseSelectTime> list = tbCourseSelectTimeService.selectTbCourseSelectTimeList(tbCourseSelectTime);
        return getDataTable(list);
    }

    /**
     * 导出选课时间列表
     */
    @RequiresPermissions("website:courseselecttime:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbCourseSelectTime tbCourseSelectTime)
    {
        List<TbCourseSelectTime> list = tbCourseSelectTimeService.selectTbCourseSelectTimeList(tbCourseSelectTime);
        ExcelUtil<TbCourseSelectTime> util = new ExcelUtil<TbCourseSelectTime>(TbCourseSelectTime.class);
        return util.exportExcel(list, "time");
    }

    /**
     * 新增选课时间
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存选课时间
     */
    @RequiresPermissions("website:courseselecttime:add")
    @Log(title = "选课时间", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbCourseSelectTime tbCourseSelectTime)
    {
        return toAjax(tbCourseSelectTimeService.insertTbCourseSelectTime(tbCourseSelectTime));
    }

    /**
     * 修改选课时间
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbCourseSelectTime tbCourseSelectTime = tbCourseSelectTimeService.selectTbCourseSelectTimeById(id);
        mmap.put("tbCourseSelectTime", tbCourseSelectTime);
        return prefix + "/edit";
    }

    /**
     * 修改保存选课时间
     */
    @RequiresPermissions("website:courseselecttime:edit")
    @Log(title = "选课时间", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbCourseSelectTime tbCourseSelectTime)
    {
        return toAjax(tbCourseSelectTimeService.updateTbCourseSelectTime(tbCourseSelectTime));
    }

    /**
     * 删除选课时间
     */
    @RequiresPermissions("website:courseselecttime:remove")
    @Log(title = "选课时间", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbCourseSelectTimeService.deleteTbCourseSelectTimeByIds(ids));
    }
}
