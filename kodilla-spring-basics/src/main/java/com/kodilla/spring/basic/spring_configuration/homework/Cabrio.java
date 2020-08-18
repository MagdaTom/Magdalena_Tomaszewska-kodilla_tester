package com.kodilla.spring.basic.spring_configuration.homework;


public class Cabrio implements Car {

    private String name;
    private boolean hasHeadlightsTurnedOn;

    public Cabrio(String name, boolean hasHeadlightsTurnedOn) {
        this.name = name;
        this.hasHeadlightsTurnedOn = hasHeadlightsTurnedOn;
    }

    public Cabrio() {
        this.name = "Cabrio";
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
        return "Cabrio{" +
                "name='" + name + '\'' +
                ", hasHeadlightsTurnedOn=" + hasHeadlightsTurnedOn +
                '}';
    }
}

