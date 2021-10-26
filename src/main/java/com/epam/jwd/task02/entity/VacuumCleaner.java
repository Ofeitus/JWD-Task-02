package com.epam.jwd.task02.entity;

import com.epam.jwd.task02.constant.ApplianceName;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VacuumCleaner extends Appliance {
    private float powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private float motorSpeedRegulation;
    private float cleaningWidth;

    public VacuumCleaner() {

    }

    public VacuumCleaner(float price, float powerConsumption, String filterType, String bagType, String wandType, float motorSpeedRegulation, float cleaningWidth) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public float getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(float motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public float getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(float cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        VacuumCleaner that = (VacuumCleaner) o;
        return Float.compare(that.powerConsumption, powerConsumption) == 0
                && Float.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0
                && Float.compare(that.cleaningWidth, cleaningWidth) == 0
                && Objects.equals(filterType, that.filterType)
                && Objects.equals(bagType, that.bagType)
                && Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" + "price=" + getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }

    @Override
    public Map<String, String> getParams() {
        return new HashMap<>() {{
            put("CATEGORY", ApplianceName.VACUUM_CLEANER);
            put(ApplianceParam.PRICE, String.valueOf(getPrice()));
            put(ApplianceParam.VacuumCleaner.POWER_CONSUMPTION.name(), String.valueOf(powerConsumption));
            put(ApplianceParam.VacuumCleaner.FILTER_TYPE.name(), String.valueOf(filterType));
            put(ApplianceParam.VacuumCleaner.BAG_TYPE.name(), String.valueOf(bagType));
            put(ApplianceParam.VacuumCleaner.WAND_TYPE.name(), String.valueOf(wandType));
            put(ApplianceParam.VacuumCleaner.MOTOR_SPEED_REGULATION.name(), String.valueOf(motorSpeedRegulation));
            put(ApplianceParam.VacuumCleaner.CLEANING_WIDTH.name(), String.valueOf(cleaningWidth));
        }};
    }
}
