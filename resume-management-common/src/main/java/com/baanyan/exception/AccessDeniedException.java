package com.baanyan.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by steve on 2/24/16.
 */
public class AccessDeniedException extends BusinessException {
    public AccessDeniedException() {
        super("You do not have permission to this resource!");
        this.setCode(HttpStatus.FORBIDDEN);
    }
}
