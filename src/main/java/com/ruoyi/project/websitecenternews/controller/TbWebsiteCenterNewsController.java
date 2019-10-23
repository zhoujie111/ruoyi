package com.ruoyi.project.websitecenternews.controller;

import java.util.List;

import com.ruoyi.project.websitecenternews.domain.TbWebsiteCenterNews;
import com.ruoyi.project.websitecenternews.service.ITbWebsiteCenterNewsService;
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
 * @date 2019-10-21
 */
@Controller
@RequestMapping("/website/centernews")
public class TbWebsiteCenterNewsController extends BaseController
{
    private String prefix = "system/websitecenternews";

    @Autowired
    private ITbWebsiteCenterNewsService tbWebsiteCenterNewsService;

    @RequiresPermissions("website:centernews:view")
    @GetMapping()
    public String news()
    {
        return prefix + "/news";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("website:centernews:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbWebsiteCenterNews tbWebsiteCenterNews)
    {
        startPage();
        List<TbWebsiteCenterNews> list = tbWebsiteCenterNewsService.selectTbWebsiteCenterNewsList(tbWebsiteCenterNews);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("website:centernews:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbWebsiteCenterNews tbWebsiteCenterNews)
    {
        List<TbWebsiteCenterNews> list = tbWebsiteCenterNewsService.selectTbWebsiteCenterNewsList(tbWebsiteCenterNews);
        ExcelUtil<TbWebsiteCenterNews> util = new ExcelUtil<TbWebsiteCenterNews>(TbWebsiteCenterNews.class);
        return util.exportExcel(list, "news");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        System.out.println("123");
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("website:centernews:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbWebsiteCenterNews tbWebsiteCenterNews)
    {
        return toAjax(tbWebsiteCenterNewsService.insertTbWebsiteCenterNews(tbWebsiteCenterNews));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbWebsiteCenterNews tbWebsiteCenterNews = tbWebsiteCenterNewsService.selectTbWebsiteCenterNewsById(id);
        mmap.put("tbWebsiteCenterNews", tbWebsiteCenterNews);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("website:centernews:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbWebsiteCenterNews tbWebsiteCenterNews)
    {
        return toAjax(tbWebsiteCenterNewsService.updateTbWebsiteCenterNews(tbWebsiteCenterNews));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("website:centernews:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbWebsiteCenterNewsService.deleteTbWebsiteCenterNewsByIds(ids));
    }
}
