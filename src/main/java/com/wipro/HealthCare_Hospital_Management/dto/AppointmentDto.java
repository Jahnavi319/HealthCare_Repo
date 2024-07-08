package com.wipro.healthcare_hospital_management.dto;
import java.time.LocalDateTime;

public class AppointmentDto {
	

	private Long Id; 
	private LocalDateTime date_time;
  //  private LocalDateTime endTime;
    private String description;
    private String location;

    
    
    public AppointmentDto() {
		super();
	}

    public AppointmentDto( Long Id,LocalDateTime date_time, String description, String location) {
        this.Id = Id;
    	this.date_time = date_time;
       //.endTime = endTime;
        this.description = description;
        this.location = location;
    }

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	
	public LocalDateTime getDate_time() {
		return date_time;
	}

	public void setDate_time(LocalDateTime date_time) {
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

	public boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}

    

	    
}
