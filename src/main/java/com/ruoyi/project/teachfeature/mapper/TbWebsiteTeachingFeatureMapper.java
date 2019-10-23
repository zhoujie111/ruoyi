package com.ruoyi.project.teachfeature.mapper;

import com.ruoyi.project.teachfeature.domain.TbWebsiteTeachingFeature;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2019-10-22
 */
public interface TbWebsiteTeachingFeatureMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TbWebsiteTeachingFeature selectTbWebsiteTeachingFeatureById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteTeachingFeature 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TbWebsiteTeachingFeature> selectTbWebsiteTeachingFeatureList(TbWebsiteTeachingFeature tbWebsiteTeachingFeature);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteTeachingFeature 【请填写功能名称】
     * @return 结果
     */
    public int insertTbWebsiteTeachingFeature(TbWebsiteTeachingFeature tbWebsiteTeachingFeature);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteTeachingFeature 【请填写功能名称】
     * @return 结果
     */
    public int updateTbWebsiteTeachingFeature(TbWebsiteTeachingFeature tbWebsiteTeachingFeature);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTbWebsiteTeachingFeatureById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbWebsiteTeachingFeatureByIds(String[] ids);

    TbWebsiteTeachingFeature selectTbTeachFeature();
}
