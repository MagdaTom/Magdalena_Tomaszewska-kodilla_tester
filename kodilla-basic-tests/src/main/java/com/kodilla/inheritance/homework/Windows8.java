package com.kodilla.inheritance.homework;

public class Windows8 extends OperatingSystem {

    public Windows8() {
        super(2012);
    }

    public void turnOn() {
        System.out.println("System turned on in 8 sec.");
    }

    public void turnOff() {
        System.out.println("System turned off in 10 sec.");
    }
}
