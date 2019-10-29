package com.company.service.impl;

import com.company.beans.Client;
import com.company.beans.Flight;
import com.company.beans.Luggage;
import com.company.beans.Ticket;
import com.company.dao.TicketDAO;
import com.company.dao.factory.DAOFactory;
import com.company.service.TicketService;

public class TicketServiceImpl implements TicketService {
    @Override
    public void addTicket(Ticket ticket) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TicketDAO ticketDAO = daoFactory.getTicketDAO();
        ticketDAO.addTicket(ticket);
    }

    @Override
    public void removeTicket(Ticket ticket) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TicketDAO ticketDAO = daoFactory.getTicketDAO();
        ticketDAO.addTicket(ticket);
    }

    @Override
    public void setFlight(Ticket ticket, Flight flight) {
        ticket.setFlight(flight);
    }

    @Override
    public void setLuggage(Ticket ticket, Luggage luggage) {
        ticket.setLuggage(luggage);
    }

    @Override
    public void setOwner(Ticket ticket, Client client) {
        ticket.setOwner(client);
    }
}
