package com.epam.jwd.task02.entity;

import com.epam.jwd.task02.constant.ApplianceName;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Laptop extends Appliance {
    private float batteryCapacity;
    private String OS;
    private int memoryROM;
    private int systemMemory;
    private float CPU;
    private float displayInches;

    public Laptop() {
    }

    public Laptop(float price, String OS, float CPU, float batteryCapacity, int memoryROM, int systemMemory, float displayInches) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.OS = OS;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
        this.displayInches = displayInches;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public float getCPU() {
        return CPU;
    }

    public void setCPU(float CPU) {
        this.CPU = CPU;
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

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
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
        Laptop laptop = (Laptop) o;
        return Float.compare(laptop.CPU, CPU) == 0
                && Float.compare(laptop.batteryCapacity, batteryCapacity) == 0
                && memoryROM == laptop.memoryROM
                && systemMemory == laptop.systemMemory
                && Float.compare(laptop.displayInches, displayInches) == 0
                && Objects.equals(OS, laptop.OS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), OS, CPU, batteryCapacity, memoryROM, systemMemory, displayInches);
    }

    @Override
    public String toString() {
        return "Laptop{" + "price=" + getPrice() +
                ", OS='" + OS + '\'' +
                ", CPU=" + CPU +
                ", batteryCapacity=" + batteryCapacity +
                ", memoryROM=" + memoryROM +
                ", systemMemory=" + systemMemory +
                ", displayInches=" + displayInches +
                '}';
    }

    @Override
    public Map<String, String> getParams() {
        return new HashMap<>() {{
            put("CATEGORY", ApplianceName.LAPTOP);
            put(ApplianceParam.PRICE, String.valueOf(getPrice()));
            put(ApplianceParam.Laptop.BATTERY_CAPACITY.name(), String.valueOf(batteryCapacity));
            put(ApplianceParam.Laptop.CPU.name(), String.valueOf(CPU));
            put(ApplianceParam.Laptop.DISPLAY_INCHES.name(), String.valueOf(displayInches));
            put(ApplianceParam.Laptop.SYSTEM_MEMORY.name(), String.valueOf(systemMemory));
        }};
    }
}
