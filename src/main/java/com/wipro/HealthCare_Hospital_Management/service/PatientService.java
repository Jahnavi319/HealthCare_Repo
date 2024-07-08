package com.wipro.healthcare_hospital_management.service;

import com.wipro.healthcare_hospital_management.dto.PatientDto;

public interface PatientService {
	

	
	PatientDto createPatient(PatientDto patientDto);
	
	PatientDto getPatientById(Long Id);

}