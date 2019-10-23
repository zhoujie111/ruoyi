package com.ruoyi.project.websitecenternews.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.websitecenternews.domain.TbWebsiteCenterNews;
import com.ruoyi.project.websitecenternews.mapper.TbWebsiteCenterNewsMapper;
import com.ruoyi.project.websitecenternews.service.ITbWebsiteCenterNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-10-21
 */
@Service
public class TbWebsiteCenterNewsServiceImpl implements ITbWebsiteCenterNewsService
{
    @Autowired
    private TbWebsiteCenterNewsMapper tbWebsiteCenterNewsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TbWebsiteCenterNews selectTbWebsiteCenterNewsById(Long id)
    {
        return tbWebsiteCenterNewsMapper.selectTbWebsiteCenterNewsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteCenterNews 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TbWebsiteCenterNews> selectTbWebsiteCenterNewsList(TbWebsiteCenterNews tbWebsiteCenterNews)
    {
        return tbWebsiteCenterNewsMapper.selectTbWebsiteCenterNewsList(tbWebsiteCenterNews);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteCenterNews 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTbWebsiteCenterNews(TbWebsiteCenterNews tbWebsiteCenterNews)
    {
        tbWebsiteCenterNews.setCreateTime(DateUtils.getNowDate());
        return tbWebsiteCenterNewsMapper.insertTbWebsiteCenterNews(tbWebsiteCenterNews);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteCenterNews 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTbWebsiteCenterNews(TbWebsiteCenterNews tbWebsiteCenterNews)
    {
        tbWebsiteCenterNews.setUpdateTime(DateUtils.getNowDate());
        return tbWebsiteCenterNewsMapper.updateTbWebsiteCenterNews(tbWebsiteCenterNews);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteCenterNewsByIds(String ids)
    {
        return tbWebsiteCenterNewsMapper.deleteTbWebsiteCenterNewsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteCenterNewsById(Long id)
    {
        return tbWebsiteCenterNewsMapper.deleteTbWebsiteCenterNewsById(id);
    }
}
