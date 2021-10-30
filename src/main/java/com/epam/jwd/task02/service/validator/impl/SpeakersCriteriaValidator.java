package com.epam.jwd.task02.service.validator.impl;

import com.epam.jwd.task02.constant.ApplianceParam;
import com.epam.jwd.task02.entity.criteria.SearchCriteria;
import com.epam.jwd.task02.service.validator.ApplianceCriteriaValidator;
import com.epam.jwd.task02.service.validator.ValidatorException;

/**
 * The type Speakers criteria validator.
 *
 * @author Ofeitus
 * @version 1.0
 */
public class SpeakersCriteriaValidator implements ApplianceCriteriaValidator {
    @Override
    public void validate(SearchCriteria criteria) throws ValidatorException {
        for(String param : criteria.getSearchCriteria()) {
            try {
                ApplianceParam.Speakers.valueOf(param);
            } catch (IllegalArgumentException e) {
                throw new ValidatorException("Invalid parameter for Speakers: " + param);
            }

            if (param.equals(ApplianceParam.Speakers.POWER_CONSUMPTION.name()) ||
                    param.equals(ApplianceParam.Speakers.CORD_LENGTH.name()) ||
                    param.equals(ApplianceParam.Speakers.PRICE.name())) {
                try {
                    Float f = Float.parseFloat(criteria.get(param).toString());
                } catch (NumberFormatException e) {
                    throw new ValidatorException("Invalid type of parameter " + param + ", " + "Float expected");
                }
            } else if (param.equals(ApplianceParam.Speakers.NUMBER_OF_SPEAKERS.name())) {
                try {
                    Integer i = Integer.parseInt(criteria.get(param).toString());
                } catch (NumberFormatException e) {
                    throw new ValidatorException("Invalid type of parameter " + param + ", " + "Integer expected");
                }
            }
        }
    }
}
