package com.neuedu.pojo;

public class DiseCategory {
    private Integer ID;

    private String dicaCode;

    private String dicaName;

    private Integer sequenceNo;

    private Integer dicaType;

    private Integer delMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDicaCode() {
        return dicaCode;
    }

    public void setDicaCode(String dicaCode) {
        this.dicaCode = dicaCode == null ? null : dicaCode.trim();
    }

    public String getDicaName() {
        return dicaName;
    }

    public void setDicaName(String dicaName) {
        this.dicaName = dicaName == null ? null : dicaName.trim();
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public Integer getDicaType() {
        return dicaType;
    }

    public void setDicaType(Integer dicaType) {
        this.dicaType = dicaType;
    }

    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }
}