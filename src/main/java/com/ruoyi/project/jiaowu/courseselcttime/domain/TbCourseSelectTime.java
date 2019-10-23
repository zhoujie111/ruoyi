package com.ruoyi.project.jiaowu.courseselcttime.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 选课时间对象 tb_course_select_time
 * 
 * @author zhoujie
 * @date 2019-10-23
 */
@Alias("TbCourseSelectTime")
public class TbCourseSelectTime extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 选课开始时间 */
    @Excel(name = "选课开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 选课结束时间 */
    @Excel(name = "选课结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 学生类型id */
    @Excel(name = "学生类型id")
    private Long studentTypeId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setStudentTypeId(Long studentTypeId) 
    {
        this.studentTypeId = studentTypeId;
    }

    public Long getStudentTypeId() 
    {
        return studentTypeId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("studentTypeId", getStudentTypeId())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
