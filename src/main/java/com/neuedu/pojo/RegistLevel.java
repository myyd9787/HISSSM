package com.neuedu.pojo;

import java.math.BigDecimal;

public class RegistLevel {
    private Integer ID;

    private String registCode;

    private String registName;

    private Integer sequenceNo;

    private BigDecimal registFee;

    private Integer registQuota;

    private Integer delMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getRegistCode() {
        return registCode;
    }

    public void setRegistCode(String registCode) {
        this.registCode = registCode == null ? null : registCode.trim();
    }

    public String getRegistName() {
        return registName;
    }

    public void setRegistName(String registName) {
        this.registName = registName == null ? null : registName.trim();
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public BigDecimal getRegistFee() {
        return registFee;
    }

    public void setRegistFee(BigDecimal registFee) {
        this.registFee = registFee;
    }

    public Integer getRegistQuota() {
        return registQuota;
    }

    public void setRegistQuota(Integer registQuota) {
        this.registQuota = registQuota;
    }

    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }
}