package com.wipro.healthcare_hospital_management.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "medical_records")
public class MedicalRecord {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long patientId;
    
    @Column(name = "patientName")
    private String patientName;

	@Column(name = "age")
    private int age;

	@Column(name = "diagnosis")
    private String diagnosis;

	@Column(name = "treatment")
    private String treatment;

	@Column(name = "appointmentId")
    private Long appointmentId;
 
/*	@OneToOne
	@JoinColumn(name = "appointmentId")
    private Appointment appointment;
	
	@ManyToOne
	@JoinColumn(name = "patientId")
	private Patient patient;*/




   

    public MedicalRecord(Long patientId, String patientName, int age, String diagnosis, String treatment,
			Long appointmentId, Appointment appointment, Patient patient) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.diagnosis = diagnosis;
		this.treatment = treatment;
		this.appointmentId = appointmentId;
	}

	
	public MedicalRecord() {
		super();
		
	}


	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
