package com.epam.jwd.task02.dao;

import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.entity.Appliance;

import java.util.List;

/**
 * The interface to Appliance dao.
 */
public interface ApplianceDao {
    /**
     * Find appliances by specific criteria.
     *
     * @param searchCriteria the search criteria
     * @return the list
     * @throws DaoException the dao exception
     */
    List<Appliance> find(SearchCriteria searchCriteria) throws DaoException;

    /**
     * Gets all appliances.
     *
     * @return the all
     * @throws DaoException the dao exception
     */
    List<Appliance> getAll() throws DaoException;

    /**
     * Adds appliance.
     *
     * @param appliance the appliance
     * @throws DaoException the dao exception
     */
    void add(Appliance appliance) throws DaoException;
}
