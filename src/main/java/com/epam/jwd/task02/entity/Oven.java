package com.epam.jwd.task02.entity;

import com.epam.jwd.task02.constant.ApplianceName;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Oven extends Appliance {
    private float powerConsumption;
    private float weight;
    private float capacity;
    private float depth;
    private float height;
    private float width;

    public Oven() {
    }

    public Oven(float price, float powerConsumption, float weight, float capacity, float depth, float height, float width) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
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

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
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
            put("CATEGORY", ApplianceName.OVEN);
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
