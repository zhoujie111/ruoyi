package com.ruoyi.project.jiaowu.kaikeplan.controller;

import java.util.List;

import com.ruoyi.project.jiaowu.kaikeplan.domain.TbKaikePlan;
import com.ruoyi.project.jiaowu.kaikeplan.service.ITbKaikePlanService;
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
 * 开课计划Controller
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
@Controller
@RequestMapping("/website/kaikeplan")
public class TbKaikePlanController extends BaseController
{
    private String prefix = "system/jiaowukaikeplan";

    @Autowired
    private ITbKaikePlanService tbKaikePlanService;

    @RequiresPermissions("website:kaikeplan:view")
    @GetMapping()
    public String plan()
    {
        return prefix + "/plan";
    }

    /**
     * 查询开课计划列表
     */
    @RequiresPermissions("website:kaikeplan:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbKaikePlan tbKaikePlan)
    {
        startPage();
        List<TbKaikePlan> list = tbKaikePlanService.selectTbKaikePlanList(tbKaikePlan);
        return getDataTable(list);
    }

    /**
     * 导出开课计划列表
     */
    @RequiresPermissions("website:kaikeplan:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbKaikePlan tbKaikePlan)
    {
        List<TbKaikePlan> list = tbKaikePlanService.selectTbKaikePlanList(tbKaikePlan);
        ExcelUtil<TbKaikePlan> util = new ExcelUtil<TbKaikePlan>(TbKaikePlan.class);
        return util.exportExcel(list, "plan");
    }

    /**
     * 新增开课计划
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存开课计划
     */
    @RequiresPermissions("website:kaikeplan:add")
    @Log(title = "开课计划", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbKaikePlan tbKaikePlan)
    {
        return toAjax(tbKaikePlanService.insertTbKaikePlan(tbKaikePlan));
    }

    /**
     * 修改开课计划
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbKaikePlan tbKaikePlan = tbKaikePlanService.selectTbKaikePlanById(id);
        mmap.put("tbKaikePlan", tbKaikePlan);
        return prefix + "/edit";
    }

    /**
     * 修改保存开课计划
     */
    @RequiresPermissions("website:kaikeplan:edit")
    @Log(title = "开课计划", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbKaikePlan tbKaikePlan)
    {
        return toAjax(tbKaikePlanService.updateTbKaikePlan(tbKaikePlan));
    }

    /**
     * 删除开课计划
     */
    @RequiresPermissions("website:kaikeplan:remove")
    @Log(title = "开课计划", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbKaikePlanService.deleteTbKaikePlanByIds(ids));
    }
}
