package com.baanyan.common.exceptionhandler;

import com.baanyan.common.exception.BusinessException;
import com.baanyan.common.message.BusinessExceptionMessage;
import com.baanyan.common.message.ExceptionMessage;
import com.baanyan.common.message.NoHandlerFoundExceptionMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ExceptionMessage> handleBusinessException(HttpServletRequest req, BusinessException ex) {
        BusinessExceptionMessage message = new BusinessExceptionMessage(ex, req.getRequestURI());
        return new ResponseEntity<ExceptionMessage>(message, message.getCodeMsg());
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ExceptionMessage> requestHandlingNoHandlerFound(HttpServletRequest req, NoHandlerFoundException ex) {
        NoHandlerFoundExceptionMessage errorInfo = new NoHandlerFoundExceptionMessage(ex);
        return new ResponseEntity<ExceptionMessage>(errorInfo, errorInfo.getCodeMsg());
    }
}
