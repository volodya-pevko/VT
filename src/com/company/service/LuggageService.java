package com.company.service;

import com.company.beans.Luggage;
import com.company.beans.Ticket;

public interface LuggageService {
    void addLuggage(Luggage luggage);
    void setTicket(Luggage luggage, Ticket ticket);
    void removeLuggage(Luggage luggage);
}
