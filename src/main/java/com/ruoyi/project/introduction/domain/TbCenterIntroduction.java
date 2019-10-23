package com.ruoyi.project.introduction.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

/**
 * 【请填写功能名称】对象 tb_center_introduction
 * 
 * @author ruoyi
 * @date 2019-10-22
 */
@Alias("TbCenterIntroduction")
public class TbCenterIntroduction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 中心介绍 */
    @Excel(name = "中心介绍")
    private String centerIntroduction;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCenterIntroduction(String centerIntroduction) 
    {
        this.centerIntroduction = centerIntroduction;
    }

    public String getCenterIntroduction() 
    {
        return centerIntroduction;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("centerIntroduction", getCenterIntroduction())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
