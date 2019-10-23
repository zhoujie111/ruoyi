package com.ruoyi.project.lab.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.utils.security.ShiroUtils;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.lab.domain.Lab;
import com.ruoyi.project.lab.service.LabService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/lab")
public class LabController extends BaseController {

    @Autowired
    private LabService labService;

    private String prefix = "system/lab";

    @RequiresPermissions("lab:view")
    @GetMapping()
    public String dept()
    {
        return prefix + "/lab";
    }

    @RequiresPermissions("lab:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Lab lab) {
        System.out.println("post请求进入...");
//        List<Lab> labList = deptService.selectDeptList(dept);
//        return deptList;
        startPage();
        List<Lab> list = labService.selectlabList(lab);
        System.out.println(list);
        return getDataTable(list);
    }

    /**
     * 进入新增实验室页面
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增测试框架数据
     */
    @RequiresPermissions("lab:add")
    @Log(title = "实验室管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(@Validated Lab lab) {
        System.out.println("获取新增实验室数据的请求"+lab);
        //todo 如何获取当前用户（创建实验室的）
        lab.setLabCreater(ShiroUtils.getSysUser().getUserName());
        return toAjax(labService.insertLab(lab));
    }

    /**
     * 导出test列表
     */
    @Log(title = "实验室管理", businessType = BusinessType.EXPORT)
    @RequiresPermissions("lab:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Lab lab)
    {
        List<Lab> list = labService.selectlabList(lab);
        ExcelUtil<Lab> util = new ExcelUtil<Lab>(Lab.class);
        return util.exportExcel(list, "实验室管理");
    }

    @RequiresPermissions("lab:remove")
    @Log(title = "实验室管理", businessType = BusinessType.DELETE)
    @PostMapping("/removeAll")
    @ResponseBody
    public AjaxResult removeAll(String ids) {
        try {
            return toAjax(labService.deleteById(ids));
        }
        catch (Exception e) {
            return error(e.getMessage());
        }
    }

    /**
     * 修改实验数据
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Lab lab = labService.selectLabById(id);
        mmap.put("lab", lab);
        return prefix + "/edit";
    }

    /**
     * 修改保存实验数据
     */
    @RequiresPermissions("system:role:edit")
    @Log(title = "实验室管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@Validated Lab lab) {
        System.out.println("修改实验数据的post请求到达"+lab);
        return toAjax(labService.updateLab(lab));
    }

}
