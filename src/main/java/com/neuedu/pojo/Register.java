package com.neuedu.pojo;

import java.util.Date;

public class Register {
    private Integer ID;

    private String caseNumber;

    private String realName;

    private Integer gender;

    private String IDnumber;

    private Date birthDate;

    private Integer age;

    private String ageType;

    private String homeAddress;

    private Date visitDate;

    private String noon;

    private Integer deptID;

    private Integer userID;

    private Integer registLeID;

    private Integer settleID;

    private String isBook;

    private Date registTime;

    private Integer registerID;

    private Integer visitState;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber == null ? null : caseNumber.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(String IDnumber) {
        this.IDnumber = IDnumber == null ? null : IDnumber.trim();
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAgeType() {
        return ageType;
    }

    public void setAgeType(String ageType) {
        this.ageType = ageType == null ? null : ageType.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public String getNoon() {
        return noon;
    }

    public void setNoon(String noon) {
        this.noon = noon == null ? null : noon.trim();
    }

    public Integer getDeptID() {
        return deptID;
    }

    public void setDeptID(Integer deptID) {
        this.deptID = deptID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getRegistLeID() {
        return registLeID;
    }

    public void setRegistLeID(Integer registLeID) {
        this.registLeID = registLeID;
    }

    public Integer getSettleID() {
        return settleID;
    }

    public void setSettleID(Integer settleID) {
        this.settleID = settleID;
    }

    public String getIsBook() {
        return isBook;
    }

    public void setIsBook(String isBook) {
        this.isBook = isBook == null ? null : isBook.trim();
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Integer getRegisterID() {
        return registerID;
    }

    public void setRegisterID(Integer registerID) {
        this.registerID = registerID;
    }

    public Integer getVisitState() {
        return visitState;
    }

    public void setVisitState(Integer visitState) {
        this.visitState = visitState;
    }
}