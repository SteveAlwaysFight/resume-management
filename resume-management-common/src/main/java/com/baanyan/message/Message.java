package com.baanyan.message;

import org.springframework.http.HttpStatus;

/**
 * Created by steve on 2/24/16.
 */
public class Message<T> {

    private int code;
    private HttpStatus codeMsg;

    private T content;

    public Message(HttpStatus code,T content){
        this.content = content;
        this.codeMsg = code;
        this.code = codeMsg.value();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public HttpStatus getCodeMsg() {
        return codeMsg;
    }

    public void setCodeMsg(HttpStatus codeMsg) {
        this.codeMsg = codeMsg;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
