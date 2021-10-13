package com.epam.jwd.task02.factory.impl;

import com.epam.jwd.task02.factory.Factory;
import com.epam.jwd.task02.entity.Kettle;

import java.util.Map;

public class KettleFactory implements Factory<Kettle> {
    private static final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private static final String OVERALL_CAPACITY = "OVERALL_CAPACITY";
    private static final String VOLUME = "VOLUME";
    private static final String PRICE = "PRICE";

    @Override
    public Kettle create(Map<String, String> parameters) {
        Kettle product = new Kettle();
        product.setPowerConsumption(Float.parseFloat(parameters.get(POWER_CONSUMPTION)));
        product.setOverallCapacity(Float.parseFloat(parameters.get(OVERALL_CAPACITY)));
        product.setVolume(Float.parseFloat(parameters.get(VOLUME)));
        product.setPrice(Float.parseFloat(parameters.get(PRICE)));
        return product;
    }
}
