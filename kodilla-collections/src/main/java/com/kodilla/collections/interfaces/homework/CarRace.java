package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Honda honda = new Honda(100);
        doRace(honda);
        Fiat fiat = new Fiat(50);
        doRace(fiat);
        Opel opel = new Opel(75);
        doRace(opel);
    }

    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Current speed: " + car.getSpeed());
    }
}
