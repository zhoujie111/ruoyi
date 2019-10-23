package com.ruoyi.project.experimentcheck.mapper;

import com.ruoyi.project.experimentcheck.domain.ExperimentCheck;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2019-10-16
 */
public interface ExperimentCheckMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public ExperimentCheck selectExperimentCheckById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param experimentCheck 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<ExperimentCheck> selectExperimentCheckList(ExperimentCheck experimentCheck);

    /**
     * 新增【请填写功能名称】
     *
     * @param experimentCheck 【请填写功能名称】
     * @return 结果
     */
    public int insertExperimentCheck(ExperimentCheck experimentCheck);

    /**
     * 修改【请填写功能名称】
     *
     * @param experimentCheck 【请填写功能名称】
     * @return 结果
     */
    public int updateExperimentCheck(ExperimentCheck experimentCheck);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteExperimentCheckById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteExperimentCheckByIds(String[] ids);
}
