package com.neuedu.pojo;

import java.util.Date;

public class HerbalPrescription {
    private Integer ID;

    private Integer medicalID;

    private Integer registID;

    private Integer userID;

    private String prescriptionName;

    private Date creationTime;

    private String prescriptioType;

    private Integer payNumber;

    private String frequency;

    private String drugsUsage;

    private String therapy;

    private String detailed;

    private String advice;

    private Integer state;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getMedicalID() {
        return medicalID;
    }

    public void setMedicalID(Integer medicalID) {
        this.medicalID = medicalID;
    }

    public Integer getRegistID() {
        return registID;
    }

    public void setRegistID(Integer registID) {
        this.registID = registID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getPrescriptionName() {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName == null ? null : prescriptionName.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getPrescriptioType() {
        return prescriptioType;
    }

    public void setPrescriptioType(String prescriptioType) {
        this.prescriptioType = prescriptioType == null ? null : prescriptioType.trim();
    }

    public Integer getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(Integer payNumber) {
        this.payNumber = payNumber;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    public String getDrugsUsage() {
        return drugsUsage;
    }

    public void setDrugsUsage(String drugsUsage) {
        this.drugsUsage = drugsUsage == null ? null : drugsUsage.trim();
    }

    public String getTherapy() {
        return therapy;
    }

    public void setTherapy(String therapy) {
        this.therapy = therapy == null ? null : therapy.trim();
    }

    public String getDetailed() {
        return detailed;
    }

    public void setDetailed(String detailed) {
        this.detailed = detailed == null ? null : detailed.trim();
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}