package com.wipro.healthcare_hospital_management.service;

import java.util.List;
import java.util.Optional;

import com.wipro.healthcare_hospital_management.dto.AdminDto;
import com.wipro.healthcare_hospital_management.dto.AppointmentDto;
import com.wipro.healthcare_hospital_management.entity.Appointment;

public interface AppointmentService {

	AppointmentDto createAppointment(AppointmentDto appointmentDto);
	
	AppointmentDto getAppointmentById(Long id);

	
	void deleteAppointment(Long id);

	Appointment updateAppointment(Long id, AppointmentDto appointmentDto);

	
    
	
}
