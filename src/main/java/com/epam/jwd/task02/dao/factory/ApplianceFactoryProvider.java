package com.epam.jwd.task02.dao.factory;

import com.epam.jwd.task02.constant.ApplianceCategory;
import com.epam.jwd.task02.dao.factory.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to provide Appliance factory.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class ApplianceFactoryProvider {
    private static final Map<String, ApplianceFactory> factories = new HashMap<>() {{
        put(ApplianceCategory.OVEN, new OvenFactory());
        put(ApplianceCategory.LAPTOP, new LaptopFactory());
        put(ApplianceCategory.REFRIGERATOR, new RefrigeratorFactory());
        put(ApplianceCategory.VACUUM_CLEANER, new VacuumCleanerFactory());
        put(ApplianceCategory.TABLET_PC, new TabletPCFactory());
        put(ApplianceCategory.SPEAKERS, new SpeakersFactory());
    }};

    /**
     * Gets specific factory by category name.
     *
     * @param applianceCategory the appliance category
     * @return the factory
     */
    public static ApplianceFactory getFactory(String applianceCategory) {
        return factories.get(applianceCategory);
    }

    private ApplianceFactoryProvider() {

    }
}
