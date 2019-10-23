package com.ruoyi.project.jiaowu.kaikecheck.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.jiaowu.kaikecheck.domain.TbKaikeCheck;
import com.ruoyi.project.jiaowu.kaikecheck.mapper.TbKaikeCheckMapper;
import com.ruoyi.project.jiaowu.kaikecheck.service.ITbKaikeCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.text.Convert;

/**
 * 开课审核Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
@Service
public class TbKaikeCheckServiceImpl implements ITbKaikeCheckService
{
    @Autowired
    private TbKaikeCheckMapper tbKaikeCheckMapper;

    /**
     * 查询开课审核
     * 
     * @param id 开课审核ID
     * @return 开课审核
     */
    @Override
    public TbKaikeCheck selectTbKaikeCheckById(Long id)
    {
        return tbKaikeCheckMapper.selectTbKaikeCheckById(id);
    }

    /**
     * 查询开课审核列表
     * 
     * @param tbKaikeCheck 开课审核
     * @return 开课审核
     */
    @Override
    public List<TbKaikeCheck> selectTbKaikeCheckList(TbKaikeCheck tbKaikeCheck)
    {
        return tbKaikeCheckMapper.selectTbKaikeCheckList(tbKaikeCheck);
    }

    /**
     * 新增开课审核
     * 
     * @param tbKaikeCheck 开课审核
     * @return 结果
     */
    @Override
    public int insertTbKaikeCheck(TbKaikeCheck tbKaikeCheck)
    {
        tbKaikeCheck.setCreateTime(DateUtils.getNowDate());
        return tbKaikeCheckMapper.insertTbKaikeCheck(tbKaikeCheck);
    }

    /**
     * 修改开课审核
     * 
     * @param tbKaikeCheck 开课审核
     * @return 结果
     */
    @Override
    public int updateTbKaikeCheck(TbKaikeCheck tbKaikeCheck)
    {
        tbKaikeCheck.setUpdateTime(DateUtils.getNowDate());
        return tbKaikeCheckMapper.updateTbKaikeCheck(tbKaikeCheck);
    }

    /**
     * 删除开课审核对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbKaikeCheckByIds(String ids)
    {
        return tbKaikeCheckMapper.deleteTbKaikeCheckByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除开课审核信息
     * 
     * @param id 开课审核ID
     * @return 结果
     */
    @Override
    public int deleteTbKaikeCheckById(Long id)
    {
        return tbKaikeCheckMapper.deleteTbKaikeCheckById(id);
    }
}
