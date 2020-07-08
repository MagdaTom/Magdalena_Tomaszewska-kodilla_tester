package com.kodilla.stream.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String, Boolean> getListOFAirports(){
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Miami", true);
        airports.put("Malta", true);
        airports.put("LasPalmas", false);
        airports.put("Warsaw", true);
        return airports;
    }
    public Boolean isAirportInUse(String airport) throws AirportNotFoundException {
        if(getListOFAirports().containsKey(airport))
            return getListOFAirports().get(airport);
        throw new AirportNotFoundException();
    }
}
