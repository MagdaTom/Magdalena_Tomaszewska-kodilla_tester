package com.kodilla.spring.basic.spring_configuration.homework;


public class SUV implements Car {

    private String name;
    private boolean hasHeadlightsTurnedOn;

    public SUV(String name, boolean hasHeadlightsTurnedOn) {
        this.name = name;
        this.hasHeadlightsTurnedOn = hasHeadlightsTurnedOn;
    }

    public SUV() {
        this.name = "SUV";
        this.hasHeadlightsTurnedOn = false;
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return hasHeadlightsTurnedOn = hasHeadlightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return this.name = name;
    }

    @Override
    public String toString() {
        return "SUV{" +
                "name='" + name + '\'' +
                ", hasHeadlightsTurnedOn=" + hasHeadlightsTurnedOn +
                '}';
    }
}
