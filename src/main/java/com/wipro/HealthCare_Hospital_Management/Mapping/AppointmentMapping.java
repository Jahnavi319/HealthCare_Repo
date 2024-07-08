package com.wipro.HealthCare_Hospital_Management.Mapping;

import com.wipro.HealthCare_Hospital_Management.dto.AppointmentDto;

import com.wipro.HealthCare_Hospital_Management.entity.Appointment;

public class AppointmentMapping {
	
	public static Appointment mapToAppoinment(AppointmentDto appointmentDto) {
		
		Appointment appointment = new Appointment();
				
		appointment.setId(appointmentDto.getId());		
		appointment.setStartTime(appointmentDto.getStartTime());		
		appointment.setEndTime(appointmentDto.getEndTime());
		appointment.setDescription(appointmentDto.getDescription());	
		appointment.setLocation(appointmentDto.getLocation());				
				
		return appointment;
	}
	
	public static AppointmentDto mapToAppointmentDto(Appointment appointment) {
		
		AppointmentDto appointmentDto = new AppointmentDto();
				
		appointmentDto.setId(appointment.getId());		
		appointmentDto.setStartTime(appointment.getStartTime());		
		appointmentDto.setEndTime(appointment.getEndTime());		
		appointmentDto.setDescription(appointment.getDescription());
		appointmentDto.setLocation(appointment.getLocation());		
			
		
		return appointmentDto;
		
		
	}

}
