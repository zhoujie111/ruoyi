package com.ruoyi.project.centeradvice.controller;

import java.util.List;

import com.ruoyi.project.centeradvice.domain.TbWebsiteCenterAdvice;
import com.ruoyi.project.centeradvice.service.ITbWebsiteCenterAdviceService;
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
@RequestMapping("/website/center/advice")
public class TbWebsiteCenterAdviceController extends BaseController
{
    private String prefix = "system/centeradvice";

    @Autowired
    private ITbWebsiteCenterAdviceService tbWebsiteCenterAdviceService;

    @RequiresPermissions("website:centeradvice:view")
    @GetMapping()
    public String advice()
    {
        return prefix + "/advice";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("website:centeradvice:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbWebsiteCenterAdvice tbWebsiteCenterAdvice)
    {
        startPage();
        List<TbWebsiteCenterAdvice> list = tbWebsiteCenterAdviceService.selectTbWebsiteCenterAdviceList(tbWebsiteCenterAdvice);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("website:centeradvice:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbWebsiteCenterAdvice tbWebsiteCenterAdvice)
    {
        List<TbWebsiteCenterAdvice> list = tbWebsiteCenterAdviceService.selectTbWebsiteCenterAdviceList(tbWebsiteCenterAdvice);
        ExcelUtil<TbWebsiteCenterAdvice> util = new ExcelUtil<TbWebsiteCenterAdvice>(TbWebsiteCenterAdvice.class);
        return util.exportExcel(list, "advice");
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
    @RequiresPermissions("website:centeradvice:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody TbWebsiteCenterAdvice tbWebsiteCenterAdvice)
    {
        return toAjax(tbWebsiteCenterAdviceService.insertTbWebsiteCenterAdvice(tbWebsiteCenterAdvice));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbWebsiteCenterAdvice tbWebsiteCenterAdvice = tbWebsiteCenterAdviceService.selectTbWebsiteCenterAdviceById(id);
        mmap.put("tbWebsiteCenterAdvice", tbWebsiteCenterAdvice);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("website:centeradvice:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@RequestBody TbWebsiteCenterAdvice tbWebsiteCenterAdvice)
    {
        return toAjax(tbWebsiteCenterAdviceService.updateTbWebsiteCenterAdvice(tbWebsiteCenterAdvice));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("website:centeradvice:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbWebsiteCenterAdviceService.deleteTbWebsiteCenterAdviceByIds(ids));
    }
}
