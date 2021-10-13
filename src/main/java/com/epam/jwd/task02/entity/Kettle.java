package com.epam.jwd.task02.entity;

import java.util.Objects;

public class Kettle extends Appliance {
    private float powerConsumption;
    private float overallCapacity;
    private float volume;

    public Kettle() {
    }

    public Kettle(float price, float powerConsumption, float overallCapacity, float volume) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.overallCapacity = overallCapacity;
        this.volume = volume;
    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public float getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(float overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
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
        Kettle kettle = (Kettle) o;
        return Float.compare(kettle.powerConsumption, powerConsumption) == 0
                && Float.compare(kettle.overallCapacity, overallCapacity) == 0
                && Float.compare(kettle.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, overallCapacity, volume);
    }

    @Override
    public String toString() {
        return "Kettle{" + "price=" + getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", overallCapacity=" + overallCapacity +
                ", volume=" + volume +
                '}';
    }
}
