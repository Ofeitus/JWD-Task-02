package com.epam.jwd.task02.dao.impl;

import com.epam.jwd.task02.entity.criteria.Criteria;
import com.epam.jwd.task02.exception.DaoException;
import com.epam.jwd.task02.factory.Factory;
import com.epam.jwd.task02.factory.FactoryProvider;
import com.epam.jwd.task02.parser.Parser;
import com.epam.jwd.task02.dao.ApplianceDao;
import com.epam.jwd.task02.entity.Appliance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplianceDaoImpl implements ApplianceDao {

    @Override
    public List<Appliance> findByCategory(String name) throws DaoException {
        Factory<Appliance> factory = FactoryProvider.takeFactory(name);
        List<Appliance> appliances = new ArrayList<>();
        Parser parser = new Parser();
        try {
            Stream<String> lines = Files.lines(Path.of(
                    "C:\\Users\\ofeitus\\IdeaProjects\\JWD-Task-02\\src\\main\\resources\\shop_db.txt"));
            List<String> products = lines.filter(o -> parser.parsName(o).equals(name)).collect(Collectors.toList());
            for (String product : products) {
                Map<String, String> params = parser.parsParams(product);
                appliances.add(factory.create(params));
            }
        } catch (IOException exception) {
            throw new DaoException(exception);
        }
        return appliances;
    }

    @Override
    public List<Appliance> find(Criteria criteria) throws DaoException {
        Factory<Appliance> factory = FactoryProvider.takeFactory(criteria.getGroupSearchName());
        List<Appliance> appliances = new ArrayList<>();
        Parser parser = new Parser();
        Set<String> keyCriteria = criteria.getSearchCriteria();
        try {
            Stream<String> lines = Files.lines(Path.of(
                    "C:\\Users\\ofeitus\\IdeaProjects\\JWD-Task-02\\src\\main\\resources\\shop_db.txt"));
            List<String> products = lines.filter(o -> parser.parsName(o).equals(criteria.getGroupSearchName())).collect(Collectors.toList());
            products = products.stream().filter(o -> {
                Map<String, String> params = parser.parsParams(o);
                return keyCriteria.stream().allMatch(criterion -> criteria.get(criterion).toString().equals(params.get(criterion)));
            }).collect(Collectors.toList());
            for (String product : products) {
                Map<String, String> params = parser.parsParams(product);
                appliances.add(factory.create(params));
            }
        } catch (IOException exception) {
            throw new DaoException(exception);
        }
        return appliances;
    }
}
