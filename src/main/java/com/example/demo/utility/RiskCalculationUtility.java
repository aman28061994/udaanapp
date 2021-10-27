package com.example.demo.utility;

import com.example.demo.beans.RiskCalculation;

import java.util.Arrays;
import java.util.Set;

public class RiskCalculationUtility {
    public static int getRiskSymptoms(RiskCalculation riskCalculation){
        if(riskCalculation!=null && riskCalculation.getSymptoms()!=null){
            return riskCalculation.getSymptoms().size();
        }
        return -1;
    }
}
