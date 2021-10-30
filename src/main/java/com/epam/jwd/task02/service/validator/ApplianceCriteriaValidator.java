package com.epam.jwd.task02.service.validator;

import com.epam.jwd.task02.entity.criteria.SearchCriteria;

/**
 * The interface Appliance criteria validator.
 *
 * @author Ofeitus
 * @version 1.0
 */
public interface ApplianceCriteriaValidator {
    /**
     * Validate appliance criteria by parameters type
     *
     * @param criteria the criteria
     * @throws ValidatorException the validator exception
     */
    void validate(SearchCriteria criteria) throws ValidatorException;
}
