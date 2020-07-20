package com.kodilla.mockito.homework;


import java.time.LocalDate;
import java.util.*;

public class WeatherAlertsService {

    private Map<Location, Set<Person>> locationPeopleMap = new HashMap<>();

//    public WeatherAlertsService() {
//         = new Factory().createPeople();
//    }
//
    public void sendWeatherAlerts(WeatherAlerts weatherAlerts) {
        locationPeopleMap.values().forEach(a-> {
            a.forEach(p-> p.receiveWeatherAlerts(weatherAlerts));
        });
    }

//    public void sendWeatherAlertsToLocation(WeatherAlerts weatherAlerts, Location location) {
//        people.stream().filter(a -> a.locations.contains(location))
//                .forEach(b -> b.receiveWeatherAlerts(weatherAlerts));
//    }

    public void addPerson(Location location, Person person) {
        if (locationPeopleMap.containsKey(location))
            locationPeopleMap.get(location).add(person);
        else {
            locationPeopleMap.put(location, Set.of(person));
        }
    }

    public void removeSubscription(Location location, Person person){
        if(locationPeopleMap.containsKey(location))
            locationPeopleMap.get(location).remove(person);
    }

    public void removeAllSubscriptions(Person person){
        locationPeopleMap.entrySet().forEach(a-> removeSubscription(a.getKey(), person));
    }

    public int getSize() {
        return locationPeopleMap.size();
    }
}

