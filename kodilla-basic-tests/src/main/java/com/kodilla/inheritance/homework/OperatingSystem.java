package com.kodilla.inheritance.homework;

public class OperatingSystem {

    int releaseYear;

    public OperatingSystem(int releaseYear){
        this.releaseYear = releaseYear;
        System.out.println(this.releaseYear);
    }

    public void turnOn(){
        System.out.println("System turned on in 3 sec.");
    }
    public void turnOff(){
        System.out.println("System turned off in 5 sec.");
    }
}
