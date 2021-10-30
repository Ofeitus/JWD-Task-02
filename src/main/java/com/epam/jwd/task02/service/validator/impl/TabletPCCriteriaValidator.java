package com.epam.jwd.task02.service.validator.impl;

import com.epam.jwd.task02.constant.ApplianceParam;
import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.service.validator.ApplianceCriteriaValidator;
import com.epam.jwd.task02.service.validator.ValidatorException;

/**
 * The type Tablet pc criteria validator.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class TabletPCCriteriaValidator implements ApplianceCriteriaValidator {
    @Override
    public void validate(SearchCriteria criteria) throws ValidatorException {
        for(String param : criteria.getSearchCriteria()) {
            try {
                ApplianceParam.TabletPC.valueOf(param);
            } catch (IllegalArgumentException e) {
                throw new ValidatorException("Invalid parameter for TabletPC: " + param);
            }

            if (param.equals(ApplianceParam.TabletPC.BATTERY_CAPACITY.name()) ||
                param.equals(ApplianceParam.TabletPC.FLASH_MEMORY_CAPACITY.name()) ||
                param.equals(ApplianceParam.TabletPC.DISPLAY_INCHES.name()) ||
                param.equals(ApplianceParam.TabletPC.PRICE.name())) {
                try {
                    Float f = Float.parseFloat(criteria.get(param).toString());
                } catch (NumberFormatException e) {
                    throw new ValidatorException("Invalid type of parameter " + param + ", " + "Float expected");
                }
            } else if (param.equals(ApplianceParam.TabletPC.MEMORY_ROM.name())) {
                try {
                    Integer i = Integer.parseInt(criteria.get(param).toString());
                } catch (NumberFormatException e) {
                    throw new ValidatorException("Invalid type of parameter " + param + ", " + "Integer expected");
                }
            }
        }
    }
}
