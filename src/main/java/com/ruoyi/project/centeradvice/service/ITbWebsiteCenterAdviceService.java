package com.ruoyi.project.centeradvice.service;

import com.ruoyi.project.centeradvice.domain.TbWebsiteCenterAdvice;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2019-10-22
 */
public interface ITbWebsiteCenterAdviceService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TbWebsiteCenterAdvice selectTbWebsiteCenterAdviceById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteCenterAdvice 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TbWebsiteCenterAdvice> selectTbWebsiteCenterAdviceList(TbWebsiteCenterAdvice tbWebsiteCenterAdvice);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteCenterAdvice 【请填写功能名称】
     * @return 结果
     */
    public int insertTbWebsiteCenterAdvice(TbWebsiteCenterAdvice tbWebsiteCenterAdvice);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteCenterAdvice 【请填写功能名称】
     * @return 结果
     */
    public int updateTbWebsiteCenterAdvice(TbWebsiteCenterAdvice tbWebsiteCenterAdvice);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbWebsiteCenterAdviceByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTbWebsiteCenterAdviceById(Long id);
}
