package com.ruoyi.project.websitetype.controller;

import java.util.List;

import com.ruoyi.project.websitetype.domain.TbWebsiteType;
import com.ruoyi.project.websitetype.service.ITbWebsiteTypeService;
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
 * @date 2019-10-18
 */
@Controller
@RequestMapping("/website/type")
public class TbWebsiteTypeController extends BaseController
{
    private String prefix = "system/websitetype";

    @Autowired
    private ITbWebsiteTypeService tbWebsiteTypeService;

    @RequiresPermissions("website:type:view")
    @GetMapping()
    public String type()
    {
        return prefix + "/type";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("website:type:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbWebsiteType tbWebsiteType)
    {
        startPage();
        List<TbWebsiteType> list = tbWebsiteTypeService.selectTbWebsiteTypeList(tbWebsiteType);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:type:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbWebsiteType tbWebsiteType)
    {
        List<TbWebsiteType> list = tbWebsiteTypeService.selectTbWebsiteTypeList(tbWebsiteType);
        ExcelUtil<TbWebsiteType> util = new ExcelUtil<TbWebsiteType>(TbWebsiteType.class);
        return util.exportExcel(list, "type");
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
    @RequiresPermissions("website:type:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbWebsiteType tbWebsiteType)
    {
        return toAjax(tbWebsiteTypeService.insertTbWebsiteType(tbWebsiteType));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbWebsiteType tbWebsiteType = tbWebsiteTypeService.selectTbWebsiteTypeById(id);
        mmap.put("tbWebsiteType", tbWebsiteType);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:type:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbWebsiteType tbWebsiteType)
    {
        return toAjax(tbWebsiteTypeService.updateTbWebsiteType(tbWebsiteType));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:type:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbWebsiteTypeService.deleteTbWebsiteTypeByIds(ids));
    }
}
