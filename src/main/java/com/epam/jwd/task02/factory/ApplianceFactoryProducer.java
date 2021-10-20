package com.epam.jwd.task02.factory;

import com.epam.jwd.task02.factory.impl.*;

import java.util.HashMap;
import java.util.Map;

public class ApplianceFactoryProducer {
    private static final Map<String, ApplianceFactory> factories = new HashMap<>() {{
        put("OVEN", new OvenFactory());
        put("LAPTOP", new LaptopFactory());
        put("REFRIGERATOR", new RefrigeratorFactory());
        put("VACUUMCLEANER", new VacuumCleanerFactory());
        put("TABLETPC", new TabletPCFactory());
        put("SPEAKERS", new SpeakersFactory());
    }};

    public static ApplianceFactory getFactory(String applianceCategory) {
        return factories.get(applianceCategory.toUpperCase());
    }
}
