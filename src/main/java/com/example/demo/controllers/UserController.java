package com.example.demo.controllers;

import com.example.demo.beans.RiskAssessmentResponse;
import com.example.demo.beans.RiskCalculation;
import com.example.demo.beans.UserResponse;
import com.example.demo.models.User;
import com.example.demo.services.interfaces.UserServiceInteface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceInteface userServiceInteface;
    @PostMapping("/registerUser")
    public UserResponse registerUser(@RequestBody User user){
        UserResponse createdUser = userServiceInteface.saveUser(user);
        return createdUser;
    }
    @PostMapping("/selfAssessment")
    public RiskAssessmentResponse calculateRisk(@RequestBody RiskCalculation riskCalculation){
        RiskAssessmentResponse riskAssessmentResponse = userServiceInteface.calculateRisk(riskCalculation);
        if(riskAssessmentResponse!=null){
            return  riskAssessmentResponse;
        }
        return null;
    }

}
