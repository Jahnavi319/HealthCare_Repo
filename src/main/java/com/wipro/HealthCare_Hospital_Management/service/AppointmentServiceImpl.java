package com.wipro.healthcare_hospital_management.service;

import org.springframework.stereotype.Service;

import com.wipro.healthcare_hospital_management.dto.AppointmentDto;
import com.wipro.healthcare_hospital_management.entity.Appointment;
import com.wipro.healthcare_hospital_management.mapping.AppointmentMapping;
import com.wipro.healthcare_hospital_management.repository.AppointmentRepository;



@Service
public class AppointmentServiceImpl implements AppointmentService{

	
	private AppointmentRepository appointmentRepository;
	
	
	public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
		super();
		this.appointmentRepository = appointmentRepository;
	}


	@Override
	public AppointmentDto createAppointment(AppointmentDto appointmentDto) {
		
		Appointment appointment = AppointmentMapping.mapToAppoinment(appointmentDto);
		Appointment savedAppointment = appointmentRepository.save(appointment);
		return AppointmentMapping.mapToAppointmentDto(savedAppointment);
	}


	@Override
	public AppointmentDto getAppointmentById(Long id) {
		Appointment appointment = appointmentRepository.findById(id).orElseThrow(()->new RuntimeException("Appointment does not exist "));
		
		return AppointmentMapping.mapToAppointmentDto(appointment);
	}
	
	

}
