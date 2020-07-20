package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Factory {

    public List<Person> createPeople(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Magda", createLocations1()));
        people.add(new Person("Marek", createLocations1()));
        people.add(new Person("Mariusz", createLocations2()));
        people.add(new Person("Ala", createLocations2()));
        people.add(new Person("Ula", createLocations1()));
        return people;
    }

    public Set<Location> createLocations1(){
        Set<Location> locations1 = new HashSet<>();
        locations1.add(new Location("Wroclaw"));
        locations1.add(new Location("Gdansk"));
        locations1.add(new Location("Gdynia"));
        return locations1;
    }

    public Set<Location> createLocations2(){
        Set<Location> locations2 = new HashSet<>();
        locations2.add(new Location("Opole"));
        locations2.add(new Location("Wisla"));
        locations2.add(new Location("Kolobrzeg"));
        return locations2;
    }
}
