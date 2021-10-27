package com.example.demo.beans;

import java.util.List;


public class RiskCalculation {
    //{"userId":"1","symptoms":["fever","cold","cough"],"travelHistory":true,"contactWithCovidPatient":true}
    private Integer userId;
    private List<String> symptoms;
    private Boolean travelHistory;
    private Boolean contactWithCovidPatient;

    public RiskCalculation(Integer userId, List<String> symptonms, Boolean travelHistory, Boolean contactWithCovidPatient) {
        this.userId = userId;
        this.symptoms = symptonms;
        this.travelHistory = travelHistory;
        this.contactWithCovidPatient = contactWithCovidPatient;
    }

    public RiskCalculation() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public Boolean getTravelHistory() {
        return travelHistory;
    }

    public void setTravelHistory(Boolean travelHistory) {
        this.travelHistory = travelHistory;
    }

    public Boolean getContactWithCovidPatient() {
        return contactWithCovidPatient;
    }

    public void setContactWithCovidPatient(Boolean contactWithCovidPatient) {
        this.contactWithCovidPatient = contactWithCovidPatient;
    }
}
