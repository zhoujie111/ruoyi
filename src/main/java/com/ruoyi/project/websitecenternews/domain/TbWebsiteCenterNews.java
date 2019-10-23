package com.ruoyi.project.websitecenternews.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

/**
 * 【请填写功能名称】对象 tb_website_center_news
 * 
 * @author ruoyi
 * @date 2019-10-21
 */
@Alias("TbWebsiteCenterNews")
public class TbWebsiteCenterNews extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 中心新闻 */
    @Excel(name = "中心新闻")
    private String centerNews;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCenterNews(String centerNews) 
    {
        this.centerNews = centerNews;
    }

    public String getCenterNews() 
    {
        return centerNews;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("centerNews", getCenterNews())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
