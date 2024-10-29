package com.Hp_managment.dashboard.handler;

public class PasswordNotMatchException extends RuntimeException {

    public PasswordNotMatchException(String message){
        super(message);
    }
    
}
