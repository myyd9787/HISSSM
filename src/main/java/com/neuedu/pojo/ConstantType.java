package com.neuedu.pojo;

public class ConstantType {
    private Integer ID;

    private String constantTypeCode;

    private String constantTypeName;

    private Integer delMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getConstantTypeCode() {
        return constantTypeCode;
    }

    public void setConstantTypeCode(String constantTypeCode) {
        this.constantTypeCode = constantTypeCode == null ? null : constantTypeCode.trim();
    }

    public String getConstantTypeName() {
        return constantTypeName;
    }

    public void setConstantTypeName(String constantTypeName) {
        this.constantTypeName = constantTypeName == null ? null : constantTypeName.trim();
    }

    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }
}