package com.ruoyi.project.experimentcheck.service;


import com.ruoyi.project.experimentcheck.domain.ExperimentCheck;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2019-10-16
 */
public interface ExperimentCheckService {
    /**
     * 查询【请填写功能名称】
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
     ExperimentCheck selectExperimentCheckById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param experimentCheck 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
     List<ExperimentCheck> selectExperimentCheckList(ExperimentCheck experimentCheck);

    /**
     * 新增【请填写功能名称】
     *
     * @param experimentCheck 【请填写功能名称】
     * @return 结果
     */
     int insertExperimentCheck(ExperimentCheck experimentCheck);

    /**
     * 修改【请填写功能名称】
     *
     * @param experimentCheck 【请填写功能名称】
     * @return 结果
     */
     int updateExperimentCheck(ExperimentCheck experimentCheck);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
     int deleteExperimentCheckByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
     int deleteExperimentCheckById(Long id);
}
