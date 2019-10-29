package com.company.service.impl;

import com.company.beans.Luggage;
import com.company.beans.Ticket;
import com.company.dao.LuggageDAO;
import com.company.dao.factory.DAOFactory;
import com.company.service.LuggageService;

public class LuggageServiceImpl implements LuggageService {
    @Override
    public void addLuggage(Luggage luggage) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        LuggageDAO luggageDAO = daoFactory.getLuggageDAO();
        luggageDAO.addLuggage(luggage);
    }

    @Override
    public void removeLuggage(Luggage luggage) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        LuggageDAO luggageDAO = daoFactory.getLuggageDAO();
        luggageDAO.removeLuggage(luggage);
    }

    @Override
    public void setTicket(Luggage luggage, Ticket ticket) {
        luggage.setOwnerTicket(ticket);
    }
}
