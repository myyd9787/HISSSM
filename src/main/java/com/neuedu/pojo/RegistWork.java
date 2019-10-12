package com.neuedu.pojo;

import java.util.Date;

public class RegistWork {
    private Integer ID;

    private Integer registerID;

    private Date startTime;

    private Date endTime;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getRegisterID() {
        return registerID;
    }

    public void setRegisterID(Integer registerID) {
        this.registerID = registerID;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}