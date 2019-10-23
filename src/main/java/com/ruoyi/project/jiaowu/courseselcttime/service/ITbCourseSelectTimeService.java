package com.ruoyi.project.jiaowu.courseselcttime.service;

import com.ruoyi.project.jiaowu.courseselcttime.domain.TbCourseSelectTime;
import java.util.List;

/**
 * 选课时间Service接口
 * 
 * @author zhoujie
 * @date 2019-10-23
 */
public interface ITbCourseSelectTimeService 
{
    /**
     * 查询选课时间
     * 
     * @param id 选课时间ID
     * @return 选课时间
     */
    public TbCourseSelectTime selectTbCourseSelectTimeById(Long id);

    /**
     * 查询选课时间列表
     * 
     * @param tbCourseSelectTime 选课时间
     * @return 选课时间集合
     */
    public List<TbCourseSelectTime> selectTbCourseSelectTimeList(TbCourseSelectTime tbCourseSelectTime);

    /**
     * 新增选课时间
     * 
     * @param tbCourseSelectTime 选课时间
     * @return 结果
     */
    public int insertTbCourseSelectTime(TbCourseSelectTime tbCourseSelectTime);

    /**
     * 修改选课时间
     * 
     * @param tbCourseSelectTime 选课时间
     * @return 结果
     */
    public int updateTbCourseSelectTime(TbCourseSelectTime tbCourseSelectTime);

    /**
     * 批量删除选课时间
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbCourseSelectTimeByIds(String ids);

    /**
     * 删除选课时间信息
     * 
     * @param id 选课时间ID
     * @return 结果
     */
    public int deleteTbCourseSelectTimeById(Long id);
}
