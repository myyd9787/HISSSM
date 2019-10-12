package com.neuedu.pojo;

public class ConstantItem {
    private Integer ID;

    private Integer constantTypeID;

    private String constantCode;

    private String constantName;

    private Integer delMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getConstantTypeID() {
        return constantTypeID;
    }

    public void setConstantTypeID(Integer constantTypeID) {
        this.constantTypeID = constantTypeID;
    }

    public String getConstantCode() {
        return constantCode;
    }

    public void setConstantCode(String constantCode) {
        this.constantCode = constantCode == null ? null : constantCode.trim();
    }

    public String getConstantName() {
        return constantName;
    }

    public void setConstantName(String constantName) {
        this.constantName = constantName == null ? null : constantName.trim();
    }

    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }
}