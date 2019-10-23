package com.ruoyi.project.experimentteam.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.experimentteam.domain.TbWebsiteExperimentTeam;
import com.ruoyi.project.experimentteam.mapper.TbWebsiteExperimentTeamMapper;
import com.ruoyi.project.experimentteam.service.ITbWebsiteExperimentTeamService;
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
public class TbWebsiteExperimentTeamServiceImpl implements ITbWebsiteExperimentTeamService
{
    @Autowired
    private TbWebsiteExperimentTeamMapper tbWebsiteExperimentTeamMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TbWebsiteExperimentTeam selectTbWebsiteExperimentTeamById(Long id)
    {
        return tbWebsiteExperimentTeamMapper.selectTbWebsiteExperimentTeamById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteExperimentTeam 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TbWebsiteExperimentTeam> selectTbWebsiteExperimentTeamList(TbWebsiteExperimentTeam tbWebsiteExperimentTeam)
    {
        return tbWebsiteExperimentTeamMapper.selectTbWebsiteExperimentTeamList(tbWebsiteExperimentTeam);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteExperimentTeam 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTbWebsiteExperimentTeam(TbWebsiteExperimentTeam tbWebsiteExperimentTeam)
    {
        tbWebsiteExperimentTeam.setCreateTime(DateUtils.getNowDate());
        return tbWebsiteExperimentTeamMapper.insertTbWebsiteExperimentTeam(tbWebsiteExperimentTeam);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteExperimentTeam 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTbWebsiteExperimentTeam(TbWebsiteExperimentTeam tbWebsiteExperimentTeam)
    {
        tbWebsiteExperimentTeam.setUpdateTime(DateUtils.getNowDate());
        return tbWebsiteExperimentTeamMapper.updateTbWebsiteExperimentTeam(tbWebsiteExperimentTeam);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteExperimentTeamByIds(String ids)
    {
        return tbWebsiteExperimentTeamMapper.deleteTbWebsiteExperimentTeamByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteExperimentTeamById(Long id)
    {
        return tbWebsiteExperimentTeamMapper.deleteTbWebsiteExperimentTeamById(id);
    }
}
