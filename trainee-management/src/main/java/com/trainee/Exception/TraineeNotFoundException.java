package com.trainee.Exception;

public class TraineeNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public TraineeNotFoundException(String message) {
        super(message);
    }
}