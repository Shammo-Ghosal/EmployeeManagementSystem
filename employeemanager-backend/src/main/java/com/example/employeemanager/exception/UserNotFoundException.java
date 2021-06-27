package com.example.employeemanager.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String user_not_found) {
        super(user_not_found);
    }
}
