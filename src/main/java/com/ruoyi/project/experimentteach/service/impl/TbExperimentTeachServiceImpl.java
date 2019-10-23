package com.ruoyi.project.experimentteach.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.experimentteach.domain.TbExperimentTeach;
import com.ruoyi.project.experimentteach.mapper.TbExperimentTeachMapper;
import com.ruoyi.project.experimentteach.service.ITbExperimentTeachService;
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
public class TbExperimentTeachServiceImpl implements ITbExperimentTeachService
{
    @Autowired
    private TbExperimentTeachMapper tbExperimentTeachMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TbExperimentTeach selectTbExperimentTeachById(Long id)
    {
        return tbExperimentTeachMapper.selectTbExperimentTeachById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbExperimentTeach 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TbExperimentTeach> selectTbExperimentTeachList(TbExperimentTeach tbExperimentTeach)
    {
        return tbExperimentTeachMapper.selectTbExperimentTeachList(tbExperimentTeach);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbExperimentTeach 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTbExperimentTeach(TbExperimentTeach tbExperimentTeach)
    {
        tbExperimentTeach.setCreateTime(DateUtils.getNowDate());
        return tbExperimentTeachMapper.insertTbExperimentTeach(tbExperimentTeach);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbExperimentTeach 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTbExperimentTeach(TbExperimentTeach tbExperimentTeach)
    {
        tbExperimentTeach.setUpdateTime(DateUtils.getNowDate());
        return tbExperimentTeachMapper.updateTbExperimentTeach(tbExperimentTeach);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbExperimentTeachByIds(String ids)
    {
        return tbExperimentTeachMapper.deleteTbExperimentTeachByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTbExperimentTeachById(Long id)
    {
        return tbExperimentTeachMapper.deleteTbExperimentTeachById(id);
    }
}
