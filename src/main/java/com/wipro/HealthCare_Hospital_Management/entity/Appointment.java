package com.wipro.healthcare_hospital_management.entity;
import java.time.LocalDateTime;


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
	private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
    private String location;

   /* @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @OneToOne(mappedBy = "appointment")
    private MedicalRecord medicalRecord;*/

    

    
    public Appointment() {
		super();
	}

	// Constructor
    public Appointment( Long Id,LocalDateTime startTime, LocalDateTime endTime, String description, String location) {
        this.Id = Id;
    	this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.location = location;
    }

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
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
