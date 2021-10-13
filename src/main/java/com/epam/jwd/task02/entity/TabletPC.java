package com.epam.jwd.task02.entity;

import java.util.Objects;

public class TabletPC extends Appliance {
    private float batteryCapacity;
    private float displayInches;
    private int memoryROM;
    private float flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public TabletPC(float price, String color, float flashMemoryCapacity, float batteryCapacity, int memoryROM, float displayInches) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(float flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public float getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(float displayInches) {
        this.displayInches = displayInches;
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
        TabletPC tabletPC = (TabletPC) o;
        return Float.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) == 0
                && Float.compare(tabletPC.batteryCapacity, batteryCapacity) == 0
                && memoryROM == tabletPC.memoryROM
                && Float.compare(tabletPC.displayInches, displayInches) == 0
                && Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, flashMemoryCapacity, batteryCapacity, memoryROM, displayInches);
    }

    @Override
    public String toString() {
        return "TabletPC{" + "price=" + getPrice() +
                "color='" + color + '\'' +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", batteryCapacity=" + batteryCapacity +
                ", memoryROM=" + memoryROM +
                ", displayInches=" + displayInches +
                '}';
    }
}
