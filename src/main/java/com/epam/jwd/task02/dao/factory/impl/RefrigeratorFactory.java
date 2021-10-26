package com.epam.jwd.task02.dao.factory.impl;

import com.epam.jwd.task02.entity.Refrigerator;
import com.epam.jwd.task02.constant.ApplianceParam;
import com.epam.jwd.task02.dao.factory.ApplianceFactory;

import java.util.Map;

/**
 * Class Refrigerator factory.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class RefrigeratorFactory implements ApplianceFactory {
    @Override
    public Refrigerator create(Map<String, String> parameters) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setOverallCapacity(Float.parseFloat(parameters.get(ApplianceParam.Refrigerator.OVERALL_CAPACITY.name())));
        refrigerator.setFreezerCapacity(Float.parseFloat(parameters.get(ApplianceParam.Refrigerator.FREEZER_CAPACITY.name())));
        refrigerator.setHeight(Float.parseFloat(parameters.get(ApplianceParam.Refrigerator.HEIGHT.name())));
        refrigerator.setWeight(Float.parseFloat(parameters.get(ApplianceParam.Refrigerator.WEIGHT.name())));
        refrigerator.setPowerConsumption(Float.parseFloat(parameters.get(ApplianceParam.Refrigerator.POWER_CONSUMPTION.name())));
        refrigerator.setPrice(Float.parseFloat(parameters.get(ApplianceParam.Refrigerator.PRICE.name())));
        refrigerator.setWidth(Float.parseFloat(parameters.get(ApplianceParam.Refrigerator.WIDTH.name())));
        return refrigerator;
    }
}
