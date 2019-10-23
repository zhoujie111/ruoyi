package com.ruoyi.project.experimentteach.controller;

import java.util.List;

import com.ruoyi.project.experimentteach.domain.TbExperimentTeach;
import com.ruoyi.project.experimentteach.service.ITbExperimentTeachService;
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
@RequestMapping("/website/experiment/teach")
public class TbExperimentTeachController extends BaseController
{
    private String prefix = "system/experimentteach";

    @Autowired
    private ITbExperimentTeachService tbExperimentTeachService;

    @RequiresPermissions("website:experimentteach:view")
    @GetMapping()
    public String teach()
    {
        return prefix + "/teach";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("website:experimentteach:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbExperimentTeach tbExperimentTeach)
    {
        startPage();
        List<TbExperimentTeach> list = tbExperimentTeachService.selectTbExperimentTeachList(tbExperimentTeach);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("website:experimentteach:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbExperimentTeach tbExperimentTeach)
    {
        List<TbExperimentTeach> list = tbExperimentTeachService.selectTbExperimentTeachList(tbExperimentTeach);
        ExcelUtil<TbExperimentTeach> util = new ExcelUtil<TbExperimentTeach>(TbExperimentTeach.class);
        return util.exportExcel(list, "teach");
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
    @RequiresPermissions("website:experimentteach:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody TbExperimentTeach tbExperimentTeach)
    {
        return toAjax(tbExperimentTeachService.insertTbExperimentTeach(tbExperimentTeach));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbExperimentTeach tbExperimentTeach = tbExperimentTeachService.selectTbExperimentTeachById(id);
        mmap.put("tbExperimentTeach", tbExperimentTeach);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("website:experimentteach:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@RequestBody TbExperimentTeach tbExperimentTeach)
    {
        return toAjax(tbExperimentTeachService.updateTbExperimentTeach(tbExperimentTeach));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("website:experimentteach:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbExperimentTeachService.deleteTbExperimentTeachByIds(ids));
    }
}
