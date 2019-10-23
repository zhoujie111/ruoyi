package com.ruoyi.project.introduction.mapper;

import com.ruoyi.project.introduction.domain.TbCenterIntroduction;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2019-10-22
 */
public interface TbCenterIntroductionMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TbCenterIntroduction selectTbCenterIntroductionById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbCenterIntroduction 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TbCenterIntroduction> selectTbCenterIntroductionList(TbCenterIntroduction tbCenterIntroduction);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbCenterIntroduction 【请填写功能名称】
     * @return 结果
     */
    public int insertTbCenterIntroduction(TbCenterIntroduction tbCenterIntroduction);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbCenterIntroduction 【请填写功能名称】
     * @return 结果
     */
    public int updateTbCenterIntroduction(TbCenterIntroduction tbCenterIntroduction);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTbCenterIntroductionById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbCenterIntroductionByIds(String[] ids);

    TbCenterIntroduction selectTbCenterIntroduction();

}
