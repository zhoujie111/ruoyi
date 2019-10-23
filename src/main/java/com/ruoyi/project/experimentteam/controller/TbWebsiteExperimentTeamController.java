package com.ruoyi.project.experimentteam.controller;

import java.util.List;

import com.ruoyi.project.experimentteam.domain.TbWebsiteExperimentTeam;
import com.ruoyi.project.experimentteam.service.ITbWebsiteExperimentTeamService;
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
@RequestMapping("/website/experiment/team")
public class TbWebsiteExperimentTeamController extends BaseController
{
    private String prefix = "system/experimentteam";

    @Autowired
    private ITbWebsiteExperimentTeamService tbWebsiteExperimentTeamService;

    @RequiresPermissions("website:experimentteam:view")
    @GetMapping()
    public String team()
    {
        return prefix + "/team";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("website:experimentteam:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbWebsiteExperimentTeam tbWebsiteExperimentTeam)
    {
        startPage();
        List<TbWebsiteExperimentTeam> list = tbWebsiteExperimentTeamService.selectTbWebsiteExperimentTeamList(tbWebsiteExperimentTeam);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("website:experimentteam:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbWebsiteExperimentTeam tbWebsiteExperimentTeam)
    {
        List<TbWebsiteExperimentTeam> list = tbWebsiteExperimentTeamService.selectTbWebsiteExperimentTeamList(tbWebsiteExperimentTeam);
        ExcelUtil<TbWebsiteExperimentTeam> util = new ExcelUtil<TbWebsiteExperimentTeam>(TbWebsiteExperimentTeam.class);
        return util.exportExcel(list, "team");
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
    @RequiresPermissions("website:experimentteam:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody TbWebsiteExperimentTeam tbWebsiteExperimentTeam)
    {
        return toAjax(tbWebsiteExperimentTeamService.insertTbWebsiteExperimentTeam(tbWebsiteExperimentTeam));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbWebsiteExperimentTeam tbWebsiteExperimentTeam = tbWebsiteExperimentTeamService.selectTbWebsiteExperimentTeamById(id);
        mmap.put("tbWebsiteExperimentTeam", tbWebsiteExperimentTeam);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("website:experimentteam:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@RequestBody TbWebsiteExperimentTeam tbWebsiteExperimentTeam)
    {
        return toAjax(tbWebsiteExperimentTeamService.updateTbWebsiteExperimentTeam(tbWebsiteExperimentTeam));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("website:experimentteam:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbWebsiteExperimentTeamService.deleteTbWebsiteExperimentTeamByIds(ids));
    }
}
