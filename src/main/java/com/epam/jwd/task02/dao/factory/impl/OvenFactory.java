package com.epam.jwd.task02.dao.factory.impl;

import com.epam.jwd.task02.constant.ApplianceParam;
import com.epam.jwd.task02.dao.factory.ApplianceFactory;
import com.epam.jwd.task02.entity.Oven;

import java.util.Map;

/**
 * Class Oven factory.
 */
public class OvenFactory implements ApplianceFactory {
    @Override
    public Oven create(Map<String, String> parameters) {
        Oven oven = new Oven();
        oven.setCapacity(Float.parseFloat(parameters.get(ApplianceParam.Oven.CAPACITY.name())));
        oven.setDepth(Float.parseFloat(parameters.get(ApplianceParam.Oven.DEPTH.name())));
        oven.setHeight(Float.parseFloat(parameters.get(ApplianceParam.Oven.HEIGHT.name())));
        oven.setWeight(Float.parseFloat(parameters.get(ApplianceParam.Oven.WEIGHT.name())));
        oven.setPowerConsumption(Float.parseFloat(parameters.get(ApplianceParam.Oven.POWER_CONSUMPTION.name())));
        oven.setPrice(Float.parseFloat(parameters.get(ApplianceParam.Oven.PRICE.name())));
        oven.setWidth(Float.parseFloat(parameters.get(ApplianceParam.Oven.WIDTH.name())));
        return oven;
    }
}
