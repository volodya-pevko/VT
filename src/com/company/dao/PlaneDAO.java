package com.company.dao;

import com.company.beans.Plane;

import java.util.ArrayList;

public interface PlaneDAO {

    void addPlane(Plane plane, boolean ifBreakNeeded);
    void removePlane(Plane plane);
    void removePlaneByModel(String model);
    ArrayList<Plane> loadPlanes();
}
