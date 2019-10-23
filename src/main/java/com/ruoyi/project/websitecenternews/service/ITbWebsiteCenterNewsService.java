package com.ruoyi.project.websitecenternews.service;

import com.ruoyi.project.websitecenternews.domain.TbWebsiteCenterNews;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2019-10-21
 */
public interface ITbWebsiteCenterNewsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TbWebsiteCenterNews selectTbWebsiteCenterNewsById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteCenterNews 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TbWebsiteCenterNews> selectTbWebsiteCenterNewsList(TbWebsiteCenterNews tbWebsiteCenterNews);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteCenterNews 【请填写功能名称】
     * @return 结果
     */
    public int insertTbWebsiteCenterNews(TbWebsiteCenterNews tbWebsiteCenterNews);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteCenterNews 【请填写功能名称】
     * @return 结果
     */
    public int updateTbWebsiteCenterNews(TbWebsiteCenterNews tbWebsiteCenterNews);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbWebsiteCenterNewsByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTbWebsiteCenterNewsById(Long id);
}
