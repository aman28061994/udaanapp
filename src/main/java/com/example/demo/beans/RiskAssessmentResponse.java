package com.example.demo.beans;

public class RiskAssessmentResponse {
    private Integer riskPercentage;

    public Integer getRiskPercentage() {
        return riskPercentage;
    }

    public RiskAssessmentResponse() {
    }

    public void setRiskPercentage(Integer riskPercentage) {
        this.riskPercentage = riskPercentage;
    }

    public RiskAssessmentResponse(Integer riskPercentage) {
        this.riskPercentage = riskPercentage;
    }
}
