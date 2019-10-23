package com.ruoyi.project.experimentcheck.service;


import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.experimentcheck.domain.ExperimentCheck;
import com.ruoyi.project.experimentcheck.mapper.ExperimentCheckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.utils.text.Convert;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2019-10-16
 */
@Service
public class ExperimentCheckServiceImpl implements ExperimentCheckService
{
    @Autowired
    private ExperimentCheckMapper experimentCheckMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public ExperimentCheck selectExperimentCheckById(Long id)
    {
        return experimentCheckMapper.selectExperimentCheckById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param experimentCheck 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<ExperimentCheck> selectExperimentCheckList(ExperimentCheck experimentCheck)
    {
        return experimentCheckMapper.selectExperimentCheckList(experimentCheck);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param experimentCheck 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertExperimentCheck(ExperimentCheck experimentCheck)
    {
        experimentCheck.setCreateTime(DateUtils.getNowDate());
        return experimentCheckMapper.insertExperimentCheck(experimentCheck);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param experimentCheck 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateExperimentCheck(ExperimentCheck experimentCheck)
    {
        experimentCheck.setUpdateTime(DateUtils.getNowDate());
        return experimentCheckMapper.updateExperimentCheck(experimentCheck);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteExperimentCheckByIds(String ids)
    {
        return experimentCheckMapper.deleteExperimentCheckByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteExperimentCheckById(Long id)
    {
        return experimentCheckMapper.deleteExperimentCheckById(id);
    }
}
