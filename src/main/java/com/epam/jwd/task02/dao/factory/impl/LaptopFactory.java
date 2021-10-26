package com.epam.jwd.task02.dao.factory.impl;

import com.epam.jwd.task02.entity.Laptop;
import com.epam.jwd.task02.constant.ApplianceParam;
import com.epam.jwd.task02.dao.factory.ApplianceFactory;

import java.util.Map;

/**
 * Class Laptop factory.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class LaptopFactory implements ApplianceFactory {
    @Override
    public Laptop create(Map<String, String> parameters) {
        Laptop laptop = new Laptop();
        laptop.setBatteryCapacity(Float.parseFloat(parameters.get(ApplianceParam.Laptop.BATTERY_CAPACITY.name())));
        laptop.setCPU(Float.parseFloat(parameters.get(ApplianceParam.Laptop.CPU.name())));
        laptop.setDisplayInches(Float.parseFloat(parameters.get(ApplianceParam.Laptop.DISPLAY_INCHES.name())));
        laptop.setMemoryROM(Integer.parseInt(parameters.get(ApplianceParam.Laptop.MEMORY_ROM.name())));
        laptop.setOS(parameters.get(ApplianceParam.Laptop.OS.name()));
        laptop.setPrice(Float.parseFloat(parameters.get(ApplianceParam.Laptop.PRICE.name())));
        laptop.setSystemMemory(Integer.parseInt(parameters.get(ApplianceParam.Laptop.SYSTEM_MEMORY.name())));
        return laptop;
    }
}
