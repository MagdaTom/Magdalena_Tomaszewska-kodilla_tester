package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Application {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
       System.out.println(carFactory.returnCar(Season.SUMMER, LocalTime.parse("10:00:00")));

    }
}