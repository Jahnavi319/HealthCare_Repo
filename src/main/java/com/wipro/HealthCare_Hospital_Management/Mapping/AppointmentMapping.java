package com.wipro.healthcare_hospital_management.mapping;

import com.wipro.healthcare_hospital_management.dto.AppointmentDto;
import com.wipro.healthcare_hospital_management.entity.Appointment;

public class AppointmentMapping {
	
	public static Appointment mapToAppoinment(AppointmentDto appointmentDto) {
		
		Appointment appointment = new Appointment();
				
		appointment.setAppointmentId(appointmentDto.getAppointmentId());		
		appointment.setPatientName(appointmentDto.getPatientName());
		appointment.setPatientAge(appointmentDto.getPatientAge());	
		appointment.setContactNumber(appointmentDto.getContactNumber());				
		appointment.setDateAndTime(appointmentDto.getDateAndTime());
		appointment.setDescription(appointmentDto.getDescription());
		appointment.setLocation(appointmentDto.getLocation());
		
		return appointment;
	}
	
	public static AppointmentDto mapToAppointmentDto(Appointment appointment) {
		
		AppointmentDto appointmentDto = new AppointmentDto();
				
		appointmentDto.setAppointmentId(appointment.getAppointmentId());		
		appointmentDto.setPatientName(appointment.getPatientName());
		appointmentDto.setPatientAge(appointment.getPatientAge());
		appointmentDto.setContactNumber(appointment.getContactNumber());		
		appointmentDto.setDateAndTime(appointment.getDateAndTime());	
		appointmentDto.setDescription(appointment.getDescription());
		appointmentDto.setLocation(appointment.getLocation());
		
		return appointmentDto;
		
		
	}

}