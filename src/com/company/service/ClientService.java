package com.company.service;

import com.company.beans.Client;
import com.company.beans.Ticket;

public interface ClientService {
    void addClient(Client client);
    void setTicket(Client client, Ticket ticket);
    void removeClient(Client client);
}
