package com.company.dao;

import com.company.beans.Flight;

import java.util.ArrayList;

public interface FlightDAO {

    void addFlight(Flight flight);
    void editFlight(Flight flight);
    void removeFlight(Flight flight);
    void removeFlightByID(int id);
    ArrayList<Flight> loadFlights();
}
