package com.baanyan.common.message;

import org.springframework.http.HttpStatus;

/**
 * Created by steve on 2/23/16.
 */
public class ExceptionMessage extends Message<String> {

    private String url;

    public ExceptionMessage(HttpStatus code,String msg,String url){
        super(code,msg);
        this.url = url;
    }

    public ExceptionMessage(HttpStatus code,Exception e,String url) {
        super(code,e.getMessage());
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}


