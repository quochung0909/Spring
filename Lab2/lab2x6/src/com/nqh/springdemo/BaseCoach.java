package com.nqh.springdemo;

public class BaseCoach implements Coach {

    
    private FortuneService fortuneService;
    
    public BaseCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    

    @Override
    public String getDailyWorkout() {
       return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
