package com.wipro.healthcare_hospital_management.exceptions;

public class InvalidAppointmentException extends RuntimeException {
    public InvalidAppointmentException(String message) {
        super(message);
    }
}