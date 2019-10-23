package com.ruoyi.project.teachfeature.controller;

import java.util.List;

import com.ruoyi.project.teachfeature.domain.TbWebsiteTeachingFeature;
import com.ruoyi.project.teachfeature.service.ITbWebsiteTeachingFeatureService;
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
@RequestMapping("/website/teach/feature")
public class TbWebsiteTeachingFeatureController extends BaseController
{
    private String prefix = "system/feature";

    @Autowired
    private ITbWebsiteTeachingFeatureService tbWebsiteTeachingFeatureService;

    @RequiresPermissions("website:teachfeature:view")
    @GetMapping()
    public String feature()
    {
        return prefix + "/feature";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("website:teachfeature:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbWebsiteTeachingFeature tbWebsiteTeachingFeature)
    {
        startPage();
        List<TbWebsiteTeachingFeature> list = tbWebsiteTeachingFeatureService.selectTbWebsiteTeachingFeatureList(tbWebsiteTeachingFeature);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("website:teachfeature:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbWebsiteTeachingFeature tbWebsiteTeachingFeature)
    {
        List<TbWebsiteTeachingFeature> list = tbWebsiteTeachingFeatureService.selectTbWebsiteTeachingFeatureList(tbWebsiteTeachingFeature);
        ExcelUtil<TbWebsiteTeachingFeature> util = new ExcelUtil<TbWebsiteTeachingFeature>(TbWebsiteTeachingFeature.class);
        return util.exportExcel(list, "feature");
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
    @RequiresPermissions("website:teachfeature:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody TbWebsiteTeachingFeature tbWebsiteTeachingFeature)
    {
        return toAjax(tbWebsiteTeachingFeatureService.insertTbWebsiteTeachingFeature(tbWebsiteTeachingFeature));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbWebsiteTeachingFeature tbWebsiteTeachingFeature = tbWebsiteTeachingFeatureService.selectTbWebsiteTeachingFeatureById(id);
        mmap.put("tbWebsiteTeachingFeature", tbWebsiteTeachingFeature);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("website:teachfeature:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@RequestBody TbWebsiteTeachingFeature tbWebsiteTeachingFeature)
    {
        return toAjax(tbWebsiteTeachingFeatureService.updateTbWebsiteTeachingFeature(tbWebsiteTeachingFeature));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("website:teachfeature:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbWebsiteTeachingFeatureService.deleteTbWebsiteTeachingFeatureByIds(ids));
    }
}
