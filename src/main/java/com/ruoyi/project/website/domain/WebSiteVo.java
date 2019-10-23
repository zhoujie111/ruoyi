package com.ruoyi.project.website.domain;

import org.apache.ibatis.type.Alias;

/**
 * 封装前台数据
 */
@Alias("WebSiteVo")
public class WebSiteVo {
    private Integer id;
    private Integer websiteType;//栏目类型
    private String title;//栏目标题
    private String content;//栏目内容
    private Long titleId;//标题id

    public Long getTitleId() {
        return titleId;
    }

    public void setTitleId(Long titleId) {
        this.titleId = titleId;
    }

    public WebSiteVo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWebsiteType() {
        return websiteType;
    }

    public void setWebsiteType(Integer websiteType) {
        this.websiteType = websiteType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WebSiteVo{" +
                "id=" + id +
                ", websiteType=" + websiteType +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", titleId=" + titleId +
                '}';
    }
}
