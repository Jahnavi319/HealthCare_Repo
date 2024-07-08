package com.wipro.healthcare_hospital_management.exceptions;

public class AdminNotFoundException extends Exception {
	public AdminNotFoundException(String message) {
    	System.out.println("Admin not found");
    }


}
