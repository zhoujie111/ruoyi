package com.ruoyi.project.jiaowu.kaikecheck.service;

import com.ruoyi.project.jiaowu.kaikecheck.domain.TbKaikeCheck;
import java.util.List;

/**
 * 开课审核Service接口
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
public interface ITbKaikeCheckService 
{
    /**
     * 查询开课审核
     * 
     * @param id 开课审核ID
     * @return 开课审核
     */
    public TbKaikeCheck selectTbKaikeCheckById(Long id);

    /**
     * 查询开课审核列表
     * 
     * @param tbKaikeCheck 开课审核
     * @return 开课审核集合
     */
    public List<TbKaikeCheck> selectTbKaikeCheckList(TbKaikeCheck tbKaikeCheck);

    /**
     * 新增开课审核
     * 
     * @param tbKaikeCheck 开课审核
     * @return 结果
     */
    public int insertTbKaikeCheck(TbKaikeCheck tbKaikeCheck);

    /**
     * 修改开课审核
     * 
     * @param tbKaikeCheck 开课审核
     * @return 结果
     */
    public int updateTbKaikeCheck(TbKaikeCheck tbKaikeCheck);

    /**
     * 批量删除开课审核
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbKaikeCheckByIds(String ids);

    /**
     * 删除开课审核信息
     * 
     * @param id 开课审核ID
     * @return 结果
     */
    public int deleteTbKaikeCheckById(Long id);
}
