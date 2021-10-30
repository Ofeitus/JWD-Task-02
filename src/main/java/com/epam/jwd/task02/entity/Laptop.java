package com.epam.jwd.task02.entity;

import com.epam.jwd.task02.constant.ApplianceCategory;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Class that represents Laptop appliance
 *
 * @author Ofeitus
 * @version 1.0
 */
public class Laptop extends Appliance {
    private float batteryCapacity;
    private String OS;
    private int memoryROM;
    private int systemMemory;
    private float CPU;
    private float displayInches;

    /**
     * Instantiates a new Laptop.
     */
    public Laptop() {
    }

    /**
     * Instantiates a new Laptop with specific params
     *
     * @param price           the price
     * @param OS              the os
     * @param CPU             the cpu
     * @param batteryCapacity the battery capacity
     * @param memoryROM       the memory rom
     * @param systemMemory    the system memory
     * @param displayInches   the display inches
     */
    public Laptop(float price, String OS, float CPU, float batteryCapacity, int memoryROM, int systemMemory, float displayInches) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.OS = OS;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
        this.displayInches = displayInches;
    }

    /**
     * Gets os.
     *
     * @return the os
     */
    public String getOS() {
        return OS;
    }

    /**
     * Sets os.
     *
     * @param OS the os
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Gets cpu.
     *
     * @return the cpu
     */
    public float getCPU() {
        return CPU;
    }

    /**
     * Sets cpu.
     *
     * @param CPU the cpu
     */
    public void setCPU(float CPU) {
        this.CPU = CPU;
    }

    /**
     * Gets battery capacity.
     *
     * @return the battery capacity
     */
    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Sets battery capacity.
     *
     * @param batteryCapacity the battery capacity
     */
    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    /**
     * Gets memory rom.
     *
     * @return the memory rom
     */
    public int getMemoryROM() {
        return memoryROM;
    }

    /**
     * Sets memory rom.
     *
     * @param memoryROM the memory rom
     */
    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    /**
     * Gets system memory.
     *
     * @return the system memory
     */
    public int getSystemMemory() {
        return systemMemory;
    }

    /**
     * Sets system memory.
     *
     * @param systemMemory the system memory
     */
    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    /**
     * Gets display inches.
     *
     * @return the display inches
     */
    public float getDisplayInches() {
        return displayInches;
    }

    /**
     * Sets display inches.
     *
     * @param displayInches the display inches
     */
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
            put("CATEGORY", ApplianceCategory.LAPTOP);
            put(ApplianceParam.PRICE, String.valueOf(getPrice()));
            put(ApplianceParam.Laptop.BATTERY_CAPACITY.name(), String.valueOf(batteryCapacity));
            put(ApplianceParam.Laptop.CPU.name(), String.valueOf(CPU));
            put(ApplianceParam.Laptop.DISPLAY_INCHES.name(), String.valueOf(displayInches));
            put(ApplianceParam.Laptop.SYSTEM_MEMORY.name(), String.valueOf(systemMemory));
        }};
    }
}
