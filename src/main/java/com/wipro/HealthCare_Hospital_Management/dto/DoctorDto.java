package com.wipro.healthcare_hospital_management.dto;

public class DoctorDto {

	//public int getDoctorId;
	private int doctorId;
	private String doctorName;
	private Long phoneNumber;
	private String email;
	private int yearsOfExperience;
	private String specialization;
	
	
	
	/*@Override
	public String toString() {
		return "DoctorDto [doctorId=" + doctorId + ", doctorName=" + doctorName + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", yearsOfExperience=" + yearsOfExperience + ", specialization=" + specialization
				+ "]";
	}*/

	public DoctorDto() {
		super();
		
	}

	public DoctorDto(int doctorId, String doctorName, Long phoneNumber, String email, int yearsOfExperience,
			String specialization) {
		
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.yearsOfExperience = yearsOfExperience;
		this.specialization = specialization;
	}



	public int getDoctorId() {
		return doctorId;
	}



	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}



	public String getDoctorName() {
		return doctorName;
	}



	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}



	public Long getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getYearsOfExperience() {
		return yearsOfExperience;
	}



	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}



	public String getSpecialization() {
		return specialization;
	}



	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}
