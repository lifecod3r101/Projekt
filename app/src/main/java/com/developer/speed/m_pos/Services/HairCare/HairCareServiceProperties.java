package com.developer.speed.m_pos.Services.HairCare;

public class HairCareServiceProperties {
    String haircareCode, haircareName;
    double haircareCost;

    public HairCareServiceProperties(String haircareCode, String haircareName, double haircareCost) {
        this.haircareCode = haircareCode;
        this.haircareName = haircareName;
        this.haircareCost = haircareCost;
    }

    public String getHaircareCode() {
        return this.haircareCode;
    }

    public void setHaircareCode(String haircareCode) {
        this.haircareCode = haircareCode;
    }

    public String getHaircareName() {
        return this.haircareName;
    }

    public void setHaircareName(String haircareName) {
        this.haircareName = haircareName;
    }

    public double getHaircareCost() {
        return this.haircareCost;
    }

    public void setHaircareCost(double haircareCost) {
        this.haircareCost = haircareCost;
    }
}
