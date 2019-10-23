package com.ruoyi.project.experimentteam.service;

import com.ruoyi.project.experimentteam.domain.TbWebsiteExperimentTeam;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2019-10-22
 */
public interface ITbWebsiteExperimentTeamService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TbWebsiteExperimentTeam selectTbWebsiteExperimentTeamById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteExperimentTeam 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TbWebsiteExperimentTeam> selectTbWebsiteExperimentTeamList(TbWebsiteExperimentTeam tbWebsiteExperimentTeam);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteExperimentTeam 【请填写功能名称】
     * @return 结果
     */
    public int insertTbWebsiteExperimentTeam(TbWebsiteExperimentTeam tbWebsiteExperimentTeam);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteExperimentTeam 【请填写功能名称】
     * @return 结果
     */
    public int updateTbWebsiteExperimentTeam(TbWebsiteExperimentTeam tbWebsiteExperimentTeam);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbWebsiteExperimentTeamByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTbWebsiteExperimentTeamById(Long id);
}
