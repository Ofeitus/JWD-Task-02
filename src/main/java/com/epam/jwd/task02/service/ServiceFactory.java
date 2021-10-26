package com.epam.jwd.task02.service;

import com.epam.jwd.task02.service.impl.ApplianceServiceImpl;

/**
 * Class to provide ApplianceService object.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ApplianceService applianceService = new ApplianceServiceImpl();

    private ServiceFactory() {
    }

    /**
     * Gets appliance service implementation as a singleton
     *
     * @return the appliance service
     */
    public ApplianceService getApplianceService() {
        return applianceService;
    }

    /**
     * Gets factory instance.
     *
     * @return the factory
     */
    public static ServiceFactory getInstance() {
        return instance;
    }
}
