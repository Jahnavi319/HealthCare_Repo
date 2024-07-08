package com.wipro.healthcare_hospital_management.service;

import java.util.Optional;

import com.wipro.healthcare_hospital_management.dto.AdminDto;
import com.wipro.healthcare_hospital_management.dto.AppointmentDto;

public interface AppointmentService {

	AppointmentDto createAppointment(AppointmentDto appointmentDto);
	
	AppointmentDto getAppointmentById(Long id);

	
	void deleteAppointment(Long id);

	AppointmentDto updateAppointment(Long id, AppointmentDto appointmentDto);

	

	
	
	
	
}
