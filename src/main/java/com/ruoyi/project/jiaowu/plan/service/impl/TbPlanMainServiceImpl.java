package com.ruoyi.project.jiaowu.plan.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.jiaowu.plan.domain.TbPlanMain;
import com.ruoyi.project.jiaowu.plan.mapper.TbPlanMainMapper;
import com.ruoyi.project.jiaowu.plan.service.ITbPlanMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
@Service
public class TbPlanMainServiceImpl implements ITbPlanMainService
{
    @Autowired
    private TbPlanMainMapper tbPlanMainMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TbPlanMain selectTbPlanMainById(Long id)
    {
        return tbPlanMainMapper.selectTbPlanMainById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbPlanMain 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TbPlanMain> selectTbPlanMainList(TbPlanMain tbPlanMain)
    {
        return tbPlanMainMapper.selectTbPlanMainList(tbPlanMain);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbPlanMain 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTbPlanMain(TbPlanMain tbPlanMain)
    {
        tbPlanMain.setCreateTime(DateUtils.getNowDate());
        return tbPlanMainMapper.insertTbPlanMain(tbPlanMain);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbPlanMain 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTbPlanMain(TbPlanMain tbPlanMain)
    {
        tbPlanMain.setUpdateTime(DateUtils.getNowDate());
        return tbPlanMainMapper.updateTbPlanMain(tbPlanMain);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbPlanMainByIds(String ids)
    {
        return tbPlanMainMapper.deleteTbPlanMainByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTbPlanMainById(Long id)
    {
        return tbPlanMainMapper.deleteTbPlanMainById(id);
    }
}
