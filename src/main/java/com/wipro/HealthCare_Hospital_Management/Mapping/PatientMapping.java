package com.wipro.healthcare_hospital_management.mapping;

import com.wipro.healthcare_hospital_management.dto.PatientDto;
import com.wipro.healthcare_hospital_management.entity.Patient;

public class PatientMapping {

	public static Patient mapToPatient(PatientDto patientDto) {
		
		Patient patient = new Patient();
		
		patient.setPatientId(patientDto.getPatientId());
		patient.setFullName(patientDto.getFullName());
		patient.setGender(patientDto.getGender());
		patient.setContactNumber(patientDto.getContactNumber());
		patient.setAppointments(patientDto.getAppointments());
		patient.setSymptoms(patientDto.getSymptoms());
		patient.setMedicalHistory(patientDto.getMedicalHistory());
		patient.setNatureOfVisit(patientDto.getNatureOfVisit());
		patient.setage(patientDto.getAge());
		
		return patient;
		
	}
	public static PatientDto mapToPatientDto(Patient patient) {
		
		PatientDto patientDto = new PatientDto();
		
		patientDto.setPatientId(patient.getPatientId());
		patientDto.setFullName(patient.getFullName());
		patientDto.setGender(patient.getGender());
		patientDto.setContactNumber(patient.getContactNumber());
		patientDto.setAppointments(patient.getAppointments());
		patientDto.setSymptoms(patient.getSymptoms());
		patientDto.setMedicalHistory(patient.getMedicalHistory());
		patientDto.setNatureOfVisit(patient.getNatureOfVisit());
		patientDto.setAge(patient.getage());
		
		return patientDto;
		
	}
}
