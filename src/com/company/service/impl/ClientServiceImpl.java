package com.company.service.impl;

import com.company.beans.Client;
import com.company.beans.Ticket;
import com.company.dao.ClientDAO;
import com.company.dao.factory.DAOFactory;
import com.company.service.ClientService;

import java.util.ArrayList;

public class ClientServiceImpl implements ClientService {
    @Override
    public void addClient(Client client) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        ClientDAO clientDAO = daoFactory.getClientDAO();
        clientDAO.addClient(client);
    }

    @Override
    public void removeClient(Client client) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        ClientDAO clientDAO = daoFactory.getClientDAO();
        clientDAO.removeClient(client);
    }

    @Override
    public void setTicket(Client client, Ticket ticket) {
        ArrayList<Ticket> tickets = client.getTickets();
        if(!tickets.contains(ticket)){
            tickets.add(ticket);
            client.setTickets(tickets);
        }
    }
}
