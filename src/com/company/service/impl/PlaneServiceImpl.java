package com.company.service.impl;

import com.company.beans.Plane;
import com.company.dao.PlaneDAO;
import com.company.dao.factory.DAOFactory;
import com.company.service.PlaneService;

public class PlaneServiceImpl implements PlaneService {
    @Override
    public void addPlane(Plane plane) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        PlaneDAO planeDAO = daoFactory.getPlaneDAO();
        planeDAO.addPlane(plane);
    }

    @Override
    public void removePlane(Plane plane) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        PlaneDAO planeDAO = daoFactory.getPlaneDAO();
        planeDAO.removePlane(plane);
    }
}
