package com.ruoyi.project.jiaowu.totalcoursemain.controller;

import java.util.List;

import com.ruoyi.project.jiaowu.totalcoursemain.domain.TbTotalCourseMain;
import com.ruoyi.project.jiaowu.totalcoursemain.service.ITbTotalCourseMainService;
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
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
@Controller
@RequestMapping("/website/totalcourse")
public class TbTotalCourseMainController extends BaseController
{
    private String prefix = "system/jiaowutotalcoursemain";

    @Autowired
    private ITbTotalCourseMainService tbTotalCourseMainService;

    @RequiresPermissions("website:totalcourse:view")
    @GetMapping()
    public String main()
    {
        return prefix + "/main";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("website:totalcourse:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbTotalCourseMain tbTotalCourseMain)
    {
        startPage();
        List<TbTotalCourseMain> list = tbTotalCourseMainService.selectTbTotalCourseMainList(tbTotalCourseMain);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("website:totalcourse:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbTotalCourseMain tbTotalCourseMain)
    {
        List<TbTotalCourseMain> list = tbTotalCourseMainService.selectTbTotalCourseMainList(tbTotalCourseMain);
        ExcelUtil<TbTotalCourseMain> util = new ExcelUtil<TbTotalCourseMain>(TbTotalCourseMain.class);
        return util.exportExcel(list, "main");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("website:totalcourse:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbTotalCourseMain tbTotalCourseMain)
    {
        return toAjax(tbTotalCourseMainService.insertTbTotalCourseMain(tbTotalCourseMain));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbTotalCourseMain tbTotalCourseMain = tbTotalCourseMainService.selectTbTotalCourseMainById(id);
        mmap.put("tbTotalCourseMain", tbTotalCourseMain);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("website:totalcourse:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbTotalCourseMain tbTotalCourseMain)
    {
        return toAjax(tbTotalCourseMainService.updateTbTotalCourseMain(tbTotalCourseMain));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("website:totalcourse:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbTotalCourseMainService.deleteTbTotalCourseMainByIds(ids));
    }
}
