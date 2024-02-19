package com.java.cis;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BMIRestController {

    @PostMapping("/bmirest")
    public String calculateBMI(@RequestParam("height") double heightInches, @RequestParam("weight") double weightLbs) {
        double bmi = calculateBMIValue(heightInches, weightLbs);
        return Double.toString(bmi);
    }

    private double calculateBMIValue(double heightInches, double weightLbs) {
        double bmi = (weightLbs / (heightInches * heightInches)) * 703; // Calculate BMI using the provided formula
        return Math.round(bmi * 100.0) / 100.0; // Round BMI to two decimal places
    }
}
