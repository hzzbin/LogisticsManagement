package com.fan.model;

import java.util.Date;

public class Order {
    private Long id;

    private Long userId;

    private String sourceAddr;

    private String distAddr;

    private String sourceUsername;

    private String sourceTel;

    private String distUsername;

    private String distTel;

    private String itemDesc;

    private Integer itemWeight;

    private Integer totalPrice;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSourceAddr() {
        return sourceAddr;
    }

    public void setSourceAddr(String sourceAddr) {
        this.sourceAddr = sourceAddr;
    }

    public String getDistAddr() {
        return distAddr;
    }

    public void setDistAddr(String distAddr) {
        this.distAddr = distAddr;
    }

    public String getSourceUsername() {
        return sourceUsername;
    }

    public void setSourceUsername(String sourceUsername) {
        this.sourceUsername = sourceUsername;
    }

    public String getSourceTel() {
        return sourceTel;
    }

    public void setSourceTel(String sourceTel) {
        this.sourceTel = sourceTel;
    }

    public String getDistUsername() {
        return distUsername;
    }

    public void setDistUsername(String distUsername) {
        this.distUsername = distUsername;
    }

    public String getDistTel() {
        return distTel;
    }

    public void setDistTel(String distTel) {
        this.distTel = distTel;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public Integer getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(Integer itemWeight) {
        this.itemWeight = itemWeight;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
}
