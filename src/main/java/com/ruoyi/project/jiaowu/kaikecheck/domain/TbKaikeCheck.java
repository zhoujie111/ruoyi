package com.ruoyi.project.jiaowu.kaikecheck.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

/**
 * 开课审核对象 tb_kaike_check
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
@Alias("TbKaikeCheck")
public class TbKaikeCheck extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 开课课程 */
    @Excel(name = "开课课程")
    private String kaikeCourse;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 课程教师 */
    @Excel(name = "课程教师")
    private String courseTeacher;

    /** 目标选修人数 */
    @Excel(name = "目标选修人数")
    private Long targetSelectCourse;

    /** 实际选修人数 */
    @Excel(name = "实际选修人数")
    private String selectCourse;

    /** 发布状态 */
    @Excel(name = "发布状态")
    private Long fabuState;

    /** 开课状态 */
    @Excel(name = "开课状态")
    private Long kaikeState;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setKaikeCourse(String kaikeCourse) 
    {
        this.kaikeCourse = kaikeCourse;
    }

    public String getKaikeCourse() 
    {
        return kaikeCourse;
    }
    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    public String getCourseName() 
    {
        return courseName;
    }
    public void setCourseTeacher(String courseTeacher) 
    {
        this.courseTeacher = courseTeacher;
    }

    public String getCourseTeacher() 
    {
        return courseTeacher;
    }
    public void setTargetSelectCourse(Long targetSelectCourse) 
    {
        this.targetSelectCourse = targetSelectCourse;
    }

    public Long getTargetSelectCourse() 
    {
        return targetSelectCourse;
    }
    public void setSelectCourse(String selectCourse) 
    {
        this.selectCourse = selectCourse;
    }

    public String getSelectCourse() 
    {
        return selectCourse;
    }
    public void setFabuState(Long fabuState) 
    {
        this.fabuState = fabuState;
    }

    public Long getFabuState() 
    {
        return fabuState;
    }
    public void setKaikeState(Long kaikeState) 
    {
        this.kaikeState = kaikeState;
    }

    public Long getKaikeState() 
    {
        return kaikeState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("kaikeCourse", getKaikeCourse())
            .append("courseName", getCourseName())
            .append("courseTeacher", getCourseTeacher())
            .append("targetSelectCourse", getTargetSelectCourse())
            .append("selectCourse", getSelectCourse())
            .append("fabuState", getFabuState())
            .append("kaikeState", getKaikeState())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
