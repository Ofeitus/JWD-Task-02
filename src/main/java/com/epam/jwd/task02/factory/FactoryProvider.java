package com.epam.jwd.task02.factory;

import com.epam.jwd.task02.entity.Appliance;
import com.epam.jwd.task02.factory.impl.*;

import java.util.Locale;
import java.util.Map;

public enum FactoryProvider implements Factory<Appliance> {
    OVEN(new OvenFactory()),
    KETTLE(new KettleFactory()),
    LAPTOP(new LaptopFactory()),
    REFRIGERATOR(new RefrigeratorFactory()),
    VACUUMCLEANER(new VacuumCleanerFactory()),
    TABLETPC(new TabletPCFactory()),
    SPEAKERS(new SpeakersFactory());

    private final Factory<? extends Appliance> factory;

    FactoryProvider(Factory<? extends Appliance> factory) {
        this.factory = factory;
    }

    @Override
    public Appliance create(Map<String, String> parameters) {
        return factory.create(parameters);
    }

    public static Factory<Appliance> takeFactory(String name) {
        return valueOf(name.toUpperCase(Locale.ROOT));
    }
}
