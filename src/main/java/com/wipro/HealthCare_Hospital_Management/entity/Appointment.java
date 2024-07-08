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
@Table(name = "Appointment")
public class Appointment {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id; 
	
	@Column(name = "date_time")
	private LocalDateTime date_time;
	
	@Column(name = "description")
    private String description;
	
	@Column(name = "location")
    private String location;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    Patient patient;

    @OneToOne(mappedBy = "appointment")
    private MedicalRecord medicalRecord;

    

    
    public Appointment() {
		super();
	}

	// Constructor
    public Appointment( Long Id,LocalDateTime date_time, String description, String location) {
        this.Id = Id;
    	this.date_time = date_time;
      
        this.description = description;
        this.location = location;
    }

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public LocalDateTime getdate_time() {
		return date_time;
	}

	public void setdate_time(LocalDateTime date_time) {
		this.date_time = date_time;
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
