package weather;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;


class AlertServiceTestSuite {

    AlertService alertService = new AlertService();
    Client client = Mockito.mock(Client.class);
    Client client1 = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Alert alert = Mockito.mock(Alert.class);
    Location location = Mockito.mock(Location.class);
    Location location1 = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);

    @BeforeEach
    public void createListOfLocations(){
        alertService.addLocation(location, location1, location2);
    }

    @AfterEach
    public void removeListOfLocations(){
        alertService.removeLocation(location, location1, location2);
    }

    @Test
    public void notSubscribedClientShouldNotReceiveAlert(){
        alertService.sendAlerts(alert);
        Mockito.verify(client, Mockito.never()).receive(alert);
    }

    @Test
    public void subscribedClientShouldReceiveAlert(){
        alertService.addDataToTheMap(location, client);
        alertService.sendAlerts(alert);
        Mockito.verify(client, Mockito.times(1)).receive(alert);
    }

    @Test
    public void clientSubscribedToMoreLocationsShouldReceiveOneGeneralAlert(){
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location1, client);
        alertService.addDataToTheMap(location2, client);
        alertService.sendAlerts(alert);
        Mockito.verify(client, Mockito.times(1)).receive(alert);
    }

    @Test
    public void clientSubscribedToTheSameLocationShouldReceiveOneAlert(){
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location, client);
        alertService.sendAlertsToLocation(alert, location);
        Mockito.verify(client, Mockito.times(1)).receive(alert);
    }

    @Test
    public void clientSubscribedToMoreLocationsShouldReceiveAlertsToLocations() {
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location1, client);
        alertService.addDataToTheMap(location2, client);
        alertService.sendAlertsToLocation(alert, location1);
        alertService.sendAlertsToLocation(alert, location);
        alertService.sendAlertsToLocation(alert, location2);
        Mockito.verify(client, Mockito.times(3)).receive(alert);

    }

    @Disabled
    @Test
    public void clientsSubscribedToLocationsShouldReceiveAlertsToLocations() {
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location1, client1);
        alertService.addDataToTheMap(location2, client2);
        alertService.sendAlertsToLocation(alert, location);
        alertService.sendAlertsToLocation(alert, location1);
        alertService.sendAlertsToLocation(alert, location2);

        Mockito.verify(client, Mockito.times(1)).receive(alert);
        Mockito.verify(client1, Mockito.times(1)).receive(alert);
        Mockito.verify(client2, Mockito.times(2)).receive(alert);

    }

    @Test
    public void clientsSubscribedToLocationShouldReceiveAlertsToLocations() {
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location, client1);
        alertService.addDataToTheMap(location, client2);
        alertService.sendAlertsToLocation(alert, location);

        Mockito.verify(client, Mockito.times(1)).receive(alert);
        Mockito.verify(client1, Mockito.times(1)).receive(alert);
        Mockito.verify(client2, Mockito.times(1)).receive(alert);
    }

    @Test
    public void allClientsShouldReceiveAlerts() {
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location2, client1);
        alertService.addDataToTheMap(location1, client2);
        alertService.sendAlerts(alert);

        Mockito.verify(client, Mockito.times(1)).receive(alert);
        Mockito.verify(client1, Mockito.times(1)).receive(alert);
        Mockito.verify(client2, Mockito.times(1)).receive(alert);

    }

    @Test
    void shouldReturnCorrectSizeOfLocationsSet(){
        assertEquals(3, alertService.getSizeOfLocations());
    }

    @Test
    void shouldReturnCorrectSizeOfLocationsAfterRemoval() {
        alertService.removeLocation(location1, location);
        assertEquals(1, alertService.getSizeOfLocations());
    }

    @Test
    void shouldBePossibleToRemoveSubscriptionFromLocation(){
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location1, client);
        alertService.addDataToTheMap(location2, client);

        alertService.removeSubscription(location1, client);
        alertService.sendAlertsToLocation(alert,location);
        alertService.sendAlertsToLocation(alert,location1);
        alertService.sendAlertsToLocation(alert,location2);
        Mockito.verify(client, Mockito.times(2)).receive(alert);
    }

    @Test
    void shouldBePossibleToRemoveAllSubscriptionFromLocation(){
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location1, client);
        alertService.addDataToTheMap(location2, client);

        alertService.removeAllSubscriptions(client);
        alertService.addDataToTheMap(location, client);
        alertService.addDataToTheMap(location1, client);
        alertService.addDataToTheMap(location2, client);

        Mockito.verify(client, Mockito.times(0)).receive(alert);
    }

}


