package weather;

import java.util.*;
import java.util.stream.Collectors;

public class AlertService {

    private Map<Location, Set<Client>> clientAndLocationMap = new HashMap<>();


    public void addDataToTheMap(Location location, Client client) {
        if (this.clientAndLocationMap.containsKey(location)) {
            this.clientAndLocationMap.get(location).add(client);
        } else {
            Set<Client> clients = new HashSet<>();
            clients.add(client);
            this.clientAndLocationMap.put(location, clients);
        }
    }

    public void removeSubscription(Location location, Client client) {
        if (this.clientAndLocationMap.containsKey(location)) {
            this.clientAndLocationMap.get(location).remove(client);
        }
    }

    public void removeAllSubscriptions(Client client) {
        clientAndLocationMap.entrySet().forEach(a -> a.getValue().remove(client));
    }

    public void sendAlertsToLocation(Alert alert, Location location) {
        if (this.clientAndLocationMap.containsKey(location)) {
            clientAndLocationMap.get(location).forEach(a -> a.receive(alert));
        }
    }

    public void sendAlertToGroup(Alert alert) {
        this.clientAndLocationMap.values().forEach(a -> a.forEach(b -> b.receive(alert)));
    }

    public void removeLocation(Location location){
        this.clientAndLocationMap.remove(location);
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