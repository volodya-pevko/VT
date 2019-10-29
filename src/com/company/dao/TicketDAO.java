package com.company.dao;

import com.company.beans.Client;
import com.company.beans.Ticket;

import java.util.ArrayList;

public interface TicketDAO {

    void addTicket(Ticket ticket);
    void editTicket(Ticket ticket);
    void removeTicket(Ticket ticket);
    void removeTicketByOwner(Client client);
    ArrayList<Ticket> loadTickets();
}
