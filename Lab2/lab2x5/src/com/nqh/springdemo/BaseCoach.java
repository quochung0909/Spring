package com.nqh.springdemo;

public class BaseCoach implements Coach {

    @Override
    public String getDailyWorkout() {
       return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
    
}
