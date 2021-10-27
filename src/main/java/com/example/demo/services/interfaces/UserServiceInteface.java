package com.example.demo.services.interfaces;

import com.example.demo.beans.RiskAssessmentResponse;
import com.example.demo.beans.RiskCalculation;
import com.example.demo.beans.UserResponse;
import com.example.demo.models.User;

public interface UserServiceInteface {
    public UserResponse saveUser(User user);
    public RiskAssessmentResponse calculateRisk(RiskCalculation riskCalculation);
}
