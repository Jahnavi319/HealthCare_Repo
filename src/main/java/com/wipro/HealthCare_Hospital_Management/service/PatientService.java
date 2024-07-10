package com.wipro.healthcare_hospital_management.service;

import com.wipro.healthcare_hospital_management.dto.PatientDto;
import com.wipro.healthcare_hospital_management.entity.Patient;

public interface PatientService {
	

	
	PatientDto createPatient(PatientDto patientDto);
	
	PatientDto getPatientById(Long Id);

	void deletePatient(Long id);

	Patient updatePatient(Long id, PatientDto patientDto);

}