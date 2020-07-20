package com.kodilla.mockito.homework;


import java.util.HashSet;
import java.util.Set;

public class Person {

    private String name;
    Set<Location> locations = new HashSet<>();

    public Person(String name, Set<Location> locations) {
        this.name = name;
        this.locations = locations;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(Set<Location> locations) {
        this.locations = locations;
    }

    public void addLocation(Location location) {
        locations.add(location);
    }

    public void receiveWeatherAlerts(WeatherAlerts weatherAlerts) {

    }

}



