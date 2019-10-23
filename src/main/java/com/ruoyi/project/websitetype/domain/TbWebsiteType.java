package com.ruoyi.project.websitetype.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

/**
 * 【请填写功能名称】对象 tb_website_type
 * 
 * @author ruoyi
 * @date 2019-10-18
 */
@Alias("TbWebsiteType")
public class TbWebsiteType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 栏目类型 */
    @Excel(name = "栏目类型")
    private String websiteTypeName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWebsiteTypeName(String websiteTypeName) 
    {
        this.websiteTypeName = websiteTypeName;
    }

    public String getWebsiteTypeName() 
    {
        return websiteTypeName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("websiteTypeName", getWebsiteTypeName())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
