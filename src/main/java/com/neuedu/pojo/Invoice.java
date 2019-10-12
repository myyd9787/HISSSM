package com.neuedu.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Invoice {
    private Integer ID;

    private String invoiceNum;

    private BigDecimal money;

    private Integer state;

    private Date creationTime;

    private Integer userID;

    private Integer registID;

    private Integer feeType;

    private String back;

    private Integer dailyState;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum == null ? null : invoiceNum.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getRegistID() {
        return registID;
    }

    public void setRegistID(Integer registID) {
        this.registID = registID;
    }

    public Integer getFeeType() {
        return feeType;
    }

    public void setFeeType(Integer feeType) {
        this.feeType = feeType;
    }

    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back == null ? null : back.trim();
    }

    public Integer getDailyState() {
        return dailyState;
    }

    public void setDailyState(Integer dailyState) {
        this.dailyState = dailyState;
    }
}