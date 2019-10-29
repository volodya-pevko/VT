package com.company.dao.impl;

import com.company.dao.PlaneDAO;
import com.company.beans.Plane;

import java.io.*;
import java.util.ArrayList;

public class PlaneDAOImpl implements PlaneDAO {

    private static final String filePath = "E:\\JavaProjects\\VT\\src\\com\\company\\resources\\clients.txt";

    @Override
    public void addPlane(Plane plane, boolean ifBreakNeeded){
        File clientsFile = new File(filePath);
        if(!clientsFile.exists()) {
            try {
                clientsFile.createNewFile();
            } catch (IOException ex) {

            }
        }
        try{
            FileOutputStream fos = new FileOutputStream(filePath);
            BufferedOutputStream fileWriter = new BufferedOutputStream(fos);
            fileWriter.write("{Plane:".getBytes());
            fileWriter.write("{Plane:".concat(Integer.toString(plane.hashCode()).concat(",")).getBytes());
            fileWriter.write("Model:".concat(plane.getModel().concat(",")).getBytes());
            fileWriter.write("SitsCount:".concat(Integer.toString(plane.getSitsCount()).concat(",")).getBytes());
            if(ifBreakNeeded){
                fileWriter.write("\n".getBytes());
            }
        } catch (IOException ex) {

        }
    }

    @Override
    public void removePlane(Plane plane) {

    }

    @Override
    public void removePlaneByModel(String model) {

    }

    @Override
    public ArrayList<Plane> loadPlanes() {
        ArrayList<Plane> loadedPlanes = new ArrayList<>();
        File clientsFile = new File(filePath);
        if(!clientsFile.exists()) {
            try {
                clientsFile.createNewFile();
            } catch (IOException ex) {

            }
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {

            }
        }
        catch(IOException ex){

        }
        return loadedPlanes;
    }
}
