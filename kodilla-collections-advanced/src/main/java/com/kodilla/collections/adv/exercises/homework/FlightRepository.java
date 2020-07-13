package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Wroclaw", "Warsaw"));
        flights.add(new Flight("Warsaw", "Wroclaw"));
        flights.add(new Flight("Poznan", "Billund"));
        flights.add(new Flight("Poznan", "Copenhagen"));
        flights.add(new Flight("Wroclaw", "Amsterdam"));
        flights.add(new Flight("Amsterdam", "Wroclaw"));
        flights.add(new Flight("Wroclaw", "Dublin"));
        flights.add(new Flight("Wroclaw", "Oslo"));
        flights.add(new Flight("Poznan", "Amsterdam"));
        return flights;
    }

    @Override
    public String toString() {
        return "FlightRepository{}";
    }
}
