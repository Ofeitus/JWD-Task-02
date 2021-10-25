package com.epam.jwd.task02.dao.factory.impl;

import com.epam.jwd.task02.entity.Laptop;
import com.epam.jwd.task02.entity.criteria.AppliancesParams;
import com.epam.jwd.task02.dao.factory.ApplianceFactory;

import java.util.Map;

public class LaptopFactory implements ApplianceFactory {
    @Override
    public Laptop create(Map<String, String> parameters) {
        Laptop product = new Laptop();
        product.setBatteryCapacity(Float.parseFloat(parameters.get(AppliancesParams.Laptop.BATTERY_CAPACITY.name())));
        product.setCPU(Float.parseFloat(parameters.get(AppliancesParams.Laptop.CPU.name())));
        product.setDisplayInches(Float.parseFloat(parameters.get(AppliancesParams.Laptop.DISPLAY_INCHES.name())));
        product.setMemoryROM(Integer.parseInt(parameters.get(AppliancesParams.Laptop.MEMORY_ROM.name())));
        product.setOS(parameters.get(AppliancesParams.Laptop.OS.name()));
        product.setPrice(Float.parseFloat(parameters.get(AppliancesParams.Laptop.PRICE.name())));
        product.setSystemMemory(Integer.parseInt(parameters.get(AppliancesParams.Laptop.SYSTEM_MEMORY.name())));
        return product;
    }
}
