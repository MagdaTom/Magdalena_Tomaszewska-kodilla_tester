package weather;

public interface Client {

    void receive(Alert alert);

    void receive (Alert alert, Location location);
}
