package com.ruoyi.project.jiaowu.classtime.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 上课时间对象 tb_class_time
 * 
 * @author zhoujie
 * @date 2019-10-23
 */
@Alias("TbClassTime")
public class TbClassTime extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Long id;

    /** 节次 */
    @Excel(name = "节次")
    private String section;

    /** 上课时间 */
    @Excel(name = "上课时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date classStartTime;

    /** 下课时间 */
    @Excel(name = "下课时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date classEndTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSection(String section) 
    {
        this.section = section;
    }

    public String getSection() 
    {
        return section;
    }
    public void setClassStartTime(Date classStartTime) 
    {
        this.classStartTime = classStartTime;
    }

    public Date getClassStartTime() 
    {
        return classStartTime;
    }
    public void setClassEndTime(Date classEndTime) 
    {
        this.classEndTime = classEndTime;
    }

    public Date getClassEndTime() 
    {
        return classEndTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("section", getSection())
            .append("classStartTime", getClassStartTime())
            .append("classEndTime", getClassEndTime())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
