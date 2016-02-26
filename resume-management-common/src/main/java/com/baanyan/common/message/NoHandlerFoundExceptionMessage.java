package com.baanyan.common.message;

import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * Created by steve on 2/25/16.
 */
public class NoHandlerFoundExceptionMessage extends ExceptionMessage {
    public NoHandlerFoundExceptionMessage(NoHandlerFoundException e) {
        super(HttpStatus.NOT_FOUND, "No handler found for " + e.getHttpMethod() + " " + e.getRequestURL(), e.getRequestURL());
    }
}
