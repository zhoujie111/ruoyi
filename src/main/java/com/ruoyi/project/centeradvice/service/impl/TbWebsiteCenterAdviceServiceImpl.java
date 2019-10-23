package com.ruoyi.project.centeradvice.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.centeradvice.domain.TbWebsiteCenterAdvice;
import com.ruoyi.project.centeradvice.mapper.TbWebsiteCenterAdviceMapper;
import com.ruoyi.project.centeradvice.service.ITbWebsiteCenterAdviceService;
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
public class TbWebsiteCenterAdviceServiceImpl implements ITbWebsiteCenterAdviceService
{
    @Autowired
    private TbWebsiteCenterAdviceMapper tbWebsiteCenterAdviceMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TbWebsiteCenterAdvice selectTbWebsiteCenterAdviceById(Long id)
    {
        return tbWebsiteCenterAdviceMapper.selectTbWebsiteCenterAdviceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteCenterAdvice 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TbWebsiteCenterAdvice> selectTbWebsiteCenterAdviceList(TbWebsiteCenterAdvice tbWebsiteCenterAdvice)
    {
        return tbWebsiteCenterAdviceMapper.selectTbWebsiteCenterAdviceList(tbWebsiteCenterAdvice);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteCenterAdvice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTbWebsiteCenterAdvice(TbWebsiteCenterAdvice tbWebsiteCenterAdvice)
    {
        tbWebsiteCenterAdvice.setCreateTime(DateUtils.getNowDate());
        return tbWebsiteCenterAdviceMapper.insertTbWebsiteCenterAdvice(tbWebsiteCenterAdvice);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteCenterAdvice 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTbWebsiteCenterAdvice(TbWebsiteCenterAdvice tbWebsiteCenterAdvice)
    {
        tbWebsiteCenterAdvice.setUpdateTime(DateUtils.getNowDate());
        return tbWebsiteCenterAdviceMapper.updateTbWebsiteCenterAdvice(tbWebsiteCenterAdvice);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteCenterAdviceByIds(String ids)
    {
        return tbWebsiteCenterAdviceMapper.deleteTbWebsiteCenterAdviceByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteCenterAdviceById(Long id)
    {
        return tbWebsiteCenterAdviceMapper.deleteTbWebsiteCenterAdviceById(id);
    }
}
