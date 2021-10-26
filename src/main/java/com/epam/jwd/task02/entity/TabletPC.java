package com.epam.jwd.task02.entity;

import com.epam.jwd.task02.constant.ApplianceName;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Class that represents TabletPC appliance
 *
 * @author Ofeitus
 * @version 1.0
 */
public class TabletPC extends Appliance {
    private float batteryCapacity;
    private float displayInches;
    private int memoryROM;
    private float flashMemoryCapacity;
    private String color;

    /**
     * Instantiates a new Tablet pc.
     */
    public TabletPC() {
    }

    /**
     * Instantiates a new Tablet pc with specific params
     *
     * @param price               the price
     * @param color               the color
     * @param flashMemoryCapacity the flash memory capacity
     * @param batteryCapacity     the battery capacity
     * @param memoryROM           the memory rom
     * @param displayInches       the display inches
     */
    public TabletPC(float price, String color, float flashMemoryCapacity, float batteryCapacity, int memoryROM, float displayInches) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets flash memory capacity.
     *
     * @return the flash memory capacity
     */
    public float getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    /**
     * Sets flash memory capacity.
     *
     * @param flashMemoryCapacity the flash memory capacity
     */
    public void setFlashMemoryCapacity(float flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
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
                ", color='" + color + '\'' +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", batteryCapacity=" + batteryCapacity +
                ", memoryROM=" + memoryROM +
                ", displayInches=" + displayInches +
                '}';
    }

    @Override
    public Map<String, String> getParams() {
        return new HashMap<>() {{
            put("CATEGORY", ApplianceName.TABLET_PC);
            put(ApplianceParam.PRICE, String.valueOf(getPrice()));
            put(ApplianceParam.TabletPC.COLOR.name(), String.valueOf(color));
            put(ApplianceParam.TabletPC.FLASH_MEMORY_CAPACITY.name(), String.valueOf(flashMemoryCapacity));
            put(ApplianceParam.TabletPC.BATTERY_CAPACITY.name(), String.valueOf(batteryCapacity));
            put(ApplianceParam.TabletPC.MEMORY_ROM.name(), String.valueOf(memoryROM));
            put(ApplianceParam.TabletPC.DISPLAY_INCHES.name(), String.valueOf(displayInches));
        }};
    }
}
