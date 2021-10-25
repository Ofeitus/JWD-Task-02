package com.epam.jwd.task02.exception;

public class XmlParserException extends Exception{
    public XmlParserException() {
        super();
    }

    public XmlParserException(String message) {
        super(message);
    }

    public XmlParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public XmlParserException(Throwable cause) {
        super(cause);
    }
}
