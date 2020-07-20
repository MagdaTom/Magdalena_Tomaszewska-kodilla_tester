package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertsServiceTestSuite {

    WeatherAlertsService weatherAlertsService = new WeatherAlertsService();
    Person person = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);
    WeatherAlerts weatherAlerts = Mockito.mock(WeatherAlerts.class);

    @Test
    void personWithAssignedLocationShouldReceiveAlerts() {//TODO Rename

        weatherAlertsService.addPerson(location, person);
        assertEquals(1, weatherAlertsService.getSize());

    }

    @Test
    void personWithAssignedLocationShouldReceiveAlerts1() {//TODO Rename
        weatherAlertsService.addPerson(location, person);
        Mockito.verify(person, Mockito.never()).receiveWeatherAlerts(weatherAlerts);


    }

    @Test
    void personWithAssignedLocationShouldReceiveSingleAlert2() {//TODO Rename
        weatherAlertsService.addPerson(location, person);
        weatherAlertsService.sendWeatherAlerts(weatherAlerts);
        Mockito.verify(person, Mockito.times(1)).receiveWeatherAlerts(weatherAlerts);
    }
}