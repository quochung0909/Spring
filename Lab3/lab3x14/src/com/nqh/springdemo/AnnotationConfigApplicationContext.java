package com.nqh.springdemo;

public class AnnotationConfigApplicationContext {
    public static void main(String[] args) {
        org.springframework.context.annotation.AnnotationConfigApplicationContext context = new org.springframework.context.annotation.AnnotationConfigApplicationContext(SportConfig.class);
        Coach coach = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        context.close();



    }
}
