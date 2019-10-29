package com.company.service.impl;

import com.company.beans.Flight;
import com.company.beans.Pilot;
import com.company.beans.Plane;
import com.company.beans.Ticket;
import com.company.dao.FlightDAO;
import com.company.dao.factory.DAOFactory;
import com.company.service.FlightService;

import java.util.ArrayList;

public class FlightServiceImpl implements FlightService {
    @Override
    public void addFlight(Flight flight) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        FlightDAO flightDAO = daoFactory.getFlightDAO();
        flightDAO.addFlight(flight);
    }

    @Override
    public void removeFlight(Flight flight) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        FlightDAO flightDAO = daoFactory.getFlightDAO();
        flightDAO.removeFlight(flight);
    }

    @Override
    public void setPilot(Flight flight, Pilot pilot) {
        flight.setPilot(pilot);
    }

    @Override
    public void setPlane(Flight flight, Plane plane) {
        flight.setPlane(plane);
    }

    @Override
    public void setTickets(Flight flight, ArrayList<Ticket> tickets) {
        flight.setTickets(tickets);
    }
}
