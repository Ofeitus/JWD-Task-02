package com.epam.jwd.task02.entity;

import com.epam.jwd.task02.constant.ApplianceCategory;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Class that represents Refrigerator appliance
 *
 * @author Ofeitus
 * @version 1.0
 */
public class Refrigerator extends Appliance {
    private float powerConsumption;
    private float weight;
    private float freezerCapacity;
    private float overallCapacity;
    private float height;
    private float width;

    /**
     * Instantiates a new Refrigerator.
     */
    public Refrigerator() {
    }

    /**
     * Instantiates a new Refrigerator with specific params
     *
     * @param price            the price
     * @param powerConsumption the power consumption
     * @param weight           the weight
     * @param freezerCapacity  the freezer capacity
     * @param overallCapacity  the overall capacity
     * @param height           the height
     * @param width            the width
     */
    public Refrigerator(float price, float powerConsumption, float weight, float freezerCapacity, float overallCapacity, float height, float width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
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
     * Gets weight.
     *
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Gets freezer capacity.
     *
     * @return the freezer capacity
     */
    public float getFreezerCapacity() {
        return freezerCapacity;
    }

    /**
     * Sets freezer capacity.
     *
     * @param freezerCapacity the freezer capacity
     */
    public void setFreezerCapacity(float freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    /**
     * Gets overall capacity.
     *
     * @return the overall capacity
     */
    public float getOverallCapacity() {
        return overallCapacity;
    }

    /**
     * Sets overall capacity.
     *
     * @param overallCapacity the overall capacity
     */
    public void setOverallCapacity(float overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(float width) {
        this.width = width;
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
        Refrigerator that = (Refrigerator) o;
        return Float.compare(that.powerConsumption, powerConsumption) == 0
                && Float.compare(that.weight, weight) == 0
                && Float.compare(that.freezerCapacity, freezerCapacity) == 0
                && Float.compare(that.overallCapacity, overallCapacity) == 0
                && Float.compare(that.height, height) == 0
                && Float.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" + "price=" + getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public Map<String, String> getParams() {
        return new HashMap<>() {{
            put("CATEGORY", ApplianceCategory.REFRIGERATOR);
            put(ApplianceParam.PRICE, String.valueOf(getPrice()));
            put(ApplianceParam.Refrigerator.POWER_CONSUMPTION.name(), String.valueOf(powerConsumption));
            put(ApplianceParam.Refrigerator.FREEZER_CAPACITY.name(), String.valueOf(freezerCapacity));
            put(ApplianceParam.Refrigerator.HEIGHT.name(), String.valueOf(height));
            put(ApplianceParam.Refrigerator.WIDTH.name(), String.valueOf(width));
            put(ApplianceParam.Refrigerator.OVERALL_CAPACITY.name(), String.valueOf(overallCapacity));
            put(ApplianceParam.Refrigerator.WEIGHT.name(), String.valueOf(weight));
        }};
    }
}
