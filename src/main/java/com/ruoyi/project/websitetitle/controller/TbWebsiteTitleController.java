package com.ruoyi.project.websitetitle.controller;


import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.project.websitetitle.domain.TbWebsiteTitle;
import com.ruoyi.project.websitetitle.service.ITbWebsiteTitleService;
import com.ruoyi.project.websitetype.domain.TbWebsiteType;
import com.ruoyi.project.websitetype.service.ITbWebsiteTypeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;

import java.util.List;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2019-10-18
 */
@Controller
@RequestMapping("/website/title")
public class TbWebsiteTitleController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(TbWebsiteTitleController.class);
    private String prefix = "system/websitetitle";


    @Autowired
    private ITbWebsiteTitleService tbWebsiteTitleService;


    @Autowired
    private ITbWebsiteTypeService iTbWebsiteTypeService;

    @RequiresPermissions("website:title:view")
    @GetMapping()
    public String title()
    {
        return prefix + "/title";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("website:title:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbWebsiteTitle tbWebsiteTitle)
    {
        startPage();
        List<TbWebsiteTitle> list = tbWebsiteTitleService.selectTbWebsiteTitleList(tbWebsiteTitle);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("website:title:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbWebsiteTitle tbWebsiteTitle)
    {
        List<TbWebsiteTitle> list = tbWebsiteTitleService.selectTbWebsiteTitleList(tbWebsiteTitle);
        ExcelUtil<TbWebsiteTitle> util = new ExcelUtil<TbWebsiteTitle>(TbWebsiteTitle.class);
        return util.exportExcel(list, "title");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        System.out.println("新增栏目标题");
        return prefix + "/add";
    }

    //todo查询出所有的栏目类型的名称
    @ModelAttribute("list")
    public List<TbWebsiteType> showWebSiteType(){
        List<TbWebsiteType> list = iTbWebsiteTypeService.selectTbWebsiteTypeList();
        return list;
    }

    /**
     * 新增保存类型、标题、以及内容！2019年10月21日10:42:14
     */
    @RequiresPermissions("website:title:add")
    @Log(title = "【栏目标题】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@RequestBody TbWebsiteTitle tbWebsiteTitle) {
        return toAjax(tbWebsiteTitleService.insertTbWebsiteTitle(tbWebsiteTitle));
    }



    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        TbWebsiteTitle tbWebsiteTitle = tbWebsiteTitleService.selectTbWebsiteTitleById(id);
        mmap.put("tbWebsiteTitle", tbWebsiteTitle);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("website:title:edit")
    @Log(title = "【栏目标题】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@RequestBody TbWebsiteTitle tbWebsiteTitle) {
        System.out.println(tbWebsiteTitle);
        return toAjax(tbWebsiteTitleService.updateTbWebsiteTitle(tbWebsiteTitle));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("website:title:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbWebsiteTitleService.deleteTbWebsiteTitleByIds(ids));
    }
}
