package com.wipro.HealthCare_Hospital_Management.services.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.HealthCare_Hospital_Management.Mapping.AppointmentMapping;
import com.wipro.HealthCare_Hospital_Management.dto.AppointmentDto;
import com.wipro.HealthCare_Hospital_Management.entity.Appointment;
import com.wipro.HealthCare_Hospital_Management.repository.AppointmentRepository;
import com.wipro.HealthCare_Hospital_Management.services.AppointmentService;

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
