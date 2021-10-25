package com.epam.jwd.task02.dao.factory;

import com.epam.jwd.task02.entity.criteria.AppliancesNames;
import com.epam.jwd.task02.dao.factory.impl.*;

import java.util.HashMap;
import java.util.Map;

public class ApplianceFactoryProducer {
    private static final Map<String, ApplianceFactory> factories = new HashMap<>() {{
        put(AppliancesNames.Oven.name(), new OvenFactory());
        put(AppliancesNames.Laptop.name(), new LaptopFactory());
        put(AppliancesNames.Refrigerator.name(), new RefrigeratorFactory());
        put(AppliancesNames.VacuumCleaner.name(), new VacuumCleanerFactory());
        put(AppliancesNames.TabletPC.name(), new TabletPCFactory());
        put(AppliancesNames.Speakers.name(), new SpeakersFactory());
    }};

    public static ApplianceFactory getFactory(String applianceCategory) {
        return factories.get(applianceCategory);
    }
}
