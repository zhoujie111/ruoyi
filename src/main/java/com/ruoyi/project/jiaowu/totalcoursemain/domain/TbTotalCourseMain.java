package com.ruoyi.project.jiaowu.totalcoursemain.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

/**
 * 【请填写功能名称】对象 tb_total_course_main
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
@Alias("TbTotalCourseMain")
public class TbTotalCourseMain extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 课程代码 */
    @Excel(name = "课程代码")
    private String courseCode;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 学时 */
    @Excel(name = "学时")
    private Long studyTime;

    /** 学分 */
    @Excel(name = "学分")
    private Long studyScore;

    /** 教师姓名 */
    @Excel(name = "教师姓名")
    private String teacherName;

    /** 班级 */
    @Excel(name = "班级")
    private String tbClass;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCourseCode(String courseCode) 
    {
        this.courseCode = courseCode;
    }

    public String getCourseCode() 
    {
        return courseCode;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setStudyTime(Long studyTime) 
    {
        this.studyTime = studyTime;
    }

    public Long getStudyTime()
    {
        return studyTime;
    }
    public void setStudyScore(Long studyScore) 
    {
        this.studyScore = studyScore;
    }

    public Long getStudyScore()
    {
        return studyScore;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setTbClass(String tbClass)
    {
        this.tbClass = tbClass;
    }

    public String getTbClass() 
    {
        return tbClass;
    }

    @Override
    public String toString() {
        return "TbTotalCourseMain{" +
                "id=" + id +
                ", courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", studyTime=" + studyTime +
                ", studyScore=" + studyScore +
                ", teacherName='" + teacherName + '\'' +
                ", tbClass='" + tbClass + '\'' +
                '}';
    }
}
