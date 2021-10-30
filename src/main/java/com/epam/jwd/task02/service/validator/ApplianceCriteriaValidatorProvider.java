package com.epam.jwd.task02.service.validator;

import com.epam.jwd.task02.constant.ApplianceCategory;
import com.epam.jwd.task02.service.validator.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Appliance criteria validator provider.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class ApplianceCriteriaValidatorProvider {
    private static final Map<String, ApplianceCriteriaValidator> validators = new HashMap<>() {{
        put(ApplianceCategory.OVEN, new OvenCriteriaValidator());
        put(ApplianceCategory.LAPTOP, new LaptopCriteriaValidator());
        put(ApplianceCategory.REFRIGERATOR, new RefrigeratorCriteriaValidator());
        put(ApplianceCategory.VACUUM_CLEANER, new VacuumCleanerCriteriaValidator());
        put(ApplianceCategory.TABLET_PC, new TabletPCCriteriaValidator());
        put(ApplianceCategory.SPEAKERS, new SpeakersCriteriaValidator());
    }};

    /**
     * Get validator.
     *
     * @param applianceCategory the appliance category
     * @return the validator
     */
    public static ApplianceCriteriaValidator getValidator(String applianceCategory) {
        return validators.get(applianceCategory);
    }

    private ApplianceCriteriaValidatorProvider() {

    }
}
