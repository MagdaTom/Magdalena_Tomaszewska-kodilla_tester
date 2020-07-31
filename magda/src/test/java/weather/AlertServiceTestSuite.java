package weather;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;


class AlertServiceTestSuite {

//
//    AlertService alertService = new AlertService();//TODO move to methods
//    Client client = Mockito.mock(Client.class);
//    Client client1 = Mockito.mock(Client.class);
//    Client client2 = Mockito.mock(Client.class);
//    Alert alert = Mockito.mock(Alert.class);
//    Location location = Mockito.mock(Location.class);
//    Location location1 = Mockito.mock(Location.class);
//    Location location2 = Mockito.mock(Location.class);

//    @Test
//    public void notSubscribedClientShouldNotReceiveAlert() {
//        alertService.sendAlertToGroup(alert);
//        Mockito.verify(client, Mockito.never()).receive(alert);
//    }
//
//    @Test
//    public void subscribedClientShouldReceiveGroupAlert() {
//        alertService.addDataToTheMap(client, locationsA);
//        alertService.sendAlertToGroup(alert);
//        Mockito.verify(client, Mockito.times(1)).receive(alert);
//
//    }
//
//    @Test
//    public void clientSubscribedToMoreLocationsShouldReceiveOneGroupAlert() {
//        alertService.addDataToTheMap(client, locationsA);
//        alertService.sendAlertToGroup(alert);
//        Mockito.verify(client, Mockito.times(1)).receive(alert);
//    }
//
//    @Test
//    public void clientsShouldReceiveGroupAlert() {
//        alertService.addDataToTheMap(client, locationsA);
//        alertService.addDataToTheMap(client1, locationsA);
//        alertService.sendAlertToGroup(alert);
//
//        Mockito.verify(client, Mockito.times(1)).receive(alert);
//        Mockito.verify(client1, Mockito.times(1)).receive(alert);
//
//
//    }
//
//    @Disabled
//    @Test
//    public void clientSubscribedToTheSameLocationShouldReceiveOneAlertToLocation() {
//        Set<Location> locationsA = alertService.createSetOfLocationsForClient(location1, location2);
//        alertService.addDataToTheMap(client, locationsA);
//        alertService.addDataToTheMap(client, locationsA);
//        alertService.sendAlertsToLocation(alert, location1);
//        alertService.sendAlertsToLocation(alert, location2);
//        Mockito.verify(client, Mockito.times(2)).receive(alert);
//    }
//
//    @Disabled
//    @Test
//    public void clientSubscribedToMoreLocationsShouldReceiveAlertsToLocations() {
//        Set<Location> locationsA = alertService.createSetOfLocationsForClient(location1, location2);
//        alertService.addDataToTheMap(client, locationsA);
//        alertService.sendAlertsToLocation(alert, location1);
//        alertService.sendAlertsToLocation(alert, location2);
//        Mockito.verify(client, Mockito.times(2)).receive(alert);
//    }
//
//    @Disabled
//    @Test
//    public void clientsSubscribedToLocationsShouldReceiveAlertsToLocations() {
//        Set<Location> locationsA = alertService.createSetOfLocationsForClient(location1, location2);
//        Set<Location> locationsB = alertService.createSetOfLocationsForClient(location, location2);
//        alertService.addDataToTheMap(client, locationsA);
//        alertService.addDataToTheMap(client1, locationsB);
//        alertService.sendAlertsToLocation(alert, location);
//        alertService.sendAlertsToLocation(alert, location1);
//        alertService.sendAlertsToLocation(alert, location2);
//        Mockito.verify(client, Mockito.times(2)).receive(alert);
//      Mockito.verify(client1, Mockito.times(2)).receive(alert);
//
//
//    }
//
//    @Disabled
//    @Test
//    public void clientsSubscribedToSameLocationShouldReceiveAlertsToLocations() {
//        Set<Location> locationsA = alertService.createSetOfLocationsForClient(location1, location2);
//        alertService.addDataToTheMap(client, locationsA);
//        alertService.addDataToTheMap(client1, locationsA);
//        alertService.sendAlertsToLocation(alert, location1);
//        alertService.sendAlertsToLocation(alert, location2);
//        Mockito.verify(client, Mockito.times(2)).receive(alert);
//        Mockito.verify(client1, Mockito.times(2)).receive(alert);
//    }
//
//
//    @Test
//    void shouldReturnCorrectSizeOfLocationsSet() {
//
//        assertEquals(3, alertService.getSizeOfLocations());
//
//    }
//
//    @Test
//    void shouldReturnCorrectSizeOfLocationsAfterRemoval() {
//        alertService.removeLocation(location1, location);
//        assertEquals(1, alertService.getSizeOfLocations());
//    }
//
//    @Disabled
//    @Test
//    void shouldBePossibleToRemoveSubscriptionFromLocation() {
//        Set<Location> locationsA = alertService.createSetOfLocationsForClient(location1, location2);
//        alertService.addDataToTheMap(client, locationsA);
//        alertService.removeSubscription(location1, client);
//        Mockito.verify(client, Mockito.times(1)).receive(alert);
//    }
//
//
//    @Test
//    void shouldBePossibleToRemoveAllSubscriptionFromLocation() {
//        Set<Location> locationsA = alertService.createSetOfLocationsForClient(location1, location2);
//        alertService.addDataToTheMap(client, locationsA);
//        alertService.removeAllSubscriptions(client);
//
//        Mockito.verify(client, Mockito.times(0)).receive(alert);
//    }

}