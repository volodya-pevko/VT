package com.company.dao;

import com.company.beans.Pilot;

import java.util.ArrayList;

public interface PilotDAO {

    void addPilot(Pilot pilot);
    void editPilot(Pilot pilot);
    void removePilot(Pilot pilot);
    void removePilotByName(String pilotName);
    ArrayList<Pilot> loadPilots();
}