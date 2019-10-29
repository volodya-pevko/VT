package com.company.service;

import com.company.beans.Flight;
import com.company.beans.Pilot;

import java.util.ArrayList;

public interface PilotService {
    void addPilot(Pilot pilot);
    void setFlights(Pilot pilot, ArrayList<Flight> flights);
    void removePilot(Pilot pilot);
}
