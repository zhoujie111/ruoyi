package com.ruoyi.project.websitetype.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.websitetype.domain.TbWebsiteType;
import com.ruoyi.project.websitetype.mapper.TbWebsiteTypeMapper;
import com.ruoyi.project.websitetype.service.ITbWebsiteTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.text.Convert;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-10-18
 */
@Service
public class TbWebsiteTypeServiceImpl implements ITbWebsiteTypeService
{
    @Autowired
    private TbWebsiteTypeMapper tbWebsiteTypeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TbWebsiteType selectTbWebsiteTypeById(Long id)
    {
        return tbWebsiteTypeMapper.selectTbWebsiteTypeById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteType 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TbWebsiteType> selectTbWebsiteTypeList(TbWebsiteType tbWebsiteType)
    {
        return tbWebsiteTypeMapper.selectTbWebsiteTypeList(tbWebsiteType);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteType 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTbWebsiteType(TbWebsiteType tbWebsiteType)
    {
        tbWebsiteType.setCreateTime(DateUtils.getNowDate());
        return tbWebsiteTypeMapper.insertTbWebsiteType(tbWebsiteType);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteType 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTbWebsiteType(TbWebsiteType tbWebsiteType)
    {
        tbWebsiteType.setUpdateTime(DateUtils.getNowDate());
        return tbWebsiteTypeMapper.updateTbWebsiteType(tbWebsiteType);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteTypeByIds(String ids)
    {
        return tbWebsiteTypeMapper.deleteTbWebsiteTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTbWebsiteTypeById(Long id)
    {
        return tbWebsiteTypeMapper.deleteTbWebsiteTypeById(id);
    }

    @Override
    public List<TbWebsiteType> selectTbWebsiteTypeList() {
        return tbWebsiteTypeMapper.findAllWebsiteTypeName();
    }
}
