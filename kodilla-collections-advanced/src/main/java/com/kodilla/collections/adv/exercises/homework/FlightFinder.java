package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flights = FlightRepository.getFlightsTable();
        List<Flight> flightsFrom = new ArrayList<>();
        for (Flight flight : flights)
            if (flight.getDeparture().equals(departure))
                flightsFrom.add(flight);
        return flightsFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flights = FlightRepository.getFlightsTable();
        List<Flight> flightsTo = new ArrayList<>();
        for (Flight flight : flights)
            if (flight.getArrival().equals(arrival))
                flightsTo.add(flight);
        return flightsTo;
    }

    @Override
    public String toString() {
        return "FlightFinder{}";
    }
}


