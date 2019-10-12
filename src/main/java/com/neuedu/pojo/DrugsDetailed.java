package com.neuedu.pojo;

public class DrugsDetailed {
    private Integer ID;

    private Integer drugsTempID;

    private Integer drugsID;

    private String drugsUsage;

    private String dosage;

    private String frequency;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getDrugsTempID() {
        return drugsTempID;
    }

    public void setDrugsTempID(Integer drugsTempID) {
        this.drugsTempID = drugsTempID;
    }

    public Integer getDrugsID() {
        return drugsID;
    }

    public void setDrugsID(Integer drugsID) {
        this.drugsID = drugsID;
    }

    public String getDrugsUsage() {
        return drugsUsage;
    }

    public void setDrugsUsage(String drugsUsage) {
        this.drugsUsage = drugsUsage == null ? null : drugsUsage.trim();
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage == null ? null : dosage.trim();
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }
}