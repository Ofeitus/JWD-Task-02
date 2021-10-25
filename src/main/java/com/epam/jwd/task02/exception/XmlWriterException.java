package com.epam.jwd.task02.exception;

public class XmlWriterException extends Exception{
    public XmlWriterException() {
        super();
    }

    public XmlWriterException(String message) {
        super(message);
    }

    public XmlWriterException(String message, Throwable cause) {
        super(message, cause);
    }

    public XmlWriterException(Throwable cause) {
        super(cause);
    }
}
