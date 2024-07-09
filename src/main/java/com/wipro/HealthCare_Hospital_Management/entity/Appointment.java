package com.wipro.healthcare_hospital_management.entity;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long appointmentId; 

	@Column(name = "patientName")
	private String patientName;
	
	@Column(name = "patientAge")
	private String patientAge;
	
	@Column(name = "contactNumber")
	private Long contactNumber;
	
	@Column(name = "dateAndTime")
	private LocalDateTime dateAndTime;
	
	@Column(name = "description")
    private String description;
	
	@Column(name = "location")
    private String location;
	 
	@ManyToOne
    @JoinColumn(name = "doctor_id")
	private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToOne(mappedBy = "appointment")
    private MedicalRecord medicalRecord;

	    

	public Appointment(Long appointmentId, String patientName, String patientAge, Long contactNumber,
			LocalDateTime dateAndTime, String description, String location, Doctor doctor, Patient patient,
			MedicalRecord medicalRecord) {
		super();
		this.appointmentId = appointmentId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.contactNumber = contactNumber;
		this.dateAndTime = dateAndTime;
		this.description = description;
		this.location = location;
	
	}

	public Appointment() {
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

/*	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}*/


}
