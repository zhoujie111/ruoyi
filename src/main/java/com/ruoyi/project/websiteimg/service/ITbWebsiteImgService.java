package com.ruoyi.project.websiteimg.service;

import com.ruoyi.project.websiteimg.domain.TbWebsiteImg;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2019-10-21
 */
public interface ITbWebsiteImgService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TbWebsiteImg selectTbWebsiteImgById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbWebsiteImg 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TbWebsiteImg> selectTbWebsiteImgList(TbWebsiteImg tbWebsiteImg);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbWebsiteImg 【请填写功能名称】
     * @return 结果
     */
    public int insertTbWebsiteImg(TbWebsiteImg tbWebsiteImg);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbWebsiteImg 【请填写功能名称】
     * @return 结果
     */
    public int updateTbWebsiteImg(TbWebsiteImg tbWebsiteImg);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbWebsiteImgByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTbWebsiteImgById(Long id);

    int insert(TbWebsiteImg img);
}
