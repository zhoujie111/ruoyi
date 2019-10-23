package com.ruoyi.project.management.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.management.domain.TbWebsiteManagement;
import com.ruoyi.project.management.mapper.TbWebsiteManagementMapper;
import com.ruoyi.project.management.service.ITbWebsiteManagementService;
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
public class TbWebsiteManagementServiceImpl implements ITbWebsiteManagementService
{
    @Autowired
    private TbWebsiteManagementMapper tbWebsiteManagementMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TbWebsiteManagement selectTbWebsiteManagementById(Long id)
    {
        return tbWebsiteManagementMapper.selectTbWebsiteManagementById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteManagement 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TbWebsiteManagement> selectTbWebsiteManagementList(TbWebsiteManagement tbWebsiteManagement)
    {
        return tbWebsiteManagementMapper.selectTbWebsiteManagementList(tbWebsiteManagement);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteManagement 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTbWebsiteManagement(TbWebsiteManagement tbWebsiteManagement)
    {
        tbWebsiteManagement.setCreateTime(DateUtils.getNowDate());
        return tbWebsiteManagementMapper.insertTbWebsiteManagement(tbWebsiteManagement);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteManagement 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTbWebsiteManagement(TbWebsiteManagement tbWebsiteManagement)
    {
        tbWebsiteManagement.setUpdateTime(DateUtils.getNowDate());
        return tbWebsiteManagementMapper.updateTbWebsiteManagement(tbWebsiteManagement);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteManagementByIds(String ids)
    {
        return tbWebsiteManagementMapper.deleteTbWebsiteManagementByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteManagementById(Long id)
    {
        return tbWebsiteManagementMapper.deleteTbWebsiteManagementById(id);
    }
}
