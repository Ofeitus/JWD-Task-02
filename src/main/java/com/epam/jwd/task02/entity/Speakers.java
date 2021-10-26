package com.epam.jwd.task02.entity;

import com.epam.jwd.task02.constant.ApplianceName;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Class that represents Speakers appliance
 *
 * @author Ofeitus
 * @version 1.0
 */
public class Speakers extends Appliance {
    private float powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private float cordLength;

    /**
     * Instantiates a new Speakers.
     */
    public Speakers() {
    }

    /**
     * Instantiates a new Speakers with specific params
     *
     * @param price            the price
     * @param powerConsumption the power consumption
     * @param numberOfSpeakers the number of speakers
     * @param frequencyRange   the frequency range
     * @param cordLength       the cord length
     */
    public Speakers(float price, float powerConsumption, int numberOfSpeakers, String frequencyRange, float cordLength) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
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
     * Gets number of speakers.
     *
     * @return the number of speakers
     */
    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    /**
     * Sets number of speakers.
     *
     * @param numberOfSpeakers the number of speakers
     */
    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    /**
     * Gets frequency range.
     *
     * @return the frequency range
     */
    public String getFrequencyRange() {
        return frequencyRange;
    }

    /**
     * Sets frequency range.
     *
     * @param frequencyRange the frequency range
     */
    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    /**
     * Gets cord length.
     *
     * @return the cord length
     */
    public float getCordLength() {
        return cordLength;
    }

    /**
     * Sets cord length.
     *
     * @param cordLength the cord length
     */
    public void setCordLength(float cordLength) {
        this.cordLength = cordLength;
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
        Speakers speakers = (Speakers) o;
        return Float.compare(speakers.powerConsumption, powerConsumption) == 0
                && numberOfSpeakers == speakers.numberOfSpeakers
                && Float.compare(speakers.cordLength, cordLength) == 0
                && Objects.equals(frequencyRange, speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" + "price=" + getPrice() +
                ", powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }

    @Override
    public Map<String, String> getParams() {
        return new HashMap<>() {{
            put("CATEGORY", ApplianceName.SPEAKERS);
            put(ApplianceParam.PRICE, String.valueOf(getPrice()));
            put(ApplianceParam.Speakers.POWER_CONSUMPTION.name(), String.valueOf(powerConsumption));
            put(ApplianceParam.Speakers.NUMBER_OF_SPEAKERS.name(), String.valueOf(numberOfSpeakers));
            put(ApplianceParam.Speakers.FREQUENCY_RANGE.name(), String.valueOf(frequencyRange));
            put(ApplianceParam.Speakers.CORD_LENGTH.name(), String.valueOf(cordLength));
        }};
    }
}
