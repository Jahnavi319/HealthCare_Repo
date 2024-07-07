package com.wipro.HealthCare_Hospital_Management.Mapping;

import com.wipro.HealthCare_Hospital_Management.dto.AppointmentDto;

import com.wipro.HealthCare_Hospital_Management.entity.Appointment;

public class AppointmentMapping {
	
	public static Appointment mapToAppoinment(AppointmentDto appointmentDto) {
		
		Appointment appointment = new Appointment(
				
				appointmentDto.getId(),
				appointmentDto.getStartTime(),
				appointmentDto.getEndTime(),
				appointmentDto.getDescription(),
				appointmentDto.getLocation()
				
				);
		return appointment;
	}
	
	public static AppointmentDto mapToAppointmentDto(Appointment appointment) {
		
		AppointmentDto appointmentDto = new AppointmentDto(
				
				appointment.getId(),
				appointment.getStartTime(),
				appointment.getEndTime(),
				appointment.getDescription(),
				appointment.getLocation()
				);
		
		return appointmentDto;
		
		
	}

}
