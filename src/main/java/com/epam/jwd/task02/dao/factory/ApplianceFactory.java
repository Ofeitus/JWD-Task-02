package com.epam.jwd.task02.dao.factory;

import com.epam.jwd.task02.entity.Appliance;

import java.util.Map;

/**
 * The interface to Appliance factory.
 *
 * @author Ofeitus
 * @version 1.0
 */
public interface ApplianceFactory {
    /**
     * Creates appliance.
     *
     * @param parameters the parameters
     * @return the appliance
     */
    Appliance create(Map<String, String> parameters);
}
