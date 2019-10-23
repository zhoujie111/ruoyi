package com.ruoyi.project.jiaowu.classtime.controller;

import java.util.List;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.project.jiaowu.classtime.domain.TbClassTime;
import com.ruoyi.project.jiaowu.classtime.service.ITbClassTimeService;
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

/**
 * 上课时间Controller
 * 
 * @author zhoujie
 * @date 2019-10-23
 */
@Controller
@RequestMapping("/website/classtime")
public class TbClassTimeController extends BaseController
{
    private String prefix = "system/jiaowu/classtime";

    @Autowired
    private ITbClassTimeService tbClassTimeService;

    @RequiresPermissions("website:classtime:view")
    @GetMapping()
    public String time()
    {
        return prefix + "/time";
    }

    /**
     * 查询上课时间列表
     */
    @RequiresPermissions("website:classtime:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbClassTime tbClassTime)
    {
        startPage();
        List<TbClassTime> list = tbClassTimeService.selectTbClassTimeList(tbClassTime);
        return getDataTable(list);
    }

    /**
     * 导出上课时间列表
     */
    @RequiresPermissions("website:classtime:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbClassTime tbClassTime)
    {
        List<TbClassTime> list = tbClassTimeService.selectTbClassTimeList(tbClassTime);
        ExcelUtil<TbClassTime> util = new ExcelUtil<TbClassTime>(TbClassTime.class);
        return util.exportExcel(list, "time");
    }

    /**
     * 新增上课时间
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存上课时间
     */
    @RequiresPermissions("website:classtime:add")
    @Log(title = "上课时间", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbClassTime tbClassTime)
    {
        return toAjax(tbClassTimeService.insertTbClassTime(tbClassTime));
    }

    /**
     * 修改上课时间
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbClassTime tbClassTime = tbClassTimeService.selectTbClassTimeById(id);
        mmap.put("tbClassTime", tbClassTime);
        return prefix + "/edit";
    }

    /**
     * 修改保存上课时间
     */
    @RequiresPermissions("website:classtime:edit")
    @Log(title = "上课时间", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbClassTime tbClassTime)
    {
        return toAjax(tbClassTimeService.updateTbClassTime(tbClassTime));
    }

    /**
     * 删除上课时间
     */
    @RequiresPermissions("website:classtime:remove")
    @Log(title = "上课时间", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbClassTimeService.deleteTbClassTimeByIds(ids));
    }
}
