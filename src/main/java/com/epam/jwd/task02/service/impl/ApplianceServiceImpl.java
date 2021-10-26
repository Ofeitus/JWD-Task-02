package com.epam.jwd.task02.service.impl;

import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.service.ApplianceService;
import com.epam.jwd.task02.dao.DaoFactory;
import com.epam.jwd.task02.entity.Appliance;
import com.epam.jwd.task02.dao.DaoException;
import com.epam.jwd.task02.service.ServiceException;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    @Override
    public List<Appliance> find(SearchCriteria searchCriteria) throws ServiceException {
        List<Appliance> appliances;
        try {
            appliances = DaoFactory.getInstance().getApplianceDAO().find(searchCriteria);
        } catch (DaoException exception) {
            throw new ServiceException(exception);
        }
        return appliances;
    }

    @Override
    public List<Appliance> getAll() throws ServiceException {
        List<Appliance> appliances;
        try {
            appliances = DaoFactory.getInstance().getApplianceDAO().getAll();
        } catch (DaoException exception) {
            throw new ServiceException(exception);
        }
        return appliances;
    }

    @Override
    public void add(Appliance appliance) throws ServiceException {
        try {
            DaoFactory.getInstance().getApplianceDAO().add(appliance);
        } catch (DaoException exception) {
            throw new ServiceException(exception);
        }
    }
}
