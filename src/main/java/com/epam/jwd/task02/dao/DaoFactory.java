package com.epam.jwd.task02.dao;

import com.epam.jwd.task02.dao.impl.ApplianceDaoImpl;

public class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();

    private final ApplianceDao applianceDAO = new ApplianceDaoImpl();

    private DaoFactory() {

    }

    public ApplianceDao getApplianceDAO() {
        return applianceDAO;
    }

    public static DaoFactory getInstance() {
        return instance;
    }
}
