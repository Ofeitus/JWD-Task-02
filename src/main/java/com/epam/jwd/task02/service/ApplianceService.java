package com.epam.jwd.task02.service;

import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.entity.Appliance;

import java.util.List;

/**
 * Interface to Appliance services
 *
 * @author Ofeitus
 * @version 1.0
 */
public interface ApplianceService {
    /**
     * Find appliances by specific criteria.
     *
     * @param searchCriteria the search criteria
     * @return list of appliances that match criteria
     * @throws ServiceException the service exception
     */
    List<Appliance> find(SearchCriteria searchCriteria) throws ServiceException;

    /**
     * Gets all appliances
     *
     * @return list of all appliances
     * @throws ServiceException the service exception
     */
    List<Appliance> getAll() throws ServiceException;

    /**
     * Adds appliance
     *
     * @param appliance the appliance
     * @throws ServiceException the service exception
     */
    void add(Appliance appliance) throws ServiceException;
}
