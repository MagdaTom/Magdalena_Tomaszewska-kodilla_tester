package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        Windows8 windows8 = new Windows8();/*TODO Review kdrzazga Argument needed here*/
        windows8.turnOn();
        windows8.turnOff();
        Windows10 windows10 = new Windows10(2015);
        windows10.turnOn();
        windows10.turnOff();


    }
}
