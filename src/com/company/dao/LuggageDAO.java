package com.company.dao;

import com.company.beans.Luggage;
import com.company.beans.Ticket;

import java.util.ArrayList;

public interface LuggageDAO {

    void addLuggage(Luggage luggage);
    void editLuggage(Luggage luggage);
    void removeLuggage(Luggage luggage);
    void removeLuggageByTicket(Ticket ticket);
    ArrayList<Luggage> loadLuggage();
}
