package com.ruoyi.project.website.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruoyi.project.centeradvice.mapper.TbWebsiteCenterAdviceMapper;
import com.ruoyi.project.experimentteach.mapper.TbExperimentTeachMapper;
import com.ruoyi.project.experimentteam.mapper.TbWebsiteExperimentTeamMapper;
import com.ruoyi.project.introduction.mapper.TbCenterIntroductionMapper;
import com.ruoyi.project.management.domain.TbWebsiteManagement;
import com.ruoyi.project.management.mapper.TbWebsiteManagementMapper;
import com.ruoyi.project.teachfeature.mapper.TbWebsiteTeachingFeatureMapper;
import com.ruoyi.project.website.domain.BackToFrontSite;
import com.ruoyi.project.website.domain.WebSiteVo;
import com.ruoyi.project.website.mapper.WebSiteMapper;
import com.ruoyi.project.websitecenternews.mapper.TbWebsiteCenterNewsMapper;
import com.ruoyi.project.websiteimg.mapper.TbWebsiteImgMapper;
import com.ruoyi.project.websitetype.domain.TbWebsiteType;
import com.ruoyi.project.websitetype.service.ITbWebsiteTypeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 内容管理
 */
@Controller
@RequestMapping("/website")
@CrossOrigin
//解决跨越访问问题
public class WebSiteContentController{

    @Autowired
    private TbWebsiteCenterAdviceMapper tbWebsiteCenterAdviceMapper;

    @Autowired
    private TbWebsiteTeachingFeatureMapper tbWebsiteTeachingFeatureMapper;

    @Autowired
    private TbWebsiteManagementMapper tbWebsiteManagementMapper;

    @Autowired
    private TbWebsiteExperimentTeamMapper tbWebsiteExperimentTeamMapper;

    @Autowired
    private TbExperimentTeachMapper tbExperimentTeachMapper;

    @Autowired
    private TbCenterIntroductionMapper tbCenterIntroductionMapper;

    @Autowired
    private TbWebsiteImgMapper tbWebsiteImgMapper;

    @Autowired
    private WebSiteMapper webSiteMapper;

    @Autowired
    private TbWebsiteCenterNewsMapper tbWebsiteCenterNewsMapper;

    @Autowired
    private ITbWebsiteTypeService iTbWebsiteTypeService;

    private String prefix = "system/website";

    @RequiresPermissions("website:content:view")
    @GetMapping()
    public String show(Model model) {
        List<TbWebsiteType> list = iTbWebsiteTypeService.selectTbWebsiteTypeList();
        model.addAttribute("list1",list);
        return prefix + "/website";
    }

    /**
     * 新增
     */
    @PostMapping("/add")
    @ResponseBody
    public Map<String,Object> add(@RequestBody WebSiteVo webSiteVo){
        System.out.println(webSiteVo);
        Map<String,Object> map = new HashMap<>();
        int result = webSiteMapper.insert(webSiteVo);
        if(result > 0){
            map.put("status",0);
        }else {
            map.put("status",1);
        }
        return map;
    }

    /**
     * 提供给门户网站接口
     * 根据分类id查询最新的[10]个标题 ******************测试OK*************门户网站
     */
    @ResponseBody
    @PostMapping("/findByTypeIdTen")
    public List<BackToFrontSite> findTitleByWebsiteId(@RequestBody BackToFrontSite websiteType){
        List<BackToFrontSite> list = webSiteMapper.findTitleByWebsiteId(websiteType);
        return list;
    }

