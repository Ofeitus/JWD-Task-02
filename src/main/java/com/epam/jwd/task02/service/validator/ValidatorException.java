package com.epam.jwd.task02.service.validator;

/**
 * The type Validator exception.
 */
public class ValidatorException extends Exception {
    /**
     * Instantiates a new Validator exception.
     */
    public ValidatorException() {
        super();
    }

    /**
     * Instantiates a new Validator exception with specific message
     *
     * @param message the message
     */
    public ValidatorException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Validator exception with specific message and cause
     *
     * @param message the message
     * @param cause   the cause
     */
    public ValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Validator exception with specific cause
     *
     * @param cause the cause
     */
    public ValidatorException(Throwable cause) {
        super(cause);
    }
}
