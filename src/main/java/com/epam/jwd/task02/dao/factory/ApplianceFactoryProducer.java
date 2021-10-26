package com.epam.jwd.task02.dao.factory;

import com.epam.jwd.task02.constant.ApplianceName;
import com.epam.jwd.task02.dao.factory.impl.*;

import java.util.HashMap;
import java.util.Map;

public class ApplianceFactoryProducer {
    private static final Map<String, ApplianceFactory> factories = new HashMap<>() {{
        put(ApplianceName.OVEN, new OvenFactory());
        put(ApplianceName.LAPTOP, new LaptopFactory());
        put(ApplianceName.REFRIGERATOR, new RefrigeratorFactory());
        put(ApplianceName.VACUUM_CLEANER, new VacuumCleanerFactory());
        put(ApplianceName.TABLET_PC, new TabletPCFactory());
        put(ApplianceName.SPEAKERS, new SpeakersFactory());
    }};

    public static ApplianceFactory getFactory(String applianceCategory) {
        return factories.get(applianceCategory);
    }

    private ApplianceFactoryProducer() {

    }
}
