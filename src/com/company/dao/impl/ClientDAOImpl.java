package com.company.dao.impl;

import com.company.dao.ClientDAO;
import com.company.beans.Client;

import java.io.*;
import java.util.ArrayList;

public class ClientDAOImpl implements ClientDAO {
    private static final String filePath = "E:\\JavaProjects\\VT\\src\\com\\company\\resources\\clients.txt";

    @Override
    public void addClient(Client client){
        File clientsFile = new File(filePath);
        if(!clientsFile.exists()) {
            try {
                clientsFile.createNewFile();
            } catch (IOException ex) {

            }
        }
        try (FileWriter clientsFileWriter = new FileWriter(filePath, true)) {
            String clientToString = "{Client:";
            clientToString = clientToString.concat(Integer.toString(client.hashCode()).concat(","));
            clientToString = clientToString.concat("FullName:".concat(client.getFullName().concat(",")));
            clientToString = clientToString.concat("PhoneNumber:".concat(client.getPhoneNumber().concat(",")));
            clientToString = clientToString.concat("PhoneNumber:".concat(client.getPhoneNumber().concat(",")));
            clientsFileWriter.write(clientToString);
        } catch (IOException ex) {

        }
    }

    @Override
    public void editClient(Client client){

    }

    @Override
    public void removeClient(Client client){

    }

    @Override
    public void removeClientByName(String clientName){

    }

    @Override
    public ArrayList<Client> loadClients() {

        return null;
    }
}
