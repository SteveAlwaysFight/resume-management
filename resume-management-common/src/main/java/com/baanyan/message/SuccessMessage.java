package com.baanyan.message;

import org.springframework.http.HttpStatus;

/**
 * Created by steve on 2/25/16.
 */
public class SuccessMessage extends Message {
    public SuccessMessage( Object content) {
        super(HttpStatus.OK, content);
    }
}
