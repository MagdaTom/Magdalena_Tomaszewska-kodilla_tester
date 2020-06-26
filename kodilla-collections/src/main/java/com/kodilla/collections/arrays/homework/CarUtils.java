package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {

    public static void describeCar(Car car){
        car.increaseSpeed();
        car.decreaseSpeed();
        System.out.println("Current speed: " + car.getSpeed());
        System.out.println();
    }
}
