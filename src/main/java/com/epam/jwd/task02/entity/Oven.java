package com.epam.jwd.task02.entity;

import com.epam.jwd.task02.constant.ApplianceCategory;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Class that represents Oven appliance
 *
 * @author Ofeitus
 * @version 1.0
 */
public class Oven extends Appliance {
    private float powerConsumption;
    private float weight;
    private float capacity;
    private float depth;
    private float height;
    private float width;

    /**
     * Instantiates a new Oven.
     */
    public Oven() {
    }

    /**
     * Instantiates a new Oven with specific params
     *
     * @param price            the price
     * @param powerConsumption the power consumption
     * @param weight           the weight
     * @param capacity         the capacity
     * @param depth            the depth
     * @param height           the height
     * @param width            the width
     */
    public Oven(float price, float powerConsumption, float weight, float capacity, float depth, float height, float width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
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
     * Gets capacity.
     *
     * @return the capacity
     */
    public float getCapacity() {
        return capacity;
    }

    /**
     * Sets capacity.
     *
     * @param capacity the capacity
     */
    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets depth.
     *
     * @return the depth
     */
    public float getDepth() {
        return depth;
    }

    /**
     * Sets depth.
     *
     * @param depth the depth
     */
    public void setDepth(float depth) {
        this.depth = depth;
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
        Oven oven = (Oven) o;
        return Float.compare(oven.powerConsumption, powerConsumption) == 0
                && Float.compare(oven.weight, weight) == 0
                && Float.compare(oven.capacity, capacity) == 0
                && Float.compare(oven.depth, depth) == 0
                && Float.compare(oven.height, height) == 0
                && Float.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" + "price=" + getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public Map<String, String> getParams() {
        return new HashMap<>() {{
            put("CATEGORY", ApplianceCategory.OVEN);
            put(ApplianceParam.PRICE, String.valueOf(getPrice()));
            put(ApplianceParam.Oven.CAPACITY.name(), String.valueOf(capacity));
            put(ApplianceParam.Oven.DEPTH.name(), String.valueOf(depth));
            put(ApplianceParam.Oven.HEIGHT.name(), String.valueOf(height));
            put(ApplianceParam.Oven.WIDTH.name(), String.valueOf(width));
            put(ApplianceParam.Oven.POWER_CONSUMPTION.name(), String.valueOf(powerConsumption));
            put(ApplianceParam.Oven.WEIGHT.name(), String.valueOf(weight));
        }};
    }
}
