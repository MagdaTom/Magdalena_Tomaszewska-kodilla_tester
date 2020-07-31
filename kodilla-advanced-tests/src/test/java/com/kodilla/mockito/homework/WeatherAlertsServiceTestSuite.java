package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertsServiceTestSuite {

//    WeatherAlertsService weatherAlertsService = new WeatherAlertsService();
//    Person person = Mockito.mock(Person.class);
//    Location location = Mockito.mock(Location.class);
//    WeatherAlerts weatherAlerts = Mockito.mock(WeatherAlerts.class);
//
//    @Test
//    void personWithAssignedLocationShouldReceiveAlerts() {
//        weatherAlertsService.addPerson(location, person);
//        assertEquals(1, weatherAlertsService.getSize());
//    }
//
//    @Test
//    void personWithAssignedLocationShouldReceiveSingleAlert() {
//        weatherAlertsService.addPerson(location, person);
//        weatherAlertsService.sendWeatherAlerts(weatherAlerts);
//        Mockito.verify(person, Mockito.times(1)).receiveWeatherAlerts(weatherAlerts);
//    }
//
//    @Test
//    void personWithNoAssignedLocationShouldNotReceiveAlerts() {
//        Mockito.verify(person, Mockito.never()).receiveWeatherAlerts(weatherAlerts);
//    }
//
//    @Test
//    void differentlocations(){
//        Location location2 = Mockito.mock(Location.class);
//        Location location3 = Mockito.mock(Location.class);
//        //weatherAlertsService.addPerson(location, person);
//        weatherAlertsService.addPerson(location2, person);
//        weatherAlertsService.addPerson(location3, person);
//        //weatherAlertsService.sendWeatherAlertsToLocation(weatherAlerts, location);
//        weatherAlertsService.sendWeatherAlertsToLocation(location2, weatherAlerts);
//        weatherAlertsService.sendWeatherAlertsToLocation(location3, weatherAlerts);
//        Mockito.verify(person, Mockito.times(2)).receiveWeatherAlerts(weatherAlerts);
//
//    }
//
//
//
//    @Test
//    void abc() {
//        weatherAlertsService.addPerson(location, person);
//        weatherAlertsService.sendWeatherAlertsToLocation(location, weatherAlerts);
//        Mockito.verify(person, Mockito.times(1)).receiveWeatherAlerts(weatherAlerts);
//
//
//    }
}