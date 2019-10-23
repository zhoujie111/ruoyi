package com.ruoyi.project.jiaowu.plan.service;

import com.ruoyi.project.jiaowu.plan.domain.TbPlanMain;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
public interface ITbPlanMainService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TbPlanMain selectTbPlanMainById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbPlanMain 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TbPlanMain> selectTbPlanMainList(TbPlanMain tbPlanMain);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbPlanMain 【请填写功能名称】
     * @return 结果
     */
    public int insertTbPlanMain(TbPlanMain tbPlanMain);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbPlanMain 【请填写功能名称】
     * @return 结果
     */
    public int updateTbPlanMain(TbPlanMain tbPlanMain);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbPlanMainByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTbPlanMainById(Long id);
}
