package arrays_iterate.ticket;

import java.security.Timestamp;

public class TicketMachine {

    public static void buyTicket(Passenger passenger, int timeMinutes){
        Ticket ticket = new Ticket(timeMinutes);
        passenger.setTicket(ticket);
    }
}
