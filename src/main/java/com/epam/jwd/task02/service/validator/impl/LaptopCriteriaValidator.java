package com.epam.jwd.task02.service.validator.impl;

import com.epam.jwd.task02.constant.ApplianceParam;
import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.service.validator.ApplianceCriteriaValidator;
import com.epam.jwd.task02.service.validator.ValidatorException;

/**
 * The type Laptop criteria validator.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class LaptopCriteriaValidator implements ApplianceCriteriaValidator {
    @Override
    public void validate(SearchCriteria criteria) throws ValidatorException {
        for(String param : criteria.getSearchCriteria()) {
            try {
                ApplianceParam.Laptop.valueOf(param);
            } catch (IllegalArgumentException e) {
                throw new ValidatorException("Invalid parameter for Laptop: " + param);
            }

            if (param.equals(ApplianceParam.Laptop.BATTERY_CAPACITY.name()) ||
                    param.equals(ApplianceParam.Laptop.CPU.name()) ||
                    param.equals(ApplianceParam.Laptop.DISPLAY_INCHES.name()) ||
                    param.equals(ApplianceParam.Laptop.PRICE.name())) {
                try {
                    Float f = Float.parseFloat(criteria.get(param).toString());
                } catch (NumberFormatException e) {
                    throw new ValidatorException("Invalid type of parameter " + param + ", " + "Float expected");
                }
            } else if (param.equals(ApplianceParam.Laptop.MEMORY_ROM.name()) ||
                       param.equals(ApplianceParam.Laptop.SYSTEM_MEMORY.name())) {
                try {
                    Integer i = Integer.parseInt(criteria.get(param).toString());
                } catch (NumberFormatException e) {
                    throw new ValidatorException("Invalid type of parameter " + param + ", " + "Integer expected");
                }
            }
        }
    }
}
