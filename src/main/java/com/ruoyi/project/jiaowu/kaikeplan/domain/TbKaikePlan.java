package com.ruoyi.project.jiaowu.kaikeplan.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 开课计划对象 tb_kaike_plan
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
@Alias("TbKaikePlan")
public class TbKaikePlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 开课名称 */
    @Excel(name = "开课名称")
    private String kaikeName;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 开课教师 */
    @Excel(name = "开课教师")
    private String courseTeacher;

    /** 上课时间 */
    @Excel(name = "上课时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date courseTime;

    /** 上课地点 */
    @Excel(name = "上课地点")
    private String courseAddress;

    /** 发布状态 */
    @Excel(name = "发布状态")
    private Long fabuState;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setKaikeName(String kaikeName) 
    {
        this.kaikeName = kaikeName;
    }

    public String getKaikeName() 
    {
        return kaikeName;
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
    public void setCourseTime(Date courseTime) 
    {
        this.courseTime = courseTime;
    }

    public Date getCourseTime() 
    {
        return courseTime;
    }
    public void setCourseAddress(String courseAddress) 
    {
        this.courseAddress = courseAddress;
    }

    public String getCourseAddress() 
    {
        return courseAddress;
    }
    public void setFabuState(Long fabuState) 
    {
        this.fabuState = fabuState;
    }

    public Long getFabuState() 
    {
        return fabuState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("kaikeName", getKaikeName())
            .append("courseName", getCourseName())
            .append("courseTeacher", getCourseTeacher())
            .append("courseTime", getCourseTime())
            .append("courseAddress", getCourseAddress())
            .append("fabuState", getFabuState())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
