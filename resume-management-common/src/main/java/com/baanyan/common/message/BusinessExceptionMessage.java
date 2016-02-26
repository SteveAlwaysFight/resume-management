package com.baanyan.common.message;

import com.baanyan.common.exception.BusinessException;

/**
 * Created by steve on 2/25/16.
 */
public class BusinessExceptionMessage extends ExceptionMessage {
    public BusinessExceptionMessage(BusinessException e,String url) {
        super(e.getCode(), e,url);
    }
}
