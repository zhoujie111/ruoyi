package com.ruoyi.project.websitetitle.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.websitetitle.domain.TbWebsiteTitle;
import com.ruoyi.project.websitetitle.mapper.TbWebsiteTitleMapper;
import com.ruoyi.project.websitetitle.service.ITbWebsiteTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-10-18
 */
@Service
public class TbWebsiteTitleServiceImpl implements ITbWebsiteTitleService
{
    @Autowired
    private TbWebsiteTitleMapper tbWebsiteTitleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TbWebsiteTitle selectTbWebsiteTitleById(Long id)
    {
        return tbWebsiteTitleMapper.selectTbWebsiteTitleById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteTitle 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TbWebsiteTitle> selectTbWebsiteTitleList(TbWebsiteTitle tbWebsiteTitle)
    {
        return tbWebsiteTitleMapper.selectTbWebsiteTitleList(tbWebsiteTitle);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteTitle 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTbWebsiteTitle(TbWebsiteTitle tbWebsiteTitle)
    {
        tbWebsiteTitle.setCreateTime(DateUtils.getNowDate());
        tbWebsiteTitle.setUpdateTime(DateUtils.getNowDate());
        return tbWebsiteTitleMapper.insertTbWebsiteTitle(tbWebsiteTitle);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteTitle 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTbWebsiteTitle(TbWebsiteTitle tbWebsiteTitle)
    {
        tbWebsiteTitle.setUpdateTime(DateUtils.getNowDate());
        return tbWebsiteTitleMapper.updateTbWebsiteTitle(tbWebsiteTitle);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteTitleByIds(String ids)
    {
        return tbWebsiteTitleMapper.deleteTbWebsiteTitleByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteTitleById(Long id)
    {
        return tbWebsiteTitleMapper.deleteTbWebsiteTitleById(id);
    }
}
