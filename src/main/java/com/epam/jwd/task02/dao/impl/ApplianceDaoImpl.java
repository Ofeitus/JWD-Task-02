package com.epam.jwd.task02.dao.impl;

import com.epam.jwd.task02.entity.criteria.Criteria;
import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.exception.DaoException;
import com.epam.jwd.task02.exception.ParserException;
import com.epam.jwd.task02.factory.ApplianceFactory;
import com.epam.jwd.task02.factory.ApplianceFactoryProducer;
import com.epam.jwd.task02.parser.Parser;
import com.epam.jwd.task02.dao.ApplianceDao;
import com.epam.jwd.task02.entity.Appliance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ApplianceDaoImpl implements ApplianceDao {
    private static final String dbPath =
            "C:\\Users\\ofeitus\\IdeaProjects\\JWD-Task-02\\src\\main\\resources\\shop_db.txt";

    @Override
    public List<Appliance> find(Criteria criteria) throws DaoException {
        ApplianceFactory applianceFactory = ApplianceFactoryProducer.getFactory(criteria.getCategoryName());
        List<Appliance> appliances = new ArrayList<>();
        Parser parser = new Parser();
        List<String> lines;
        try {
             lines = Files.lines(Path.of(dbPath)).collect(Collectors.toList());
        } catch (IOException e) {
            throw new DaoException(e);
        }
        try {
            for (String line : lines) {
                String category = parser.parseCategory(line);
                Map<String, String> params = parser.parseParams(line);

                if (category.equals(criteria.getCategoryName()) &&
                        criteria.getSearchCriteria().stream().allMatch(criterion ->
                                criteria.get(criterion).toString().equals(params.get(criterion)))) {
                    appliances.add(applianceFactory.create(params));
                }
            }
            return appliances;
        } catch (ParserException e) {
            throw new DaoException(e);
        }
    }
}
