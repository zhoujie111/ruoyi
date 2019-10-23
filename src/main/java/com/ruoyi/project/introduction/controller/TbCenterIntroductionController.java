package com.ruoyi.project.introduction.controller;

import java.util.List;

import com.ruoyi.project.introduction.domain.TbCenterIntroduction;
import com.ruoyi.project.introduction.service.ITbCenterIntroductionService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
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
 * @date 2019-10-22
 */
@Controller
@RequestMapping("/website/introduction")
public class TbCenterIntroductionController extends BaseController
{
    private String prefix = "system/introduction";

    @Autowired
    private ITbCenterIntroductionService tbCenterIntroductionService;

    @RequiresPermissions("website:centerintroduction:view")
    @GetMapping()
    public String introduction()
    {
        System.out.println("进入中心简介界面");
        return prefix + "/introduction";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("website:centerintroduction:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbCenterIntroduction tbCenterIntroduction)
    {
        startPage();
        List<TbCenterIntroduction> list = tbCenterIntroductionService.selectTbCenterIntroductionList(tbCenterIntroduction);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("website:centerintroduction:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbCenterIntroduction tbCenterIntroduction)
    {
        List<TbCenterIntroduction> list = tbCenterIntroductionService.selectTbCenterIntroductionList(tbCenterIntroduction);
        ExcelUtil<TbCenterIntroduction> util = new ExcelUtil<TbCenterIntroduction>(TbCenterIntroduction.class);
        return util.exportExcel(list, "introduction");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        System.out.println("进入到新增中心介绍的界面");
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("website:centerintroduction:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody TbCenterIntroduction tbCenterIntroduction)
    {
        System.out.println(tbCenterIntroduction);
        return toAjax(tbCenterIntroductionService.insertTbCenterIntroduction(tbCenterIntroduction));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbCenterIntroduction tbCenterIntroduction = tbCenterIntroductionService.selectTbCenterIntroductionById(id);
        mmap.put("tbCenterIntroduction", tbCenterIntroduction);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("website:centerintroduction:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@RequestBody TbCenterIntroduction tbCenterIntroduction)
    {
        System.out.println("保存修改....");
        return toAjax(tbCenterIntroductionService.updateTbCenterIntroduction(tbCenterIntroduction));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("website:centerintroduction:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbCenterIntroductionService.deleteTbCenterIntroductionByIds(ids));
    }
}
