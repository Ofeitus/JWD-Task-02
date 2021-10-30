package com.epam.jwd.task02.entity;

import com.epam.jwd.task02.constant.ApplianceCategory;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Class that represents VacuumCleaner appliance
 *
 * @author Ofeitus
 * @version 1.0
 */
public class VacuumCleaner extends Appliance {
    private float powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private float motorSpeedRegulation;
    private float cleaningWidth;

    /**
     * Instantiates a new Vacuum cleaner.
     */
    public VacuumCleaner() {

    }

    /**
     * Instantiates a new Vacuum cleaner with specific params
     *
     * @param price                the price
     * @param powerConsumption     the power consumption
     * @param filterType           the filter type
     * @param bagType              the bag type
     * @param wandType             the wand type
     * @param motorSpeedRegulation the motor speed regulation
     * @param cleaningWidth        the cleaning width
     */
    public VacuumCleaner(float price, float powerConsumption, String filterType, String bagType, String wandType, float motorSpeedRegulation, float cleaningWidth) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    /**
     * Gets power consumption.
     *
     * @return the power consumption
     */
    public float getPowerConsumption() {
        return powerConsumption;
    }

    /**
     * Sets power consumption.
     *
     * @param powerConsumption the power consumption
     */
    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    /**
     * Gets filter type.
     *
     * @return the filter type
     */
    public String getFilterType() {
        return filterType;
    }

    /**
     * Sets filter type.
     *
     * @param filterType the filter type
     */
    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    /**
     * Gets bag type.
     *
     * @return the bag type
     */
    public String getBagType() {
        return bagType;
    }

    /**
     * Sets bag type.
     *
     * @param bagType the bag type
     */
    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    /**
     * Gets wand type.
     *
     * @return the wand type
     */
    public String getWandType() {
        return wandType;
    }

    /**
     * Sets wand type.
     *
     * @param wandType the wand type
     */
    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    /**
     * Gets motor speed regulation.
     *
     * @return the motor speed regulation
     */
    public float getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    /**
     * Sets motor speed regulation.
     *
     * @param motorSpeedRegulation the motor speed regulation
     */
    public void setMotorSpeedRegulation(float motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    /**
     * Gets cleaning width.
     *
     * @return the cleaning width
     */
    public float getCleaningWidth() {
        return cleaningWidth;
    }

    /**
     * Sets cleaning width.
     *
     * @param cleaningWidth the cleaning width
     */
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
            put("CATEGORY", ApplianceCategory.VACUUM_CLEANER);
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
