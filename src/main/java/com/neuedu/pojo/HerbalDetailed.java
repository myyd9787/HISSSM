package com.neuedu.pojo;

import java.math.BigDecimal;

public class HerbalDetailed {
    private Integer ID;

    private Integer herbalPresID;

    private Integer herbalID;

    private String dosage;

    private BigDecimal price;

    private String footnote;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getHerbalPresID() {
        return herbalPresID;
    }

    public void setHerbalPresID(Integer herbalPresID) {
        this.herbalPresID = herbalPresID;
    }

    public Integer getHerbalID() {
        return herbalID;
    }

    public void setHerbalID(Integer herbalID) {
        this.herbalID = herbalID;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage == null ? null : dosage.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFootnote() {
        return footnote;
    }

    public void setFootnote(String footnote) {
        this.footnote = footnote == null ? null : footnote.trim();
    }
}