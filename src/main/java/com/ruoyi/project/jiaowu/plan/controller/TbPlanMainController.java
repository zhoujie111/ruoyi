package com.ruoyi.project.jiaowu.plan.controller;

import java.util.List;

import com.ruoyi.project.jiaowu.plan.domain.TbPlanMain;
import com.ruoyi.project.jiaowu.plan.service.ITbPlanMainService;
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
@RequestMapping("/website/trainplan")
public class TbPlanMainController extends BaseController
{
    private String prefix = "system/jiaowuplan";

    @Autowired
    private ITbPlanMainService tbPlanMainService;

    @RequiresPermissions("website:trainplan:view")
    @GetMapping()
    public String main()
    {
        return prefix + "/main";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("website:trainplan:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbPlanMain tbPlanMain)
    {
        startPage();
        List<TbPlanMain> list = tbPlanMainService.selectTbPlanMainList(tbPlanMain);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("website:trainplan:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbPlanMain tbPlanMain)
    {
        List<TbPlanMain> list = tbPlanMainService.selectTbPlanMainList(tbPlanMain);
        ExcelUtil<TbPlanMain> util = new ExcelUtil<TbPlanMain>(TbPlanMain.class);
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
    @RequiresPermissions("website:trainplan:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbPlanMain tbPlanMain)
    {
        return toAjax(tbPlanMainService.insertTbPlanMain(tbPlanMain));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbPlanMain tbPlanMain = tbPlanMainService.selectTbPlanMainById(id);
        mmap.put("tbPlanMain", tbPlanMain);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("website:trainplan:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbPlanMain tbPlanMain)
    {
        return toAjax(tbPlanMainService.updateTbPlanMain(tbPlanMain));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("website:trainplan:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbPlanMainService.deleteTbPlanMainByIds(ids));
    }
}
