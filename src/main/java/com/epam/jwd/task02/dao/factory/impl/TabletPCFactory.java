package com.epam.jwd.task02.dao.factory.impl;

import com.epam.jwd.task02.dao.factory.ApplianceFactory;
import com.epam.jwd.task02.entity.TabletPC;

import java.util.Map;

public class TabletPCFactory implements ApplianceFactory {
    private static final String FLASH_MEMORY_CAPACITY = "FLASH_MEMORY_CAPACITY";
    private static final String COLOR = "COLOR";
    private static final String DISPLAY_INCHES = "DISPLAY_INCHES";
    private static final String MEMORY_ROM = "MEMORY_ROM";
    private static final String BATTERY_CAPACITY = "BATTERY_CAPACITY";
    private static final String PRICE = "PRICE";

    @Override
    public TabletPC create(Map<String, String> parameters) {
        TabletPC product = new TabletPC();
        product.setBatteryCapacity(Float.parseFloat(parameters.get(BATTERY_CAPACITY)));
        product.setDisplayInches(Float.parseFloat(parameters.get(DISPLAY_INCHES)));
        product.setMemoryROM(Integer.parseInt(parameters.get(MEMORY_ROM)));
        product.setColor(parameters.get(COLOR));
        product.setFlashMemoryCapacity(Float.parseFloat(parameters.get(FLASH_MEMORY_CAPACITY)));
        product.setPrice(Float.parseFloat(parameters.get(PRICE)));
        return product;
    }
}
