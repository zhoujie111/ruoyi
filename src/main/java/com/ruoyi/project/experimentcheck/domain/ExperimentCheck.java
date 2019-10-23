package com.ruoyi.project.experimentcheck.domain;


import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 【请填写功能名称】对象 tb_experiment_check
 *
 * @author ruoyi
 * @date 2019-10-16
 */
@Alias("ExperimentCheck")
public class ExperimentCheck extends BaseEntity
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

    /** 实验状态 */
    @Excel(name = "实验状态")
    private String experimentStatus;

    /** 批改状态 */
    @Excel(name = "批改状态")
    private String checkStatus;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    private Date createTime;
    private Date updateTime;

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public Date getUpdateTime() {
        return updateTime;
    }

    @Override
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

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
    public void setExperimentStatus(String experimentStatus)
    {
        this.experimentStatus = experimentStatus;
    }

    public String getExperimentStatus()
    {
        return experimentStatus;
    }
    public void setCheckStatus(String checkStatus)
    {
        this.checkStatus = checkStatus;
    }

    public String getCheckStatus()
    {
        return checkStatus;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    @Override
    public String toString() {
        return "ExperimentCheck{" +
                "id=" + id +
                ", experimentName='" + experimentName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", experimentStatus='" + experimentStatus + '\'' +
                ", checkStatus='" + checkStatus + '\'' +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
