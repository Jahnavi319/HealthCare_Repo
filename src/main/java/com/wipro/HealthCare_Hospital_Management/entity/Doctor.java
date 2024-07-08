package com.wipro.healthcare_hospital_management.entity;




import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Doctors")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;

	@Column(name = "doctorName")
	private String doctorName;

	@Column(name = "phoneNumber")
	private Long phoneNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "yearsOfExperience")
	private int yearsOfExperience;

	@Column(name = "specialization")
	private String specialization;
	
	@ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;
	
    @ManyToMany(mappedBy = "doctors")
	private Set<Patient> patients = new HashSet<>();

	@OneToMany(mappedBy = "doctor")
	private Set<Appointment> appointments = new HashSet<>();
	    
	public Doctor() {
		super();
		
	}

/*	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", yearsOfExperience=" + yearsOfExperience + ", specialization=" + specialization
				+ "]";
	}*/

    
	
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

