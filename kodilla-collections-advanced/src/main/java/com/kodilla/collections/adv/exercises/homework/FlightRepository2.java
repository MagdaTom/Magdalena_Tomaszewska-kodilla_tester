package com.kodilla.collections.adv.exercises.homework;

import java.util.List;

public class FlightRepository2 extends FlightRepository{

    public List<Flight> getFlightsTable() {
        var flights = super.getFlightsTable();
        flights.add(new Flight(null, null));
        flights.add(null);
        return flights;
    }
}
