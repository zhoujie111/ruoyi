package com.ruoyi.project.websiteimg.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.ibatis.type.Alias;

/**
 * 【请填写功能名称】对象 tb_website_img
 * 
 * @author ruoyi
 * @date 2019-10-21
 */
@Alias("TbWebsiteImg")
public class TbWebsiteImg extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 图片名称 */
    @Excel(name = "图片名称")
    private String imageName;

    private String uploadPath;//图片存储的相对路径

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    /** 图片上传路径（相对） */
    @Excel(name = "图片上传路径", readConverterExp = "相对")
    private String src;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setImageName(String imageName) 
    {
        this.imageName = imageName;
    }

    public String getImageName() 
    {
        return imageName;
    }
    public void setSrc(String src) 
    {
        this.src = src;
    }

    public String getSrc() 
    {
        return src;
    }

    @Override
    public String toString() {
        return "TbWebsiteImg{" +
                "id=" + id +
                ", imageName='" + imageName + '\'' +
                ", uploadPath='" + uploadPath + '\'' +
                ", src='" + src + '\'' +
                '}';
    }
}
