package com.ruoyi.project.course.service;


import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.course.domain.Course;
import com.ruoyi.project.course.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2019-10-16
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;


    @Override
    public Course selectCourseById(Long id)
    {
        return courseMapper.selectCourseById(id);
    }


    @Override
    public List<Course> selectCourseList(Course course)
    {
        return courseMapper.selectCourseList(course);
    }


    @Override
    public int insertCourse(Course course)
    {
        return courseMapper.insertCourse(course);
    }


    @Override
    public int updateCourse(Course course)
    {
        return courseMapper.updateCourse(course);
    }


    @Override
    public int deleteCourseByIds(String ids)
    {
        return courseMapper.deleteCourseByIds(Convert.toStrArray(ids));
    }
//
//
//    @Override
//    public int deleteCourseById(Long id)
//    {
//        return CourseMapper.deleteCourseById(id);
//    }
}

