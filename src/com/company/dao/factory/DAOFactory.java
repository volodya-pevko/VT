package com.company.dao.factory;

import com.company.dao.*;
import com.company.dao.impl.*;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final ClientDAO clientDAO = new ClientDAOImpl();
    private final FlightDAO flightDAO = new FlightDAOImpl();
    private final LuggageDAO luggageDAO = new LuggageDAOImpl();
    private final PilotDAO pilotDAO = new PilotDAOImpl();
    private final PlaneDAO planeDAO = new PlaneDAOImpl();
    private final TicketDAO ticketDAO = new TicketDAOImpl();

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return instance;
    }

    public ClientDAO getClientDAO(){
        return clientDAO;
    }

    public FlightDAO getFlightDAO(){
        return flightDAO;
    }

    public LuggageDAO getLuggageDAO(){
        return luggageDAO;
    }

    public PilotDAO getPilotDAO(){
        return pilotDAO;
    }

    public PlaneDAO getPlaneDAO(){
        return planeDAO;
    }

    public TicketDAO getTicketDAO(){
        return ticketDAO;
    }

}
