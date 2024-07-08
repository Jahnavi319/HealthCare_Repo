package com.wipro.healthcare_hospital_management.mapping;

import com.wipro.healthcare_hospital_management.dto.AppointmentDto;
import com.wipro.healthcare_hospital_management.entity.Appointment;

public class AppointmentMapping {
	
	public static Appointment mapToAppoinment(AppointmentDto appointmentDto) {
		
		Appointment appointment = new Appointment();
				
		appointment.setId(appointmentDto.getId());		
		appointment.setdate_time(appointmentDto.getDate_time());
		appointment.setDescription(appointmentDto.getDescription());	
		appointment.setLocation(appointmentDto.getLocation());				
				
		return appointment;
	}
	
	public static AppointmentDto mapToAppointmentDto(Appointment appointment) {
		
		AppointmentDto appointmentDto = new AppointmentDto();
				
		appointmentDto.setId(appointment.getId());		
		appointmentDto.setDate_time(appointment.getdate_time());
		appointmentDto.setDescription(appointment.getDescription());
		appointmentDto.setLocation(appointment.getLocation());		
			
		
		return appointmentDto;
		
		
	}

}