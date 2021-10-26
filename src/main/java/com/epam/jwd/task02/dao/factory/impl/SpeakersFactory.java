package com.epam.jwd.task02.dao.factory.impl;

import com.epam.jwd.task02.dao.factory.ApplianceFactory;
import com.epam.jwd.task02.entity.Speakers;
import com.epam.jwd.task02.constant.ApplianceParam;

import java.util.Map;

public class SpeakersFactory implements ApplianceFactory {
    @Override
    public Speakers create(Map<String, String> parameters) {
        Speakers speakers = new Speakers();
        speakers.setFrequencyRange(parameters.get(ApplianceParam.Speakers.FREQUENCY_RANGE.name()));
        speakers.setNumberOfSpeakers(Integer.parseInt(parameters.get(ApplianceParam.Speakers.NUMBER_OF_SPEAKERS.name())));
        speakers.setCordLength(Float.parseFloat(parameters.get(ApplianceParam.Speakers.CORD_LENGTH.name())));
        speakers.setPowerConsumption(Float.parseFloat(parameters.get(ApplianceParam.Speakers.POWER_CONSUMPTION.name())));
        speakers.setPrice(Float.parseFloat(parameters.get(ApplianceParam.Speakers.PRICE.name())));
        return speakers;
    }
}
