package com.ruoyi.project.jiaowu.term.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.jiaowu.term.domain.TbTerm;
import com.ruoyi.project.jiaowu.term.mapper.TbTermMapper;
import com.ruoyi.project.jiaowu.term.service.ITbTermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.text.Convert;

import java.util.List;

/**
 * 学期设置Service业务层处理
 * 
 * @author zhoujie
 * @date 2019-10-23
 */
@Service
public class TbTermServiceImpl implements ITbTermService
{
    @Autowired
    private TbTermMapper tbTermMapper;

    /**
     * 查询学期设置
     * 
     * @param id 学期设置ID
     * @return 学期设置
     */
    @Override
    public TbTerm selectTbTermById(Long id)
    {
        return tbTermMapper.selectTbTermById(id);
    }

    /**
     * 查询学期设置列表
     * 
     * @param tbTerm 学期设置
     * @return 学期设置
     */
    @Override
    public List<TbTerm> selectTbTermList(TbTerm tbTerm)
    {
        return tbTermMapper.selectTbTermList(tbTerm);
    }

    /**
     * 新增学期设置
     * 
     * @param tbTerm 学期设置
     * @return 结果
     */
    @Override
    public int insertTbTerm(TbTerm tbTerm)
    {
        tbTerm.setCreateTime(DateUtils.getNowDate());
        return tbTermMapper.insertTbTerm(tbTerm);
    }

    /**
     * 修改学期设置
     * 
     * @param tbTerm 学期设置
     * @return 结果
     */
    @Override
    public int updateTbTerm(TbTerm tbTerm)
    {
        tbTerm.setUpdateTime(DateUtils.getNowDate());
        return tbTermMapper.updateTbTerm(tbTerm);
    }

    /**
     * 删除学期设置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbTermByIds(String ids)
    {
        return tbTermMapper.deleteTbTermByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学期设置信息
     * 
     * @param id 学期设置ID
     * @return 结果
     */
    @Override
    public int deleteTbTermById(Long id)
    {
        return tbTermMapper.deleteTbTermById(id);
    }
}
