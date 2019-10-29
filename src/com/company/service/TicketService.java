package com.company.service;

import com.company.beans.Client;
import com.company.beans.Flight;
import com.company.beans.Luggage;
import com.company.beans.Ticket;

public interface TicketService {
    void addTicket(Ticket ticket);
    void setOwner(Ticket ticket, Client client);
    void setFlight(Ticket ticket, Flight flight);
    void setLuggage(Ticket ticket, Luggage luggage);
    void removeTicket(Ticket ticket);
}
