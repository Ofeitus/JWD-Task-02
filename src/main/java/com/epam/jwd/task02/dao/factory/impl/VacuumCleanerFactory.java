package com.epam.jwd.task02.dao.factory.impl;

import com.epam.jwd.task02.dao.factory.ApplianceFactory;
import com.epam.jwd.task02.entity.VacuumCleaner;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.Map;

/**
 * Class Vacuum cleaner factory.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class VacuumCleanerFactory implements ApplianceFactory {
    @Override
    public VacuumCleaner create(Map<String, String> parameters) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setCleaningWidth(Float.parseFloat(parameters.get(ApplianceParam.VacuumCleaner.CLEANING_WIDTH.name())));
        vacuumCleaner.setWandType(parameters.get(ApplianceParam.VacuumCleaner.WAND_TYPE.name()));
        vacuumCleaner.setFilterType(parameters.get(ApplianceParam.VacuumCleaner.FILTER_TYPE.name()));
        vacuumCleaner.setBagType(parameters.get(ApplianceParam.VacuumCleaner.BAG_TYPE.name()));
        vacuumCleaner.setPowerConsumption(Float.parseFloat(parameters.get(ApplianceParam.VacuumCleaner.POWER_CONSUMPTION.name())));
        vacuumCleaner.setPrice(Float.parseFloat(parameters.get(ApplianceParam.VacuumCleaner.PRICE.name())));
        vacuumCleaner.setMotorSpeedRegulation(Float.parseFloat(parameters.get(ApplianceParam.VacuumCleaner.MOTOR_SPEED_REGULATION.name())));
        return vacuumCleaner;
    }
}
