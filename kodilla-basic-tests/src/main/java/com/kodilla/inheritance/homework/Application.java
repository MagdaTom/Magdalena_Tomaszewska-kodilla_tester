package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        Windows windows = new Windows( 1985);
        windows.turnOn();
        windows.turnOff();
        Windows10 windows10 = new Windows10(2015);
        windows10.turnOn();
        windows10.turnOff();


    }
}
