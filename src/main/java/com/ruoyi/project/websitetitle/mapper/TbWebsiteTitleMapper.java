package com.ruoyi.project.websitetitle.mapper;

import com.ruoyi.project.websitetitle.domain.TbWebsiteTitle;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2019-10-18
 */
public interface TbWebsiteTitleMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TbWebsiteTitle selectTbWebsiteTitleById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteTitle 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TbWebsiteTitle> selectTbWebsiteTitleList(TbWebsiteTitle tbWebsiteTitle);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteTitle 【请填写功能名称】
     * @return 结果
     */
    public int insertTbWebsiteTitle(TbWebsiteTitle tbWebsiteTitle);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteTitle 【请填写功能名称】
     * @return 结果
     */
    public int updateTbWebsiteTitle(TbWebsiteTitle tbWebsiteTitle);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTbWebsiteTitleById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbWebsiteTitleByIds(String[] ids);
}
