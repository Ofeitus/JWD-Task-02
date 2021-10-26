package com.epam.jwd.task02.dao;

import com.epam.jwd.task02.dao.impl.ApplianceDaoXml;

/**
 * Class to provide ApplianceDAO object.
 */
public class DaoFactory {
    private static final DaoFactory instance = new DaoFactory();

    private final ApplianceDao applianceDAO = new ApplianceDaoXml();

    private DaoFactory() {

    }

    /**
     * Gets appliance dao implementation as a singleton
     *
     * @return the appliance dao
     */
    public ApplianceDao getApplianceDAO() {
        return applianceDAO;
    }

    /**
     * Gets factory instance.
     *
     * @return the factory
     */
    public static DaoFactory getInstance() {
        return instance;
    }
}
