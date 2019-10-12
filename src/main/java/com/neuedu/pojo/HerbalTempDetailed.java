package com.neuedu.pojo;

public class HerbalTempDetailed {
    private Integer ID;

    private Integer herbalTempID;

    private Integer herbalID;

    private String dosage;

    private String unit;

    private String footnote;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getHerbalTempID() {
        return herbalTempID;
    }

    public void setHerbalTempID(Integer herbalTempID) {
        this.herbalTempID = herbalTempID;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getFootnote() {
        return footnote;
    }

    public void setFootnote(String footnote) {
        this.footnote = footnote == null ? null : footnote.trim();
    }
}