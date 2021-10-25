package com.epam.jwd.task02.dao;

import com.epam.jwd.task02.dao.impl.ApplianceDaoXml;

public class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();

    private final ApplianceDao applianceDAO = new ApplianceDaoXml();

    private DaoFactory() {

    }

    public ApplianceDao getApplianceDAO() {
        return applianceDAO;
    }

    public static DaoFactory getInstance() {
        return instance;
    }
}
