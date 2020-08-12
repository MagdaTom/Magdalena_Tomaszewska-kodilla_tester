package arrays_iterate.ticket;

import java.time.LocalDateTime;

public class TicketController {
    public static void main(String[] args) {

        Passenger[] passengers = new Passenger[5];
        passengers[0] = new Passenger("Jan", "Kowalski");
        passengers[1] = new Passenger("Anna", "Abacka");
        passengers[2] = new Passenger("Wojciech", "Głowacki");
        passengers[3] = new Passenger("Katarzyna", "Szelest");
        passengers[4] = new Passenger("Piotr", "Zakątek");

        TicketMachine.buyTicket(passengers[0], 15);
        TicketMachine.buyTicket(passengers[1], 30);
        Ticket invalidTicket = new Ticket(LocalDateTime.now().minusMinutes(20), 15);
        passengers[2].setTicket(invalidTicket);

        Passenger[] passengersWithoutTicket = validateTickets(passengers);
        System.out.println("Na gapę jadą:");
        for (Passenger passenger : passengersWithoutTicket) {
            System.out.println(passenger.getName() + " " + passenger.getLastName());
        }
    }

    private static Passenger[] validateTickets(Passenger[] passengers) {
        int passengersWithoutTicket = 0;
        for (Passenger passenger : passengers) {
            Ticket ticket = passenger.getTicket();
            if (ticket == null || !ticket.isValid())
                passengersWithoutTicket++;
        }

        Passenger[] withoutTicket = new Passenger[passengersWithoutTicket];
        for (int i = 0, j = 0; i < passengers.length; i++) {
            Ticket ticket = passengers[i].getTicket();
            if (ticket == null || !ticket.isValid()) {
                withoutTicket[j] = passengers[i];
                j++;
            }
        }

        return withoutTicket;
    }
}

