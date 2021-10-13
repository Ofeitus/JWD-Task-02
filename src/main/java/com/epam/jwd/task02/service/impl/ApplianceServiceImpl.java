package com.epam.jwd.task02.service.impl;

import com.epam.jwd.task02.entity.criteria.Criteria;
import com.epam.jwd.task02.service.ApplianceService;
import com.epam.jwd.task02.dao.DaoFactory;
import com.epam.jwd.task02.entity.Appliance;
import com.epam.jwd.task02.exception.DaoException;
import com.epam.jwd.task02.exception.ServiceException;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    @Override
    public List<Appliance> findByCategory(String name) throws ServiceException {
        List<Appliance> appliances;
        try {
            appliances = DaoFactory.getInstance().getApplianceDAO().findByCategory(name);
        } catch (DaoException exception) {
            throw new ServiceException(exception);
        }
        return appliances;
    }

    @Override
    public List<Appliance> find(Criteria criteria) throws ServiceException {
        List<Appliance> appliances;
        try {
            appliances = DaoFactory.getInstance().getApplianceDAO().find(criteria);
        } catch (DaoException exception) {
            throw new ServiceException(exception);
        }
        return appliances;
    }
}
