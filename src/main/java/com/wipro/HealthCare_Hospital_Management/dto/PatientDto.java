package com.wipro.healthcare_hospital_management.dto;

public class PatientDto {

	private Long patientId;
	private String username;
	private String password;
	private String fullName;
	private int age;
    private String gender;
    private String contactNumber;
    private String appointments;
    private String medicalHistory;
    private String symptoms;	
    private String natureOfVisit;
	
    
    public PatientDto(Long patientId, String username, String password, String fullName, int age, String gender,
			String contactNumber, String appointments, String medicalHistory, String symptoms, String natureOfVisit) {
		super();
		this.patientId = patientId;
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.appointments = appointments;
		this.medicalHistory = medicalHistory;
		this.symptoms = symptoms;
		this.natureOfVisit = natureOfVisit;
	}



	public PatientDto() {
		super();
		
	}


	public Long getPatientId() {
		return patientId;
	}


	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getAppointments() {
		return appointments;
	}


	public void setAppointments(String appointments) {
		this.appointments = appointments;
	}


	public String getMedicalHistory() {
		return medicalHistory;
	}


	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}


	public String getSymptoms() {
		return symptoms;
	}


	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}


	public String getNatureOfVisit() {
		return natureOfVisit;
	}


	public void setNatureOfVisit(String natureOfVisit) {
		this.natureOfVisit = natureOfVisit;
	}

    
    
}
