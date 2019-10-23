package com.ruoyi.project.introduction.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.introduction.domain.TbCenterIntroduction;
import com.ruoyi.project.introduction.mapper.TbCenterIntroductionMapper;
import com.ruoyi.project.introduction.service.ITbCenterIntroductionService;
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
public class TbCenterIntroductionServiceImpl implements ITbCenterIntroductionService
{
    @Autowired
    private TbCenterIntroductionMapper tbCenterIntroductionMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TbCenterIntroduction selectTbCenterIntroductionById(Long id)
    {
        return tbCenterIntroductionMapper.selectTbCenterIntroductionById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbCenterIntroduction 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TbCenterIntroduction> selectTbCenterIntroductionList(TbCenterIntroduction tbCenterIntroduction)
    {
        return tbCenterIntroductionMapper.selectTbCenterIntroductionList(tbCenterIntroduction);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbCenterIntroduction 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTbCenterIntroduction(TbCenterIntroduction tbCenterIntroduction)
    {
        tbCenterIntroduction.setCreateTime(DateUtils.getNowDate());
        return tbCenterIntroductionMapper.insertTbCenterIntroduction(tbCenterIntroduction);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbCenterIntroduction 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTbCenterIntroduction(TbCenterIntroduction tbCenterIntroduction)
    {
        tbCenterIntroduction.setUpdateTime(DateUtils.getNowDate());
        return tbCenterIntroductionMapper.updateTbCenterIntroduction(tbCenterIntroduction);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbCenterIntroductionByIds(String ids)
    {
        return tbCenterIntroductionMapper.deleteTbCenterIntroductionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTbCenterIntroductionById(Long id)
    {
        return tbCenterIntroductionMapper.deleteTbCenterIntroductionById(id);
    }
}
