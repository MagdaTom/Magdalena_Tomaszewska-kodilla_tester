package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int releaseYear) {
        super(releaseYear);
    }

    public void turnOn() {
        System.out.println("System turned on in 8 sec.");
    }

    public void turnOff() {
        System.out.println("System turned off in 10 sec.");
    }
}
