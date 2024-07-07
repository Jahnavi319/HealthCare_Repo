package com.wipro.HealthCare_Hospital_Management.services;

import java.util.List;

import com.wipro.HealthCare_Hospital_Management.dto.AppointmentDto;
import com.wipro.HealthCare_Hospital_Management.entity.Appointment;

public interface AppointmentService {

	AppointmentDto createAppointment(AppointmentDto appointmentDto);
	
	AppointmentDto getAppointmentById(Long Id);

	
}
