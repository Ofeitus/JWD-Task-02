package com.epam.jwd.task02.service.validator.impl;

import com.epam.jwd.task02.constant.ApplianceParam;
import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.service.validator.ApplianceCriteriaValidator;
import com.epam.jwd.task02.service.validator.ValidatorException;

/**
 * The type Vacuum cleaner criteria validator.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class VacuumCleanerCriteriaValidator implements ApplianceCriteriaValidator {
    @Override
    public void validate(SearchCriteria criteria) throws ValidatorException {
        for(String param : criteria.getSearchCriteria()) {
            try {
                ApplianceParam.VacuumCleaner.valueOf(param);
            } catch (IllegalArgumentException e) {
                throw new ValidatorException("Invalid parameter for VacuumCleaner: " + param);
            }

            if (param.equals(ApplianceParam.VacuumCleaner.POWER_CONSUMPTION.name()) ||
                    param.equals(ApplianceParam.VacuumCleaner.CLEANING_WIDTH.name()) ||
                    param.equals(ApplianceParam.VacuumCleaner.MOTOR_SPEED_REGULATION.name()) ||
                    param.equals(ApplianceParam.VacuumCleaner.PRICE.name())) {
                try {
                    Float f = Float.parseFloat(criteria.get(param).toString());
                } catch (NumberFormatException e) {
                    throw new ValidatorException("Invalid type of parameter " + param + ", " + "Float expected");
                }
            }
        }
    }
}
