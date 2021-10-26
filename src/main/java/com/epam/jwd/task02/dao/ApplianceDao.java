package com.epam.jwd.task02.dao;

import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.entity.Appliance;

import java.util.List;

public interface ApplianceDao {
    List<Appliance> find(SearchCriteria searchCriteria) throws DaoException;

    List<Appliance> getAll() throws DaoException;

    void add(Appliance appliance) throws DaoException;
}
