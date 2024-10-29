package com.Hp_managment.dashboard.handler;

public class DuplicateEmailException  extends RuntimeException{

    public DuplicateEmailException(String message){
        super(message);
    }

    
}
