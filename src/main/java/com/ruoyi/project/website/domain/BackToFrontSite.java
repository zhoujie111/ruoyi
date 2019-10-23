package com.ruoyi.project.website.domain;

import org.apache.ibatis.type.Alias;

import java.util.Date;

@Alias("BackToFrontSite")
public class BackToFrontSite {
    private Long id;
    private String title;
    private Date createTime;
    private Date updateTime;
    private Long websiteType;
    private Long titleId;
    private String content;
    private String webSiteTitleName;
    private Long websiteTypeId;

    public Long getWebsiteTypeId() {
        return websiteTypeId;
    }

    public void setWebsiteTypeId(Long websiteTypeId) {
        this.websiteTypeId = websiteTypeId;
    }

    public String getWebSiteTitleName() {
        return webSiteTitleName;
    }

    public void setWebSiteTitleName(String webSiteTitleName) {
        this.webSiteTitleName = webSiteTitleName;
    }

    public Long getTitleId() {
        return titleId;
    }

    public void setTitleId(Long titleId) {
        this.titleId = titleId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getWebsiteType() {
        return websiteType;
    }

    public void setWebsiteType(Long websiteType) {
        this.websiteType = websiteType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "BackToFrontSite{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", websiteType=" + websiteType +
                ", titleId=" + titleId +
                ", content='" + content + '\'' +
                ", webSiteTitleName='" + webSiteTitleName + '\'' +
                ", websiteTypeId=" + websiteTypeId +
                '}';
    }
}
