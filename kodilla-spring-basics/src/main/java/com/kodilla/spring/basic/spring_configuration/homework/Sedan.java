package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car{

    private String name;
    private boolean hasHeadlightsTurnedOn;

    public Sedan(String name, boolean hasHeadlightsTurnedOn) {
        this.name = name;
        this.hasHeadlightsTurnedOn = hasHeadlightsTurnedOn;
    }

    public Sedan(){
        this.name = "Sedan";
        this.hasHeadlightsTurnedOn = true;
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
        return "Sedan{" +
                "name='" + name + '\'' +
                ", hasHeadlightsTurnedOn=" + hasHeadlightsTurnedOn +
                '}';
    }
}
