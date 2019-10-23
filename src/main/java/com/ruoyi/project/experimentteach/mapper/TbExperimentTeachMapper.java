package com.ruoyi.project.experimentteach.mapper;

import com.ruoyi.project.experimentteach.domain.TbExperimentTeach;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2019-10-22
 */
public interface TbExperimentTeachMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TbExperimentTeach selectTbExperimentTeachById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbExperimentTeach 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TbExperimentTeach> selectTbExperimentTeachList(TbExperimentTeach tbExperimentTeach);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbExperimentTeach 【请填写功能名称】
     * @return 结果
     */
    public int insertTbExperimentTeach(TbExperimentTeach tbExperimentTeach);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbExperimentTeach 【请填写功能名称】
     * @return 结果
     */
    public int updateTbExperimentTeach(TbExperimentTeach tbExperimentTeach);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTbExperimentTeachById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbExperimentTeachByIds(String[] ids);

    TbExperimentTeach selectTbExperimentTeach();
}
