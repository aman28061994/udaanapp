package com.example.demo.services.impl;

import com.example.demo.beans.RiskAssessmentResponse;
import com.example.demo.beans.RiskCalculation;
import com.example.demo.beans.UserResponse;
import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.interfaces.UserServiceInteface;
import com.example.demo.utility.RiskCalculationUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService implements UserServiceInteface {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserResponse saveUser(User user) {
        if(user!=null && user.getName()!=null && user.getPhoneNumber()!=null) {
            if (userRepository.getUserByPhoneNumber(user.getPhoneNumber()) == null) {
                System.out.println("Here In Save");
                User user1=userRepository.save(user);
                return new UserResponse(user1.getId());
            }else {

            }
        }
        return null;
    }
    //No symptoms, No travel history, No contact with covid positive patient - Risk = 5%
    //Any one symptom, travel history or contact with covid positive patient is true - Risk = 50%
    //Any two symptoms, travel history or contact with covid positive patient is true - Risk = 75%
    //Greater than 2 symptoms, travel history or contact with covid positive patient is true - Risk = 95%
    @Override
    public RiskAssessmentResponse calculateRisk(RiskCalculation riskCalculation) {
        if(riskCalculation!=null){
            if(userRepository.getUserById(riskCalculation.getUserId())!=null){
                int symptoms = RiskCalculationUtility.getRiskSymptoms(riskCalculation);
                if(symptoms!=-1 && symptoms<2 && riskCalculation.getTravelHistory() && riskCalculation.getContactWithCovidPatient()){
                    return new RiskAssessmentResponse(50);
                }
                else if(symptoms!=-1 && symptoms<3 && riskCalculation.getTravelHistory() && riskCalculation.getContactWithCovidPatient()){
                    return new RiskAssessmentResponse(75);
                }
                else if(symptoms!=-1 && symptoms>2 && riskCalculation.getTravelHistory() && riskCalculation.getContactWithCovidPatient()) {
                    return new RiskAssessmentResponse(95);
                }else if(symptoms!=-1 && symptoms==0 && !riskCalculation.getTravelHistory() && !riskCalculation.getContactWithCovidPatient()){
                    return new RiskAssessmentResponse(5);
                }
            }
        }
        return null;
    }
}
