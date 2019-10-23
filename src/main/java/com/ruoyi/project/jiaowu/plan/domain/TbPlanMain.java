package com.ruoyi.project.jiaowu.plan.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 【请填写功能名称】对象 tb_plan_main
 * 
 * @author ruoyi
 * @date 2019-10-23
 */
@Alias("TbPlanMain")
public class TbPlanMain extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 培养计划名称 */
    @Excel(name = "培养计划名称")
    private String planName;

    /** 专业 */
    @Excel(name = "专业")
    private String profession;

    /** 版本 */
    @Excel(name = "版本")
    private String version;

    /** 生效时间 */
    @Excel(name = "生效时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date effectiveTime;

    /** 总分数 */
    @Excel(name = "总分数")
    private String totalScores;

    /** 总学时 */
    @Excel(name = "总学时")
    private String totalTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPlanName(String planName) 
    {
        this.planName = planName;
    }

    public String getPlanName() 
    {
        return planName;
    }
    public void setProfession(String profession) 
    {
        this.profession = profession;
    }

    public String getProfession() 
    {
        return profession;
    }
    public void setVersion(String version) 
    {
        this.version = version;
    }

    public String getVersion() 
    {
        return version;
    }
    public void setEffectiveTime(Date effectiveTime) 
    {
        this.effectiveTime = effectiveTime;
    }

    public Date getEffectiveTime() 
    {
        return effectiveTime;
    }
    public void setTotalScores(String totalScores) 
    {
        this.totalScores = totalScores;
    }

    public String getTotalScores() 
    {
        return totalScores;
    }
    public void setTotalTime(String totalTime) 
    {
        this.totalTime = totalTime;
    }

    public String getTotalTime() 
    {
        return totalTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("planName", getPlanName())
            .append("profession", getProfession())
            .append("version", getVersion())
            .append("effectiveTime", getEffectiveTime())
            .append("totalScores", getTotalScores())
            .append("totalTime", getTotalTime())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
