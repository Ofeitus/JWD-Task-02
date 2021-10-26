package com.epam.jwd.task02.service;

import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.entity.Appliance;

import java.util.List;

public interface ApplianceService {
    List<Appliance> find(SearchCriteria searchCriteria) throws ServiceException;

    List<Appliance> getAll() throws ServiceException;

    void add(Appliance appliance) throws ServiceException;
}
