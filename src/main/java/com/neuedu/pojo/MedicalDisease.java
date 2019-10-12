package com.neuedu.pojo;

import java.util.Date;

public class MedicalDisease {
    private Integer ID;

    private Integer medicalID;

    private Integer registID;

    private Integer diseaseID;

    private Integer diagnoseType;

    private Date getSiskDate;

    private Integer diagnoseCate;

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

    public Integer getDiseaseID() {
        return diseaseID;
    }

    public void setDiseaseID(Integer diseaseID) {
        this.diseaseID = diseaseID;
    }

    public Integer getDiagnoseType() {
        return diagnoseType;
    }

    public void setDiagnoseType(Integer diagnoseType) {
        this.diagnoseType = diagnoseType;
    }

    public Date getGetSiskDate() {
        return getSiskDate;
    }

    public void setGetSiskDate(Date getSiskDate) {
        this.getSiskDate = getSiskDate;
    }

    public Integer getDiagnoseCate() {
        return diagnoseCate;
    }

    public void setDiagnoseCate(Integer diagnoseCate) {
        this.diagnoseCate = diagnoseCate;
    }
}