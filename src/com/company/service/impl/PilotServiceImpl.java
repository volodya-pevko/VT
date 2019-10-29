package com.company.service.impl;

import com.company.beans.Flight;
import com.company.beans.Pilot;
import com.company.dao.PilotDAO;
import com.company.dao.factory.DAOFactory;
import com.company.service.PilotService;

import java.util.ArrayList;

public class PilotServiceImpl implements PilotService {
    @Override
    public void addPilot(Pilot pilot) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        PilotDAO pilotDAO = daoFactory.getPilotDAO();
        pilotDAO.addPilot(pilot);
    }

    @Override
    public void removePilot(Pilot pilot) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        PilotDAO pilotDAO = daoFactory.getPilotDAO();
        pilotDAO.removePilot(pilot);
    }

    @Override
    public void setFlights(Pilot pilot, ArrayList<Flight> flights) {
        pilot.setFlights(flights);
    }
}
