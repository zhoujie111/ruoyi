package com.ruoyi.project.jiaowu.totalcoursemain.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.jiaowu.totalcoursemain.domain.TbTotalCourseMain;
import com.ruoyi.project.jiaowu.totalcoursemain.mapper.TbTotalCourseMainMapper;
import com.ruoyi.project.jiaowu.totalcoursemain.service.ITbTotalCourseMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
@Service
public class TbTotalCourseMainServiceImpl implements ITbTotalCourseMainService
{
    @Autowired
    private TbTotalCourseMainMapper tbTotalCourseMainMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public TbTotalCourseMain selectTbTotalCourseMainById(Long id)
    {
        return tbTotalCourseMainMapper.selectTbTotalCourseMainById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tbTotalCourseMain 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TbTotalCourseMain> selectTbTotalCourseMainList(TbTotalCourseMain tbTotalCourseMain)
    {
        return tbTotalCourseMainMapper.selectTbTotalCourseMainList(tbTotalCourseMain);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tbTotalCourseMain 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTbTotalCourseMain(TbTotalCourseMain tbTotalCourseMain)
    {
        tbTotalCourseMain.setCreateTime(DateUtils.getNowDate());
        return tbTotalCourseMainMapper.insertTbTotalCourseMain(tbTotalCourseMain);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tbTotalCourseMain 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTbTotalCourseMain(TbTotalCourseMain tbTotalCourseMain)
    {
        tbTotalCourseMain.setUpdateTime(DateUtils.getNowDate());
        return tbTotalCourseMainMapper.updateTbTotalCourseMain(tbTotalCourseMain);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbTotalCourseMainByIds(String ids)
    {
        return tbTotalCourseMainMapper.deleteTbTotalCourseMainByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteTbTotalCourseMainById(Long id)
    {
        return tbTotalCourseMainMapper.deleteTbTotalCourseMainById(id);
    }
}
