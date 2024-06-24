package com.diveedilab.petchallenge.exception;

import java.io.Serial;

public class ExceptionResourceNotFound extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    public ExceptionResourceNotFound(String message) {
        super(message);
    }
}
