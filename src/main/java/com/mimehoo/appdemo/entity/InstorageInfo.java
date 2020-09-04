package com.mimehoo.appdemo.entity;

import java.util.Date;

public class InstorageInfo {
    private Long id;
    private Long messageId;
    private Date createTime;
    private String instorageNo;
    private String productCode;
    private String producterId;
    private String dispatchId;
    private int receiveNumber;
    private String unit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getInstorageNo() {
        return instorageNo;
    }

    public void setInstorageNo(String instorageNo) {
        this.instorageNo = instorageNo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProducterId() {
        return producterId;
    }

    public void setProducterId(String producterId) {
        this.producterId = producterId;
    }

    public String getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(String dispatchId) {
        this.dispatchId = dispatchId;
    }

    public int getReceiveNumber() {
        return receiveNumber;
    }

    public void setReceiveNumber(int receiveNumber) {
        this.receiveNumber = receiveNumber;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "InstorageInfo{" +
                "id=" + id +
                ", messageId=" + messageId +
                ", createTime=" + createTime +
                ", instorageNo='" + instorageNo + '\'' +
                ", productCode='" + productCode + '\'' +
                ", producterId='" + producterId + '\'' +
                ", dispatchId='" + dispatchId + '\'' +
                ", receiveNumber=" + receiveNumber +
                ", unit='" + unit + '\'' +
                '}';
    }
}
