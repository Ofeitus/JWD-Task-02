package com.epam.jwd.task02.dao;

import com.epam.jwd.task02.entity.criteria.Criteria;
import com.epam.jwd.task02.exception.DaoException;
import com.epam.jwd.task02.entity.Appliance;

import java.util.List;

public interface ApplianceDao {
    List<Appliance> findByCategory(String name) throws DaoException;

    List<Appliance> find(Criteria criteria) throws DaoException;
}