    /**
     *
     * @param websiteType
     * @param pageSize
     * @param pageNum
     * 分页根据类型id显示所有的标题 测试OK********************************************门户网站
     * @return
     */
    @ResponseBody
    @PostMapping("/findByTypeId")
    public PageInfo<BackToFrontSite> findTitleByWebsiteId(@RequestBody BackToFrontSite websiteType,Integer pageSize,Integer pageNum){
        System.out.println("根据类型id查找数据ID："+websiteType);
        if(ObjectUtils.isEmpty(pageNum)){
            pageNum = 1;
        }
        PageHelper.startPage(pageNum,pageSize);
        List<BackToFrontSite> list =  webSiteMapper.findTitleByPageWebsiteId(websiteType);
        PageInfo<BackToFrontSite> pageInfo = new PageInfo<BackToFrontSite>(list);
        return pageInfo;
    }

    /**
     * 根据标题id显示内容和标题title****************测试OK****************************门户网站
     */
    @ResponseBody
    @PostMapping("/findContentByTitleId")
    public Map<String,Object> findContentByTitleId(@RequestBody BackToFrontSite id){
        Map<String,Object> map = new HashMap<>();
        BackToFrontSite backToFrontSite = webSiteMapper.findContentByTitleId(id);
        map.put("data",backToFrontSite.getContent());
        map.put("webSiteTitleName",backToFrontSite.getWebSiteTitleName());
        return map;
    }

    /**
     * ====================显示门户网站 中心新闻  测试OK==================================================
     */
    @ResponseBody
    @GetMapping("/findCenterNews")
    public Map<String,Object> findCenterNews(){
        Map<String,Object> map = new HashMap<>();
        String data = tbWebsiteCenterNewsMapper.findCenterNews().getCenterNews();
        map.put("data",data);
        return map;
    }

    /**
     * =======================显示最近上传的4张图片 ==================================
     */
    @ResponseBody
    @GetMapping("/findRecentFour")
    public List<String> findRecentFour(){
        Map<String,Object> map = new HashMap<>();
        List list = tbWebsiteImgMapper.findRecentFour();
        System.out.println(list);
        return list;
    }

    /**
     * ====================显示中心简介=================================================
     */
    @ResponseBody
    @GetMapping("/findCenterIntr")
    public Map<String,Object> findCenterIntr(){
        Map<String,Object> map = new HashMap<>();
        String data = tbCenterIntroductionMapper.selectTbCenterIntroduction().getCenterIntroduction();
        map.put("data",data);
        return map;
    }

    /**
     * 显示实验教学
     */
    @ResponseBody
    @GetMapping("/findExperimentTeach")
    public Map<String,Object> findExperimentTeach(){
        Map<String,Object> map = new HashMap<>();
        String data = tbExperimentTeachMapper.selectTbExperimentTeach().getExperimentTeach();
        map.put("data",data);
        return map;
    }

    /**
     * 显示实验队伍
     */
    @ResponseBody
    @GetMapping("/findExperimentTeam")
    public Map<String,Object> findExperimentTeam(){
        Map<String,Object> map = new HashMap<>();
        String data = tbWebsiteExperimentTeamMapper.selectTbExperimentTeam().getExperimentTeam();
        map.put("data",data);
        return map;
    }

    /**
     * 管理体系
     */
    @ResponseBody
    @GetMapping("/findManagement")
    public Map<String,Object> findManagement(){
        Map<String,Object> map = new HashMap<>();
        String data = tbWebsiteManagementMapper.selectTbManagement().getManagement();
        map.put("data",data);
        return map;
    }

    /**
     * 教学特色
     */
    @ResponseBody
    @GetMapping("/findTeachFeature")
    public Map<String,Object> findTeachFeature(){
        Map<String,Object> map = new HashMap<>();
        String data = tbWebsiteTeachingFeatureMapper.selectTbTeachFeature().getTeachingFeature();
        map.put("data",data);
        return map;
    }

    /**
     * 中心公告
     */
    @ResponseBody
    @GetMapping("/findCenterAdvice")
    public Map<String,Object> findCenterAdvice(){
        Map<String,Object> map = new HashMap<>();
        String data = tbWebsiteCenterAdviceMapper.selectTbCenterAdvice().getCenterAdvice();
        map.put("data",data);
        return map;
    }

}
