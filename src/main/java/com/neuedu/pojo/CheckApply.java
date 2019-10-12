package com.neuedu.pojo;

import java.util.Date;

public class CheckApply {
    private Integer ID;

    private Integer medicalID;

    private Integer registID;

    private Integer itemID;

    private String name;

    private String objective;

    private String position;

    private Integer isUrgent;

    private Integer num;

    private Date creationTime;

    private Integer doctorID;

    private Integer checkOperID;

    private Integer resultOperID;

    private Date checkTime;

    private String result;

    private Date resultTime;

    private Integer state;

    private Integer recordType;

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

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective == null ? null : objective.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(Integer isUrgent) {
        this.isUrgent = isUrgent;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
    }

    public Integer getCheckOperID() {
        return checkOperID;
    }

    public void setCheckOperID(Integer checkOperID) {
        this.checkOperID = checkOperID;
    }

    public Integer getResultOperID() {
        return resultOperID;
    }

    public void setResultOperID(Integer resultOperID) {
        this.resultOperID = resultOperID;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Date getResultTime() {
        return resultTime;
    }

    public void setResultTime(Date resultTime) {
        this.resultTime = resultTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
    }
}