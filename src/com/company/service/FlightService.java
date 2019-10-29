package com.company.service;

import com.company.beans.Flight;
import com.company.beans.Pilot;
import com.company.beans.Plane;
import com.company.beans.Ticket;

import java.util.ArrayList;

public interface FlightService {
    void addFlight(Flight flight);
    void setPilot(Flight flight, Pilot pilot);
    void setPlane(Flight flight, Plane plane);
    void setTickets(Flight flight, ArrayList<Ticket> tickets);
    void removeFlight(Flight flight);
}
