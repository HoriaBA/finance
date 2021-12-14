package com.hbp.finance.exception;

public class PaychecksNotFoundException extends RuntimeException{

    public PaychecksNotFoundException(Integer id) {
        super("Could not find paycheck " + id);
    }
}
