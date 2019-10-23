package com.ruoyi.project.jiaowu.courseselcttime.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.jiaowu.courseselcttime.domain.TbCourseSelectTime;
import com.ruoyi.project.jiaowu.courseselcttime.mapper.TbCourseSelectTimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.jiaowu.courseselcttime.service.ITbCourseSelectTimeService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 选课时间Service业务层处理
 * 
 * @author zhoujie
 * @date 2019-10-23
 */
@Service
public class TbCourseSelectTimeServiceImpl implements ITbCourseSelectTimeService 
{
    @Autowired
    private TbCourseSelectTimeMapper tbCourseSelectTimeMapper;

    /**
     * 查询选课时间
     * 
     * @param id 选课时间ID
     * @return 选课时间
     */
    @Override
    public TbCourseSelectTime selectTbCourseSelectTimeById(Long id)
    {
        return tbCourseSelectTimeMapper.selectTbCourseSelectTimeById(id);
    }

    /**
     * 查询选课时间列表
     * 
     * @param tbCourseSelectTime 选课时间
     * @return 选课时间
     */
    @Override
    public List<TbCourseSelectTime> selectTbCourseSelectTimeList(TbCourseSelectTime tbCourseSelectTime)
    {
        return tbCourseSelectTimeMapper.selectTbCourseSelectTimeList(tbCourseSelectTime);
    }

    /**
     * 新增选课时间
     * 
     * @param tbCourseSelectTime 选课时间
     * @return 结果
     */
    @Override
    public int insertTbCourseSelectTime(TbCourseSelectTime tbCourseSelectTime)
    {
        tbCourseSelectTime.setCreateTime(DateUtils.getNowDate());
        return tbCourseSelectTimeMapper.insertTbCourseSelectTime(tbCourseSelectTime);
    }

    /**
     * 修改选课时间
     * 
     * @param tbCourseSelectTime 选课时间
     * @return 结果
     */
    @Override
    public int updateTbCourseSelectTime(TbCourseSelectTime tbCourseSelectTime)
    {
        tbCourseSelectTime.setUpdateTime(DateUtils.getNowDate());
        return tbCourseSelectTimeMapper.updateTbCourseSelectTime(tbCourseSelectTime);
    }

    /**
     * 删除选课时间对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbCourseSelectTimeByIds(String ids)
    {
        return tbCourseSelectTimeMapper.deleteTbCourseSelectTimeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除选课时间信息
     * 
     * @param id 选课时间ID
     * @return 结果
     */
    @Override
    public int deleteTbCourseSelectTimeById(Long id)
    {
        return tbCourseSelectTimeMapper.deleteTbCourseSelectTimeById(id);
    }
}
