package weather;

import java.util.*;

public class AlertService {


    private Set<Location> locations = new HashSet<>();
    private Map<Client, Set<Location>> clientAndLocationMap = new HashMap<>();
    private Location location;

    public void addLocation(Location ... locations) {
        for (Location l : locations)
            this.locations.add(l);
    }

    public void removeLocation(Location ... locations){
        for (Location l : locations)
            this.locations.remove(l);
    }

    public int getSizeOfLocations(){
        return locations.size();
    }

    public void addDataToTheMap(Location location, Client client) {
        Set<Location> locations1 = new HashSet<>();
        if(locations.contains(location)) {
            locations1.add(location);
        }
        this.clientAndLocationMap.put(client, locations1);
    }

    public void sendAlerts(Alert alert) {
        this.clientAndLocationMap.keySet().forEach(a-> a.receive(alert));
    }

    public void sendAlertsToLocation(Alert alert, Location location) {

            this.clientAndLocationMap.entrySet().stream().filter(a -> a.getValue().contains(location))
                    .forEach(a -> a.getKey().receive(alert));
        }


    public void removeSubscription(Location location, Client client){
        this.clientAndLocationMap.get(client).remove(location);

    }


    public void removeAllSubscriptions(Client client){
        clientAndLocationMap.remove(client);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlertService that = (AlertService) o;
        return Objects.equals(clientAndLocationMap, that.clientAndLocationMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientAndLocationMap);
    }

    @Override
    public String toString() {
        return "AlertService{" +
                "clientAndLocationMap=" + clientAndLocationMap +
                '}';
    }


}
