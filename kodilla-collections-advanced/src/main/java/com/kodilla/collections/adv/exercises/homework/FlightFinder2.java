package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FlightFinder2 {
    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flights = new FlightRepository2().getFlightsTable();
        List<Flight> flightsFrom = new ArrayList<>();
        for (Flight flight : flights) {
            Optional<String> x = Optional.ofNullable(flight)
                    .map(Flight::getDeparture);
            if(x.isPresent())
                if (flight.getDeparture().equals(departure))
                    flightsFrom.add(flight);
        }
        return flightsFrom;
    }

    public static void main(String[] args) {

        FlightFinder2 flightFinder2 = new FlightFinder2();
        var f = flightFinder2.findFlightsFrom("Poznan");
        f.forEach(System.out::println);

    }
}
