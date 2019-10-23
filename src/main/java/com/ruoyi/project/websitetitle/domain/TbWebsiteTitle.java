package com.ruoyi.project.websitetitle.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

/**
 * 【请填写功能名称】对象 tb_website_title
 * 
 * @author ruoyi
 * @date 2019-10-18
 */
@Alias("TbWebsiteTitle")
public class TbWebsiteTitle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 栏目标题 */
    @Excel(name = "栏目标题")
    private String websiteTitleName;

    /** 多对1 标题所属类型 */
    @Excel(name = "标题所属类型")
    private Long websiteTypeId;

    // todo 新增2019年10月21日10:45:44
    @Excel(name = "内容")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId()
    {
        return id;
    }
    public void setWebsiteTitleName(String websiteTitleName) 
    {
        this.websiteTitleName = websiteTitleName;
    }

    public String getWebsiteTitleName() 
    {
        return websiteTitleName;
    }
    public void setWebsiteTypeId(Long websiteTypeId) 
    {
        this.websiteTypeId = websiteTypeId;
    }

    public Long getWebsiteTypeId() 
    {
        return websiteTypeId;
    }

    @Override
    public String toString() {
        return "TbWebsiteTitle{" +
                "id=" + id +
                ", websiteTitleName='" + websiteTitleName + '\'' +
                ", websiteTypeId=" + websiteTypeId +
                ", content='" + content + '\'' +
                '}';
    }
}
