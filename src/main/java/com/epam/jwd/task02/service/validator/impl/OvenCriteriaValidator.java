package com.epam.jwd.task02.service.validator.impl;

import com.epam.jwd.task02.constant.ApplianceParam;
import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.service.validator.ApplianceCriteriaValidator;
import com.epam.jwd.task02.service.validator.ValidatorException;

/**
 * The type Oven criteria validator.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class OvenCriteriaValidator implements ApplianceCriteriaValidator {
    @Override
    public void validate(SearchCriteria criteria) throws ValidatorException {
        for(String param : criteria.getSearchCriteria()) {
            try {
                ApplianceParam.Oven.valueOf(param);
            } catch (IllegalArgumentException e) {
                throw new ValidatorException("Invalid parameter for Oven: " + param);
            }

            if (param.equals(ApplianceParam.Oven.CAPACITY.name()) ||
                    param.equals(ApplianceParam.Oven.PRICE.name()) ||
                    param.equals(ApplianceParam.Oven.DEPTH.name()) ||
                    param.equals(ApplianceParam.Oven.HEIGHT.name()) ||
                    param.equals(ApplianceParam.Oven.WEIGHT.name()) ||
                    param.equals(ApplianceParam.Oven.POWER_CONSUMPTION.name()) ||
                    param.equals(ApplianceParam.Oven.WIDTH.name())) {
                try {
                    Float f = Float.parseFloat(criteria.get(param).toString());
                } catch (NumberFormatException e) {
                    throw new ValidatorException("Invalid type of parameter " + param + ", " + "Float expected");
                }
            }
        }
    }
}
