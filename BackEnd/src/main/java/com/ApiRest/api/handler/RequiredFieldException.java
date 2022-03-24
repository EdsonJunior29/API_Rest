package com.ApiRest.api.handler;

public class RequiredFieldException extends BusinessException{


    public RequiredFieldException(String field) {
        super("The field %s is mandatory", field);
    }
}
