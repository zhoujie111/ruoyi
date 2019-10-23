package com.ruoyi.project.teachfeature.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.teachfeature.domain.TbWebsiteTeachingFeature;
import com.ruoyi.project.teachfeature.mapper.TbWebsiteTeachingFeatureMapper;
import com.ruoyi.project.teachfeature.service.ITbWebsiteTeachingFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-10-22
 */
@Service
public class TbWebsiteTeachingFeatureServiceImpl implements ITbWebsiteTeachingFeatureService
{
    @Autowired
    private TbWebsiteTeachingFeatureMapper tbWebsiteTeachingFeatureMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TbWebsiteTeachingFeature selectTbWebsiteTeachingFeatureById(Long id)
    {
        return tbWebsiteTeachingFeatureMapper.selectTbWebsiteTeachingFeatureById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteTeachingFeature 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TbWebsiteTeachingFeature> selectTbWebsiteTeachingFeatureList(TbWebsiteTeachingFeature tbWebsiteTeachingFeature)
    {
        return tbWebsiteTeachingFeatureMapper.selectTbWebsiteTeachingFeatureList(tbWebsiteTeachingFeature);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteTeachingFeature 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTbWebsiteTeachingFeature(TbWebsiteTeachingFeature tbWebsiteTeachingFeature)
    {
        tbWebsiteTeachingFeature.setCreateTime(DateUtils.getNowDate());
        return tbWebsiteTeachingFeatureMapper.insertTbWebsiteTeachingFeature(tbWebsiteTeachingFeature);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteTeachingFeature 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTbWebsiteTeachingFeature(TbWebsiteTeachingFeature tbWebsiteTeachingFeature)
    {
        tbWebsiteTeachingFeature.setUpdateTime(DateUtils.getNowDate());
        return tbWebsiteTeachingFeatureMapper.updateTbWebsiteTeachingFeature(tbWebsiteTeachingFeature);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteTeachingFeatureByIds(String ids)
    {
        return tbWebsiteTeachingFeatureMapper.deleteTbWebsiteTeachingFeatureByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteTeachingFeatureById(Long id)
    {
        return tbWebsiteTeachingFeatureMapper.deleteTbWebsiteTeachingFeatureById(id);
    }
}
