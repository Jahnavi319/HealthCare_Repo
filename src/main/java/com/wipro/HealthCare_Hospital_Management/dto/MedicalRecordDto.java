package com.wipro.HealthCare_Hospital_Management.dto;

import java.util.Date;

public class MedicalRecordDto {
	
	private Long id;
    private String patientName;
    private int age;
    private String diagnosis;
    private String treatment;
    private Date dateOfRecord;
	
    
    
    public MedicalRecordDto(Long id, String patientName, int age, String diagnosis, String treatment,
			Date dateOfRecord) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.age = age;
		this.diagnosis = diagnosis;
		this.treatment = treatment;
		this.dateOfRecord = dateOfRecord;
	}
    
    
	public MedicalRecordDto() {
		super();
		
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Date getDateOfRecord() {
		return dateOfRecord;
	}
	public void setDateOfRecord(Date dateOfRecord) {
		this.dateOfRecord = dateOfRecord;
	}
    
}
