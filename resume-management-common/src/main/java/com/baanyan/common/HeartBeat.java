package com.baanyan.common;

import com.baanyan.common.exception.AccessDeniedException;
import com.baanyan.common.message.Message;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by steve on 2/25/16.
 */
@RestController
public class HeartBeat {
    @RequestMapping(value = "/test/",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Message> throwException(){
        throw new AccessDeniedException();
    }
}
