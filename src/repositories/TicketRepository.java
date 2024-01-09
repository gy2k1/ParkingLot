package repositories;

import models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {

    Map<Long, Ticket> ticketMap = new TreeMap<>();

    private long previousID = 0;

    public Ticket saveTicket(Ticket ticket){
        previousID+=1;
        ticketMap.put(previousID,ticket);
        ticket.setTicketNumber(previousID);
        return ticket;
    }
}
