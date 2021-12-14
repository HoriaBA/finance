package com.hbp.finance.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Integer id) {
        super("Could not find employee " + id);
    }
}
