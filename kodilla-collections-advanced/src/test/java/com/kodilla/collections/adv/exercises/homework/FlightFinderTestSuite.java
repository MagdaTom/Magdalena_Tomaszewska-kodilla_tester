package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void findFlightsFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Wroclaw");
        //then
        for (Flight f : result) {
            assertEquals("Wroclaw", f.getDeparture());
        }
        assertEquals(4, result.size());
    }

    @Test
    public void findFlightsFromIfDepartureNotExists() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Malmo");
        //then
        assertEquals(0, result.size());
    }

    @Test
    public void findFlightsFromIfDepartureIsEmpty() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsFrom("");
        //then
        assertEquals(0, result.size());
    }

    @Test
    public void findFlightsTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsTo("Amsterdam");
        //then
        for (Flight f : result)
            assertEquals("Amsterdam", f.getArrival());
        assertEquals(2, result.size());
    }

    @Test
    public void findFlightsFromIfArrivalNotExists() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsTo("Poznan");
        //then
        assertEquals(0, result.size());
    }

    @Test
    public void findFlightsFromIfArrivalIsEmpty() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> result = flightFinder.findFlightsFrom("");
        //then
        assertEquals(0, result.size());
    }
}