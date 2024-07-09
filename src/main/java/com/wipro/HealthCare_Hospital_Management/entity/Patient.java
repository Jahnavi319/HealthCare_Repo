package com.wipro.healthcare_hospital_management.entity;

import java.util.HashSet;
import java.util.List;

import jakarta.persistence.JoinColumn;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Patients")
public class Patient {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patientId;

	@Column(name = "userName")
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "fullName")
	private String fullName;

	@Column(name = "age")
	private int age;

	@Column(name = "gender")
    private String gender;

	@Column(name = "contactNumber")
    private String contactNumber;

	@Column(name = "appointments")
    private String appointments;

	@Column(name = "medicalHistory")
    private String medicalHistory;

	@Column(name = "symptoms")
    private String symptoms;

	@Column(name = "natureOfVisit")
    private String natureOfVisit;
	
	@ManyToMany
    @JoinTable(
        name = "Doctor_Patient",
        joinColumns = @JoinColumn(name = "patient_id"),
        inverseJoinColumns = @JoinColumn(name = "doctor_id")
    )
    private Set<Doctor> doctors = new HashSet<>();

    @OneToMany(mappedBy = "patient")
    private Set<Appointment> appointment = new HashSet<>();

    @OneToMany(mappedBy = "patient")
    private Set<MedicalRecord> medicalRecords = new HashSet<>();

 
 

	public Patient(Long patientId, String userName, String password, String fullName, int age,
			String gender, String contactNumber, String appointments, String medicalHistory, String symptoms,
			String natureOfVisit) {
		super();
		this.patientId = patientId;
		this.userName = userName;
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


	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
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

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}


	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	
	public String getNatureOfVisit() {
		return natureOfVisit;
	}


	public void setNatureOfVisit(String natureOfVisit) {
		this.natureOfVisit = natureOfVisit;
	}


}
