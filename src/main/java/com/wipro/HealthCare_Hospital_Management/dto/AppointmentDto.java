package com.wipro.healthcare_hospital_management.dto;
import java.time.LocalDateTime;

public class AppointmentDto {
	

	private Long appointmentId; 
	private String patientName;
	private String patientAge;
	private Long contactNumber;
	private LocalDateTime dateAndTime;
    private String description;
    private String location;
    
    
	public AppointmentDto(Long appointmentId, String patientName, String patientAge, Long contactNumber, LocalDateTime dateAndTime,
			String description, String location) {
		super();
		this.appointmentId = appointmentId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.contactNumber = contactNumber;
		this.dateAndTime = dateAndTime;
		this.description = description;
		this.location = location;
	}
	
	public AppointmentDto() {
		super();
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
	public String getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public LocalDateTime getDateAndTime() {
		return dateAndTime;
	}
	public void setDateAndTime(LocalDateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	    
}
