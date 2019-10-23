package com.ruoyi.project.websitetype.mapper;

import com.ruoyi.project.websitetype.domain.TbWebsiteType;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2019-10-18
 */
public interface TbWebsiteTypeMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TbWebsiteType selectTbWebsiteTypeById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteType 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TbWebsiteType> selectTbWebsiteTypeList(TbWebsiteType tbWebsiteType);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteType 【请填写功能名称】
     * @return 结果
     */
    public int insertTbWebsiteType(TbWebsiteType tbWebsiteType);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteType 【请填写功能名称】
     * @return 结果
     */
    public int updateTbWebsiteType(TbWebsiteType tbWebsiteType);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTbWebsiteTypeById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbWebsiteTypeByIds(String[] ids);

    List<TbWebsiteType> findAllWebsiteTypeName();

}
