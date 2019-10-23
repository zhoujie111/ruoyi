package com.ruoyi.project.jiaowu.kaikeplan.service;

import com.ruoyi.project.jiaowu.kaikeplan.domain.TbKaikePlan;
import java.util.List;

/**
 * 开课计划Service接口
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
public interface ITbKaikePlanService 
{
    /**
     * 查询开课计划
     * 
     * @param id 开课计划ID
     * @return 开课计划
     */
    public TbKaikePlan selectTbKaikePlanById(Long id);

    /**
     * 查询开课计划列表
     * 
     * @param tbKaikePlan 开课计划
     * @return 开课计划集合
     */
    public List<TbKaikePlan> selectTbKaikePlanList(TbKaikePlan tbKaikePlan);

    /**
     * 新增开课计划
     * 
     * @param tbKaikePlan 开课计划
     * @return 结果
     */
    public int insertTbKaikePlan(TbKaikePlan tbKaikePlan);

    /**
     * 修改开课计划
     * 
     * @param tbKaikePlan 开课计划
     * @return 结果
     */
    public int updateTbKaikePlan(TbKaikePlan tbKaikePlan);

    /**
     * 批量删除开课计划
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbKaikePlanByIds(String ids);

    /**
     * 删除开课计划信息
     * 
     * @param id 开课计划ID
     * @return 结果
     */
    public int deleteTbKaikePlanById(Long id);
}
