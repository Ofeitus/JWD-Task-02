package com.epam.jwd.task02.service;

import com.epam.jwd.task02.entity.criteria.Criteria;
import com.epam.jwd.task02.entity.Appliance;
import com.epam.jwd.task02.exception.ServiceException;

import java.util.List;

public interface ApplianceService {
    List<Appliance> findByCategory(String name) throws ServiceException;

    List<Appliance> find(Criteria criteria) throws ServiceException;
}
