package com.ruoyi.project.jiaowu.kaikecheck.controller;

import java.util.List;

import com.ruoyi.project.jiaowu.kaikecheck.domain.TbKaikeCheck;
import com.ruoyi.project.jiaowu.kaikecheck.service.ITbKaikeCheckService;
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
 * 开课审核Controller
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
@Controller
@RequestMapping("/website/kaikecheck")
public class TbKaikeCheckController extends BaseController
{
    private String prefix = "system/jiaowukaikeplancheck";

    @Autowired
    private ITbKaikeCheckService tbKaikeCheckService;

    @RequiresPermissions("website:kaikecheck:view")
    @GetMapping()
    public String check()
    {
        return prefix + "/check";
    }

    /**
     * 查询开课审核列表
     */
    @RequiresPermissions("website:kaikecheck:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbKaikeCheck tbKaikeCheck)
    {
        startPage();
        List<TbKaikeCheck> list = tbKaikeCheckService.selectTbKaikeCheckList(tbKaikeCheck);
        return getDataTable(list);
    }

    /**
     * 导出开课审核列表
     */
    @RequiresPermissions("website:kaikecheck:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbKaikeCheck tbKaikeCheck)
    {
        List<TbKaikeCheck> list = tbKaikeCheckService.selectTbKaikeCheckList(tbKaikeCheck);
        ExcelUtil<TbKaikeCheck> util = new ExcelUtil<TbKaikeCheck>(TbKaikeCheck.class);
        return util.exportExcel(list, "check");
    }

    /**
     * 新增开课审核
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存开课审核
     */
    @RequiresPermissions("website:kaikecheck:add")
    @Log(title = "开课审核", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbKaikeCheck tbKaikeCheck)
    {
        return toAjax(tbKaikeCheckService.insertTbKaikeCheck(tbKaikeCheck));
    }

    /**
     * 修改开课审核
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbKaikeCheck tbKaikeCheck = tbKaikeCheckService.selectTbKaikeCheckById(id);
        mmap.put("tbKaikeCheck", tbKaikeCheck);
        return prefix + "/edit";
    }

    /**
     * 修改保存开课审核
     */
    @RequiresPermissions("website:kaikecheck:edit")
    @Log(title = "开课审核", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbKaikeCheck tbKaikeCheck)
    {
        return toAjax(tbKaikeCheckService.updateTbKaikeCheck(tbKaikeCheck));
    }

    /**
     * 删除开课审核
     */
    @RequiresPermissions("website:kaikecheck:remove")
    @Log(title = "开课审核", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbKaikeCheckService.deleteTbKaikeCheckByIds(ids));
    }
}
