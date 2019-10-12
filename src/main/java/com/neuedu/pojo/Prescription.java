package com.neuedu.pojo;

import java.util.Date;

public class Prescription {
    private Integer ID;

    private Integer medicalID;

    private Integer registID;

    private Integer userID;

    private String prescriptionName;

    private Date prescriptionTime;

    private Integer prescriptionState;

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

    public Date getPrescriptionTime() {
        return prescriptionTime;
    }

    public void setPrescriptionTime(Date prescriptionTime) {
        this.prescriptionTime = prescriptionTime;
    }

    public Integer getPrescriptionState() {
        return prescriptionState;
    }

    public void setPrescriptionState(Integer prescriptionState) {
        this.prescriptionState = prescriptionState;
    }
}