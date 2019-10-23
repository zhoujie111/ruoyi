package com.ruoyi.project.lab.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * 实验室管理
 */
@Alias("Lab")
public class Lab {
    //主键
    private Integer id;
    //实验室编号
    @Excel(name = "实验室编号")
    private String labCode;
    //实验室地址
    @Excel(name = "实验室地址")
    private String labAddress;
    //开始时间
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss", type = Excel.Type.EXPORT)
    private Date labStartTime;
    //结束时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss", type = Excel.Type.EXPORT)
    private Date labEndTime;
    //创建者
    private String labCreater;
    //状态
    private String labStatus;
    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    //最后一次更新时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    //实验室名称
    @Excel(name = "实验室名称")
    private String labName;

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabCode() {
        return labCode;
    }

    public void setLabCode(String labCode) {
        this.labCode = labCode;
    }

    public String getLabAddress() {
        return labAddress;
    }

    public void setLabAddress(String labAddress) {
        this.labAddress = labAddress;
    }

    public Date getLabStartTime() {
        return labStartTime;
    }

    public void setLabStartTime(Date labStartTime) {
        this.labStartTime = labStartTime;
    }

    public Date getLabEndTime() {
        return labEndTime;
    }

    public void setLabEndTime(Date labEndTime) {
        this.labEndTime = labEndTime;
    }

    public String getLabCreater() {
        return labCreater;
    }

    public void setLabCreater(String labCreater) {
        this.labCreater = labCreater;
    }

    public String getLabStatus() {
        return labStatus;
    }

    public void setLabStatus(String labStatus) {
        this.labStatus = labStatus;
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
        return "Lab{" +
                "id=" + id +
                ", labCode='" + labCode + '\'' +
                ", labAddress='" + labAddress + '\'' +
                ", labStartTime=" + labStartTime +
                ", labEndTime=" + labEndTime +
                ", labCreater='" + labCreater + '\'' +
                ", labStatus='" + labStatus + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", labName='" + labName + '\'' +
                '}';
    }
}
