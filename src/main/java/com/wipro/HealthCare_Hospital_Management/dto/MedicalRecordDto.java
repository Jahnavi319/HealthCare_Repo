package com.wipro.healthcare_hospital_management.dto;

import java.util.Date;

public class MedicalRecordDto {
	
	private Long patientId;
    private String patientName;
    private int age;
    private String diagnosis;
    private String treatment;
    private Long appointmentId;

    
	public MedicalRecordDto(Long patientId, String patientName, int age, String diagnosis, String treatment,
			Long appointmentId) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.diagnosis = diagnosis;
		this.treatment = treatment;
		this.appointmentId = appointmentId;
	}


	public MedicalRecordDto() {
		super();
		
	}


	
	public Long getPatientId() {
		return patientId;
	}


	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}


	public Long getAppointmentId() {
		return appointmentId;
	}


	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}


	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	
}
