package com.wipro.HealthCare_Hospital_Management.Mapping;

import com.wipro.HealthCare_Hospital_Management.dto.PatientDto;
import com.wipro.HealthCare_Hospital_Management.entity.Patient;

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
		patient.setNature_of_visit(patientDto.getNature_of_visit());
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
		patientDto.setNature_of_visit(patient.getNature_of_visit());
		patientDto.setAge(patient.getage());
		
		return patientDto;
		
	}
}
