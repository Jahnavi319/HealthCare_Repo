package com.wipro.healthcare_hospital_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.healthcare_hospital_management.dto.AppointmentDto;
import com.wipro.healthcare_hospital_management.dto.MedicalRecordDto;
import com.wipro.healthcare_hospital_management.entity.Appointment;
import com.wipro.healthcare_hospital_management.entity.MedicalRecord;
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

	@Override
	public Appointment updateAppointment(Long id, AppointmentDto appointmentDto) {
	     Appointment existingAppointment = appointmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Doctor not found with id: " + id));
	        existingAppointment.setAppointmentId(appointmentDto.getAppointmentId());
	        existingAppointment.setPatientName(appointmentDto.getPatientName());
	        existingAppointment.setPatientAge(appointmentDto.getPatientAge());
	        existingAppointment.setContactNumber(appointmentDto.getContactNumber());
	        existingAppointment.setDateAndTime(appointmentDto.getDateAndTime());
	        existingAppointment.setDescription(appointmentDto.getDescription());
	        existingAppointment.setLocation(appointmentDto.getLocation());
	       
	        Appointment savedAppointment = appointmentRepository.save(existingAppointment);
	        return appointmentRepository.save(savedAppointment);
	      
	 }
	@Override
	public void deleteAppointment(Long id) {
		if (!appointmentRepository.existsById(id)) {
            throw new RuntimeException("Appointment does not exist");
        }
        appointmentRepository.deleteById(id);
		
	}




	

}


	
	
	


