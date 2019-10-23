package com.ruoyi.project.management.mapper;

import com.ruoyi.project.management.domain.TbWebsiteManagement;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2019-10-22
 */
public interface TbWebsiteManagementMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TbWebsiteManagement selectTbWebsiteManagementById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteManagement 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TbWebsiteManagement> selectTbWebsiteManagementList(TbWebsiteManagement tbWebsiteManagement);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteManagement 【请填写功能名称】
     * @return 结果
     */
    public int insertTbWebsiteManagement(TbWebsiteManagement tbWebsiteManagement);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteManagement 【请填写功能名称】
     * @return 结果
     */
    public int updateTbWebsiteManagement(TbWebsiteManagement tbWebsiteManagement);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTbWebsiteManagementById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbWebsiteManagementByIds(String[] ids);

    TbWebsiteManagement selectTbManagement();

}
