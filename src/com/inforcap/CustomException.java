package com.inforcap;

public class CustomException extends Exception{

    private static final long serialVersionUID = 700L;

    public CustomException(String message){
        super(message);
    }
}