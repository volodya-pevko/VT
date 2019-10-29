package com.company.service.factory;

import com.company.service.*;
import com.company.service.impl.*;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ClientService clientService = new ClientServiceImpl();
    private final FlightService flightService = new FlightServiceImpl();
    private final LuggageService luggageService = new LuggageServiceImpl();
    private final PilotService pilotService = new PilotServiceImpl();
    private final PlaneService planeService = new PlaneServiceImpl();
    private final TicketService ticketService = new TicketServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return instance;
    }

    public ClientService getClientService(){
        return clientService;
    }

    public FlightService getFlightService() {
        return flightService;
    }

    public LuggageService getLuggageService() {
        return luggageService;
    }

    public PilotService getPilotService() {
        return pilotService;
    }

    public PlaneService getPlaneService() {
        return planeService;
    }

    public TicketService getTicketService() {
        return ticketService;
    }
}

