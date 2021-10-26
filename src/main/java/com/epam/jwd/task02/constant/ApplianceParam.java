package com.epam.jwd.task02.constant;

/**
 * Class for Appliance params.
 */
public final class ApplianceParam {
    public static final String CATEGORY = "CATEGORY";
    public static final String PRICE = "PRICE";

    public enum Oven{
        POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH, PRICE
    }

    public enum Laptop{
        BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHES, PRICE
    }

    public enum Refrigerator {
        POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH, PRICE
    }

    public enum VacuumCleaner {
        POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH, PRICE
    }

    public enum TabletPC {
        BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR, PRICE
    }

    public enum Speakers {
        POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH, PRICE
    }

    private ApplianceParam() {

    }
}
