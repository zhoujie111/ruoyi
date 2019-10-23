package com.ruoyi.project.experimentteam.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

/**
 * 【请填写功能名称】对象 tb_website_experiment_team
 * 
 * @author ruoyi
 * @date 2019-10-22
 */
@Alias("TbWebsiteExperimentTeam")
public class TbWebsiteExperimentTeam extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String experimentTeam;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setExperimentTeam(String experimentTeam) 
    {
        this.experimentTeam = experimentTeam;
    }

    public String getExperimentTeam() 
    {
        return experimentTeam;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("experimentTeam", getExperimentTeam())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
