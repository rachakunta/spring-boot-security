package com.rana.spring.exception;

public class NotAMajorException extends RuntimeException {

    public NotAMajorException(String message) {
        super(message);
    }
}
