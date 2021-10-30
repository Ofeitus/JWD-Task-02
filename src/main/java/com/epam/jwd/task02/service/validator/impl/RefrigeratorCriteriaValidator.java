package com.epam.jwd.task02.service.validator.impl;

import com.epam.jwd.task02.constant.ApplianceParam;
import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.service.validator.ApplianceCriteriaValidator;
import com.epam.jwd.task02.service.validator.ValidatorException;

/**
 * The type Refrigerator criteria validator.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class RefrigeratorCriteriaValidator implements ApplianceCriteriaValidator {
    @Override
    public void validate(SearchCriteria criteria) throws ValidatorException {
        for(String param : criteria.getSearchCriteria()) {
            try {
                ApplianceParam.Refrigerator.valueOf(param);
            } catch (IllegalArgumentException e) {
                throw new ValidatorException("Invalid parameter for Refrigerator: " + param);
            }

            if (param.equals(ApplianceParam.Refrigerator.HEIGHT.name()) ||
                    param.equals(ApplianceParam.Refrigerator.WEIGHT.name()) ||
                    param.equals(ApplianceParam.Refrigerator.FREEZER_CAPACITY.name()) ||
                    param.equals(ApplianceParam.Refrigerator.OVERALL_CAPACITY.name()) ||
                    param.equals(ApplianceParam.Refrigerator.POWER_CONSUMPTION.name()) ||
                    param.equals(ApplianceParam.Refrigerator.WIDTH.name()) ||
                    param.equals(ApplianceParam.Refrigerator.PRICE.name())) {
                try {
                    Float f = Float.parseFloat(criteria.get(param).toString());
                } catch (NumberFormatException e) {
                    throw new ValidatorException("Invalid type of parameter " + param + ", " + "Float expected");
                }
            }
        }
    }
}
