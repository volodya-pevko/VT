package com.company.dao;

import com.company.beans.Client;

import java.util.ArrayList;

public interface ClientDAO {

    void addClient(Client client);
    void editClient(Client client);
    void removeClient(Client client);
    void removeClientByName(String clientName);
    ArrayList<Client> loadClients();
}
