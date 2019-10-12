package com.neuedu.pojo;

public class Disease {
    private Integer ID;

    private String diseaseCode;

    private String diseaseName;

    private String diseaseICD;

    private Integer diseCategoryID;

    private Integer delMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode == null ? null : diseaseCode.trim();
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName == null ? null : diseaseName.trim();
    }

    public String getDiseaseICD() {
        return diseaseICD;
    }

    public void setDiseaseICD(String diseaseICD) {
        this.diseaseICD = diseaseICD == null ? null : diseaseICD.trim();
    }

    public Integer getDiseCategoryID() {
        return diseCategoryID;
    }

    public void setDiseCategoryID(Integer diseCategoryID) {
        this.diseCategoryID = diseCategoryID;
    }

    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }
}