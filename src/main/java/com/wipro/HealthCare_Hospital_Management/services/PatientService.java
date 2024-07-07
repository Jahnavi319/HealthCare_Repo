package com.wipro.HealthCare_Hospital_Management.services;


import com.wipro.HealthCare_Hospital_Management.dto.PatientDto;

public interface PatientService {
	
    PatientDto createPatient(PatientDto patientDto);
	
	PatientDto getAppointmentById(Long Id);

}
