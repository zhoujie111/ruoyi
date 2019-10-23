package com.ruoyi.project.jiaowu.totalcoursemain.mapper;

import com.ruoyi.project.jiaowu.totalcoursemain.domain.TbTotalCourseMain;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
public interface TbTotalCourseMainMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public TbTotalCourseMain selectTbTotalCourseMainById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbTotalCourseMain 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TbTotalCourseMain> selectTbTotalCourseMainList(TbTotalCourseMain tbTotalCourseMain);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbTotalCourseMain 【请填写功能名称】
     * @return 结果
     */
    public int insertTbTotalCourseMain(TbTotalCourseMain tbTotalCourseMain);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbTotalCourseMain 【请填写功能名称】
     * @return 结果
     */
    public int updateTbTotalCourseMain(TbTotalCourseMain tbTotalCourseMain);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteTbTotalCourseMainById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbTotalCourseMainByIds(String[] ids);
}
