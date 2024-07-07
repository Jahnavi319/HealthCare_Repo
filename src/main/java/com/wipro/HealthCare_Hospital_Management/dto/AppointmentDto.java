package com.wipro.HealthCare_Hospital_Management.dto;

import java.time.LocalDateTime;

public class AppointmentDto {
	

	private Long Id; 
	private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
    private String location;

    
    public AppointmentDto() {
		super();
	}

    public AppointmentDto( Long Id,LocalDateTime startTime, LocalDateTime endTime, String description, String location) {
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
