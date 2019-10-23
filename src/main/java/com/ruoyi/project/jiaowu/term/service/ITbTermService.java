package com.ruoyi.project.jiaowu.term.service;

import com.ruoyi.project.jiaowu.term.domain.TbTerm;
import java.util.List;

/**
 * 学期设置Service接口
 * 
 * @author zhoujie
 * @date 2019-10-23
 */
public interface ITbTermService 
{
    /**
     * 查询学期设置
     * 
     * @param id 学期设置ID
     * @return 学期设置
     */
    public TbTerm selectTbTermById(Long id);

    /**
     * 查询学期设置列表
     * 
     * @param tbTerm 学期设置
     * @return 学期设置集合
     */
    public List<TbTerm> selectTbTermList(TbTerm tbTerm);

    /**
     * 新增学期设置
     * 
     * @param tbTerm 学期设置
     * @return 结果
     */
    public int insertTbTerm(TbTerm tbTerm);

    /**
     * 修改学期设置
     * 
     * @param tbTerm 学期设置
     * @return 结果
     */
    public int updateTbTerm(TbTerm tbTerm);

    /**
     * 批量删除学期设置
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbTermByIds(String ids);

    /**
     * 删除学期设置信息
     * 
     * @param id 学期设置ID
     * @return 结果
     */
    public int deleteTbTermById(Long id);
}
