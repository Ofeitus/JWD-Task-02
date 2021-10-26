package com.epam.jwd.task02.dao.factory.impl;

import com.epam.jwd.task02.dao.factory.ApplianceFactory;
import com.epam.jwd.task02.entity.TabletPC;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.Map;

/**
 * Class Tablet pc factory.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class TabletPCFactory implements ApplianceFactory {
    @Override
    public TabletPC create(Map<String, String> parameters) {
        TabletPC tabletPC = new TabletPC();
        tabletPC.setBatteryCapacity(Float.parseFloat(parameters.get(ApplianceParam.TabletPC.BATTERY_CAPACITY.name())));
        tabletPC.setDisplayInches(Float.parseFloat(parameters.get(ApplianceParam.TabletPC.DISPLAY_INCHES.name())));
        tabletPC.setMemoryROM(Integer.parseInt(parameters.get(ApplianceParam.TabletPC.MEMORY_ROM.name())));
        tabletPC.setColor(parameters.get(ApplianceParam.TabletPC.COLOR.name()));
        tabletPC.setFlashMemoryCapacity(Float.parseFloat(parameters.get(ApplianceParam.TabletPC.FLASH_MEMORY_CAPACITY.name())));
        tabletPC.setPrice(Float.parseFloat(parameters.get(ApplianceParam.TabletPC.PRICE.name())));
        return tabletPC;
    }
}
