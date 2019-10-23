package com.ruoyi.project.course.mapper;


import com.ruoyi.project.course.domain.Course;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2019-10-16
 */
public interface CourseMapper
{
//    /**
//     * 查询【请填写功能名称】
//     *
//     * @param id 【请填写功能名称】ID
//     * @return 【请填写功能名称】
//     */
    public Course selectCourseById(Long id);


    public List<Course> selectCourseList(Course course);

//    /**
//     * 新增【请填写功能名称】
//     *
//     * @param tbCourse 【请填写功能名称】
//     * @return 结果
//     */
    public int insertCourse(Course course);
//
//    /**
//     * 修改【请填写功能名称】
//     *
//     * @param tbCourse 【请填写功能名称】
//     * @return 结果
//     */
    public int updateCourse(Course course);
//
//    /**
//     * 删除【请填写功能名称】
//     *
//     * @param id 【请填写功能名称】ID
//     * @return 结果
//     */
//    public int deleteCourseById(Long id);
//
//    /**
//     * 批量删除【请填写功能名称】
//     *
//     * @param ids 需要删除的数据ID
//     * @return 结果
//     */
    public int deleteCourseByIds(String[] ids);
}
