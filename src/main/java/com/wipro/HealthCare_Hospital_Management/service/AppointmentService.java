package com.wipro.healthcare_hospital_management.service;

import com.wipro.healthcare_hospital_management.dto.AppointmentDto;

public interface AppointmentService {

	AppointmentDto createAppointment(AppointmentDto appointmentDto);
	
	AppointmentDto getAppointmentById(Long Id);

	
}
