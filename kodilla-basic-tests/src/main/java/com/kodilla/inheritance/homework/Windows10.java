package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem {
    public Windows10(int releaseYear) {
        super(releaseYear);

    }
        public void turnOn() {
            System.out.println("System turned on in 12 sec.");
        }

        public void turnOff() {
            System.out.println("System turned off in 14 sec.");
    }
}
