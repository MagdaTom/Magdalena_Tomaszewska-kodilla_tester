package arrays_iterate.ticket;

public class Passenger {
    private String name;
    private String lastName;
    private Ticket ticket;

    public Passenger(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
