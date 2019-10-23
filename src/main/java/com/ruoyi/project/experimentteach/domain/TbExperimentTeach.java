package com.ruoyi.project.experimentteach.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

/**
 * 【请填写功能名称】对象 tb_experiment_teach
 * 
 * @author ruoyi
 * @date 2019-10-22
 */
@Alias("TbExperimentTeach")
public class TbExperimentTeach extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String experimentTeach;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setExperimentTeach(String experimentTeach) 
    {
        this.experimentTeach = experimentTeach;
    }

    public String getExperimentTeach() 
    {
        return experimentTeach;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("experimentTeach", getExperimentTeach())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
