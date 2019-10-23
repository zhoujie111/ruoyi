package com.ruoyi.project.management.controller;

import java.util.List;

import com.ruoyi.project.management.domain.TbWebsiteManagement;
import com.ruoyi.project.management.service.ITbWebsiteManagementService;
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
@RequestMapping("/website/management")
public class TbWebsiteManagementController extends BaseController
{
    private String prefix = "system/management";

    @Autowired
    private ITbWebsiteManagementService tbWebsiteManagementService;

    @RequiresPermissions("website:management:view")
    @GetMapping()
    public String management()
    {
        return prefix + "/management";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("website:management:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbWebsiteManagement tbWebsiteManagement)
    {
        startPage();
        List<TbWebsiteManagement> list = tbWebsiteManagementService.selectTbWebsiteManagementList(tbWebsiteManagement);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("website:management:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbWebsiteManagement tbWebsiteManagement)
    {
        List<TbWebsiteManagement> list = tbWebsiteManagementService.selectTbWebsiteManagementList(tbWebsiteManagement);
        ExcelUtil<TbWebsiteManagement> util = new ExcelUtil<TbWebsiteManagement>(TbWebsiteManagement.class);
        return util.exportExcel(list, "management");
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
    @RequiresPermissions("website:management:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody TbWebsiteManagement tbWebsiteManagement)
    {
        return toAjax(tbWebsiteManagementService.insertTbWebsiteManagement(tbWebsiteManagement));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbWebsiteManagement tbWebsiteManagement = tbWebsiteManagementService.selectTbWebsiteManagementById(id);
        mmap.put("tbWebsiteManagement", tbWebsiteManagement);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:management:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@RequestBody TbWebsiteManagement tbWebsiteManagement)
    {
        return toAjax(tbWebsiteManagementService.updateTbWebsiteManagement(tbWebsiteManagement));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("website:management:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbWebsiteManagementService.deleteTbWebsiteManagementByIds(ids));
    }
}
