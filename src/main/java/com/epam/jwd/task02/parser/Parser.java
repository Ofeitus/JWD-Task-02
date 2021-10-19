package com.epam.jwd.task02.parser;

import com.epam.jwd.task02.exception.ParserException;

import java.util.HashMap;
import java.util.Map;

public class Parser {
    private static final String PRODUCT_CATEGORY_DELIMITER = " : ";
    private static final String PRODUCT_PARAMETERS_DELIMITER = ", ";
    private static final String KEY_VALUE_DELIMITER = "=";

    public String parseCategory(String line) throws ParserException {
        return line.split(PRODUCT_CATEGORY_DELIMITER)[0];
    }

    public Map<String, String> parseParams(String line) throws ParserException {
        String[] stringParams = line.split(PRODUCT_CATEGORY_DELIMITER)[1].split(PRODUCT_PARAMETERS_DELIMITER);
        Map<String, String> params = new HashMap<>();
        for (String stringParam : stringParams) {
            String[] parameter = stringParam.split(KEY_VALUE_DELIMITER);
            params.put(parameter[0], parameter[1]);
        }
        return params;
    }
}
