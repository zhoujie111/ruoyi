package com.ruoyi.project.websiteimg.controller;

import java.io.File;
import java.io.InputStream;
import java.util.*;

import com.google.common.hash.Hashing;
import com.google.common.io.Files;
import com.ruoyi.common.utils.image.PathUtil;
import com.ruoyi.common.utils.image.UploadImage;
import com.ruoyi.project.website.mapper.WebSiteMapper;
import com.ruoyi.project.websiteimg.domain.TbWebsiteImg;
import com.ruoyi.project.websiteimg.service.ITbWebsiteImgService;
import com.ruoyi.project.websitetitle.domain.TbWebsiteTitle;
import org.apache.commons.io.FileUtils;
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
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2019-10-21
 */
@Controller
@RequestMapping("/website/img")
public class TbWebsiteImgController extends BaseController {
    private String prefix = "system/websiteimg";

    @Autowired
    private WebSiteMapper webSiteMapper;

    @Autowired
    private ITbWebsiteImgService tbWebsiteImgService;

    //文件上传
    @ResponseBody
    @RequestMapping(value = "/upload" )
    public Map<String, Object> upload(HttpServletRequest request, HttpServletResponse response,@RequestParam("file") MultipartFile file,@RequestParam(value = "id",required = false) Long id)
            throws Exception {
        System.out.println(id);
        Map<String,Object> map = new HashMap<>();
        if(id==null){
            // todo 获取输入流
            InputStream inputStream = file.getInputStream();
            // todo  获取存储图片的根路径
            String baseImagePath = PathUtil.getImageBasePath();// D:\tomcat\
            PathUtil.makeDirPath("image/upload/");
            // todo 获取图片的全名称
            String fileName = file.getOriginalFilename();
            // todo important 上传文件
            FileUtils.copyInputStreamToFile(inputStream,new File(baseImagePath+"image/upload/"+fileName));
            map.put("code",0);
            // todo 保存图片相对路径到数据库
            TbWebsiteImg img = new TbWebsiteImg();
            // 图片名称 图片存储相对路径
            String relativePath = "image/upload/"+fileName;
            img.setImageName(fileName);
            img.setUploadPath(relativePath);
            tbWebsiteImgService.insert(img);
        }else{
            // todo 获取输入流
            InputStream inputStream = file.getInputStream();
            // todo  获取存储图片的根路径
            String baseImagePath = PathUtil.getImageBasePath();// D:\tomcat\
            PathUtil.makeDirPath("image/upload/");
            // todo 获取图片的全名称
            String fileName = file.getOriginalFilename();
            // todo important 上传文件
            FileUtils.copyInputStreamToFile(inputStream,new File(baseImagePath+"image/upload/"+fileName));
            map.put("code",0);
            // 根据id更新数据库的信息src、image_name
            TbWebsiteImg img = new TbWebsiteImg();
            String relativePath = "image/upload/"+fileName;
            img.setImageName(fileName);
            img.setSrc(relativePath);
            img.setId(id);
            tbWebsiteImgService.updateTbWebsiteImg(img);
        }
        return map;
    }

    @RequiresPermissions("website:img:view")
    @GetMapping()
    public String img()
    {
        return prefix + "/img1";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("website:img:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbWebsiteImg tbWebsiteImg)
    {
        startPage();
        List<TbWebsiteImg> list = tbWebsiteImgService.selectTbWebsiteImgList(tbWebsiteImg);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("website:img:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbWebsiteImg tbWebsiteImg)
    {
        List<TbWebsiteImg> list = tbWebsiteImgService.selectTbWebsiteImgList(tbWebsiteImg);
        ExcelUtil<TbWebsiteImg> util = new ExcelUtil<TbWebsiteImg>(TbWebsiteImg.class);
        return util.exportExcel(list, "img");
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
    @RequiresPermissions("website:img:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbWebsiteImg tbWebsiteImg)
    {
        return toAjax(true);
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbWebsiteImg tbWebsiteImg = tbWebsiteImgService.selectTbWebsiteImgById(id);
        mmap.put("tbWebsiteImg", tbWebsiteImg);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("website:img:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbWebsiteImg tbWebsiteImg)
    {
        return toAjax(true);
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("website:img:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbWebsiteImgService.deleteTbWebsiteImgByIds(ids));
    }
}
