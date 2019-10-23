package com.ruoyi.project.jiaowu.term.controller;

import java.util.List;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.project.jiaowu.term.domain.TbTerm;
import com.ruoyi.project.jiaowu.term.service.ITbTermService;
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
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 学期设置Controller
 * 
 * @author zhoujie
 * @date 2019-10-23
 */
@Controller
@RequestMapping("/website/term")
public class TbTermController extends BaseController
{
    private String prefix = "system/jiaowuterm";

    @Autowired
    private ITbTermService tbTermService;

    @RequiresPermissions("website:term:view")
    @GetMapping()
    public String term()
    {
        System.out.println("学期设置请求进入到这里");
        return prefix + "/term";
    }

    /**
     * 查询学期设置列表
     */
    @RequiresPermissions("website:term:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbTerm tbTerm)
    {
        startPage();
        List<TbTerm> list = tbTermService.selectTbTermList(tbTerm);
        return getDataTable(list);
    }

    /**
     * 导出学期设置列表
     */
    @RequiresPermissions("website:term:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbTerm tbTerm)
    {
        List<TbTerm> list = tbTermService.selectTbTermList(tbTerm);
        ExcelUtil<TbTerm> util = new ExcelUtil<TbTerm>(TbTerm.class);
        return util.exportExcel(list, "term");
    }

    /**
     * 新增学期设置
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学期设置
     */
    @RequiresPermissions("website:term:add")
    @Log(title = "学期设置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbTerm tbTerm)
    {
        return toAjax(tbTermService.insertTbTerm(tbTerm));
    }

    /**
     * 修改学期设置
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbTerm tbTerm = tbTermService.selectTbTermById(id);
        mmap.put("tbTerm", tbTerm);
        return prefix + "/edit";
    }

    /**
     * 修改保存学期设置
     */
    @RequiresPermissions("website:term:edit")
    @Log(title = "学期设置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbTerm tbTerm)
    {
        return toAjax(tbTermService.updateTbTerm(tbTerm));
    }

    /**
     * 删除学期设置
     */
    @RequiresPermissions("website:term:remove")
    @Log(title = "学期设置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbTermService.deleteTbTermByIds(ids));
    }
}
