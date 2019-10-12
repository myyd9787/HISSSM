package com.neuedu.pojo;

public class User {
    private Integer ID;

    private String userName;

    private String password;

    private String realName;

    private Integer useType;

    private Integer docTitleID;

    private String isScheduling;

    private Integer deptID;

    private Integer registLeID;

    private Integer delMark;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Integer getUseType() {
        return useType;
    }

    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    public Integer getDocTitleID() {
        return docTitleID;
    }

    public void setDocTitleID(Integer docTitleID) {
        this.docTitleID = docTitleID;
    }

    public String getIsScheduling() {
        return isScheduling;
    }

    public void setIsScheduling(String isScheduling) {
        this.isScheduling = isScheduling == null ? null : isScheduling.trim();
    }

    public Integer getDeptID() {
        return deptID;
    }

    public void setDeptID(Integer deptID) {
        this.deptID = deptID;
    }

    public Integer getRegistLeID() {
        return registLeID;
    }

    public void setRegistLeID(Integer registLeID) {
        this.registLeID = registLeID;
    }

    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }
}