package com.neuedu.pojo;

public class CheckRelation {
    private Integer ID;

    private Integer checkProjID;

    private Integer checkTempID;

    private String position;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getCheckProjID() {
        return checkProjID;
    }

    public void setCheckProjID(Integer checkProjID) {
        this.checkProjID = checkProjID;
    }

    public Integer getCheckTempID() {
        return checkTempID;
    }

    public void setCheckTempID(Integer checkTempID) {
        this.checkTempID = checkTempID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
}