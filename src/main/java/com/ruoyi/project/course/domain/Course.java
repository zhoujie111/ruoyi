package com.ruoyi.project.course.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("Course")
public class Course extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 实验名称 */
    @Excel(name = "实验名称")
    private String experimentName;

    /** 课程名称 */
    @Excel(name = "课程名称")
    private String courseName;

    /** 实验开始时间 */
    @Excel(name = "实验开始时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date experimentStartTime;

    /** 实验结束时间 */
    @Excel(name = "实验结束时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date experimentEndTime;

    @Excel(name = "实验创建时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setExperimentName(String experimentName)
    {
        this.experimentName = experimentName;
    }

    public String getExperimentName()
    {
        return experimentName;
    }
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getCourseName()
    {
        return courseName;
    }
    public void setExperimentStartTime(Date experimentStartTime)
    {
        this.experimentStartTime = experimentStartTime;
    }

    public Date getExperimentStartTime()
    {
        return experimentStartTime;
    }
    public void setExperimentEndTime(Date experimentEndTime)
    {
        this.experimentEndTime = experimentEndTime;
    }

    public Date getExperimentEndTime()
    {
        return experimentEndTime;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", experimentName='" + experimentName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", experimentStartTime=" + experimentStartTime +
                ", experimentEndTime=" + experimentEndTime +
                '}';
    }
}
