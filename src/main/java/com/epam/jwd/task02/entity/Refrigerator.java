package com.epam.jwd.task02.entity;

import com.epam.jwd.task02.constant.ApplianceName;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Refrigerator extends Appliance {
    private float powerConsumption;
    private float weight;
    private float freezerCapacity;
    private float overallCapacity;
    private float height;
    private float width;

    public Refrigerator() {
    }

    public Refrigerator(float price, float powerConsumption, float weight, float freezerCapacity, float overallCapacity, float height, float width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(float freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public float getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(float overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

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
            put("CATEGORY", ApplianceName.REFRIGERATOR);
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
