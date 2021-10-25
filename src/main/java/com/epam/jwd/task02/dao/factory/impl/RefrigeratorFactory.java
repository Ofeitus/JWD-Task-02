package com.epam.jwd.task02.dao.factory.impl;

import com.epam.jwd.task02.entity.Refrigerator;
import com.epam.jwd.task02.entity.criteria.AppliancesParams;
import com.epam.jwd.task02.dao.factory.ApplianceFactory;

import java.util.Map;

public class RefrigeratorFactory implements ApplianceFactory {
    @Override
    public Refrigerator create(Map<String, String> parameters) {
        Refrigerator product = new Refrigerator();
        product.setOverallCapacity(Float.parseFloat(parameters.get(AppliancesParams.Refrigerator.OVERALL_CAPACITY.name())));
        product.setFreezerCapacity(Float.parseFloat(parameters.get(AppliancesParams.Refrigerator.FREEZER_CAPACITY.name())));
        product.setHeight(Float.parseFloat(parameters.get(AppliancesParams.Refrigerator.HEIGHT.name())));
        product.setWeight(Float.parseFloat(parameters.get(AppliancesParams.Refrigerator.WEIGHT.name())));
        product.setPowerConsumption(Float.parseFloat(parameters.get(AppliancesParams.Refrigerator.POWER_CONSUMPTION.name())));
        product.setPrice(Float.parseFloat(parameters.get(AppliancesParams.Refrigerator.PRICE.name())));
        product.setWidth(Float.parseFloat(parameters.get(AppliancesParams.Refrigerator.WIDTH.name())));
        return product;
    }
}
