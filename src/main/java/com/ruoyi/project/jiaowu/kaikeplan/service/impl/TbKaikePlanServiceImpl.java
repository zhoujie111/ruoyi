package com.ruoyi.project.jiaowu.kaikeplan.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.jiaowu.kaikeplan.domain.TbKaikePlan;
import com.ruoyi.project.jiaowu.kaikeplan.mapper.TbKaikePlanMapper;
import com.ruoyi.project.jiaowu.kaikeplan.service.ITbKaikePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.text.Convert;

/**
 * 开课计划Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
@Service
public class TbKaikePlanServiceImpl implements ITbKaikePlanService
{
    @Autowired
    private TbKaikePlanMapper tbKaikePlanMapper;

    /**
     * 查询开课计划
     * 
     * @param id 开课计划ID
     * @return 开课计划
     */
    @Override
    public TbKaikePlan selectTbKaikePlanById(Long id)
    {
        return tbKaikePlanMapper.selectTbKaikePlanById(id);
    }

    /**
     * 查询开课计划列表
     * 
     * @param tbKaikePlan 开课计划
     * @return 开课计划
     */
    @Override
    public List<TbKaikePlan> selectTbKaikePlanList(TbKaikePlan tbKaikePlan)
    {
        return tbKaikePlanMapper.selectTbKaikePlanList(tbKaikePlan);
    }

    /**
     * 新增开课计划
     * 
     * @param tbKaikePlan 开课计划
     * @return 结果
     */
    @Override
    public int insertTbKaikePlan(TbKaikePlan tbKaikePlan)
    {
        tbKaikePlan.setCreateTime(DateUtils.getNowDate());
        return tbKaikePlanMapper.insertTbKaikePlan(tbKaikePlan);
    }

    /**
     * 修改开课计划
     * 
     * @param tbKaikePlan 开课计划
     * @return 结果
     */
    @Override
    public int updateTbKaikePlan(TbKaikePlan tbKaikePlan)
    {
        tbKaikePlan.setUpdateTime(DateUtils.getNowDate());
        return tbKaikePlanMapper.updateTbKaikePlan(tbKaikePlan);
    }

    /**
     * 删除开课计划对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbKaikePlanByIds(String ids)
    {
        return tbKaikePlanMapper.deleteTbKaikePlanByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除开课计划信息
     * 
     * @param id 开课计划ID
     * @return 结果
     */
    @Override
    public int deleteTbKaikePlanById(Long id)
    {
        return tbKaikePlanMapper.deleteTbKaikePlanById(id);
    }
}
