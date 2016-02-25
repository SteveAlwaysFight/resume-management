package com.baanyan.message;

import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * Created by steve on 2/25/16.
 */
public class NoHandlerFoundExceptionMessage extends ExceptionMessage {
    public NoHandlerFoundExceptionMessage(NoHandlerFoundException e, String url) {
        super(HttpStatus.NOT_FOUND, e, url);
    }
}
