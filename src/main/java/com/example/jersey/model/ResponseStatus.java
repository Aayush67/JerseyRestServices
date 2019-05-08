package com.example.jersey.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ResponseStatus {
    private String responseMessage;
    private  Integer responseCode;
    public ResponseStatus(Integer responseCode, String  responseMessage)
    {
        this.responseCode=responseCode;
        this.responseMessage=responseMessage;
    }
    public ResponseStatus(){}
}
