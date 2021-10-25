package com.epam.jwd.task02.dao.factory.impl;

import com.epam.jwd.task02.entity.criteria.AppliancesParams;
import com.epam.jwd.task02.dao.factory.ApplianceFactory;
import com.epam.jwd.task02.entity.Oven;

import java.util.Map;

public class OvenFactory implements ApplianceFactory {
    @Override
    public Oven create(Map<String, String> parameters) {
        Oven product = new Oven();
        product.setCapacity(Float.parseFloat(parameters.get(AppliancesParams.Oven.CAPACITY.name())));
        product.setDepth(Float.parseFloat(parameters.get(AppliancesParams.Oven.DEPTH.name())));
        product.setHeight(Float.parseFloat(parameters.get(AppliancesParams.Oven.HEIGHT.name())));
        product.setWeight(Float.parseFloat(parameters.get(AppliancesParams.Oven.WEIGHT.name())));
        product.setPowerConsumption(Float.parseFloat(parameters.get(AppliancesParams.Oven.POWER_CONSUMPTION.name())));
        product.setPrice(Float.parseFloat(parameters.get(AppliancesParams.Oven.PRICE.name())));
        product.setWidth(Float.parseFloat(parameters.get(AppliancesParams.Oven.WIDTH.name())));
        return product;
    }
}
