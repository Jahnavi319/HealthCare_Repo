package com.wipro.healthcare_hospital_management.controller;

import java.util.Optional;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.healthcare_hospital_management.dto.AppointmentDto;
import com.wipro.healthcare_hospital_management.dto.MedicalRecordDto;
import com.wipro.healthcare_hospital_management.entity.Appointment;
import com.wipro.healthcare_hospital_management.entity.MedicalRecord;
import com.wipro.healthcare_hospital_management.service.AppointmentService;



@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {

	private AppointmentService appointmentService;
	
	
	public AppointmentController(AppointmentService appointmentService) {
		super();
		this.appointmentService = appointmentService;
	}
	
	@PostMapping("/insert")
	public ResponseEntity<AppointmentDto> addAppointment(@RequestBody AppointmentDto appointmentDto){
		
        System.out.println(appointmentDto);
		return new ResponseEntity<>(appointmentService.createAppointment(appointmentDto),HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AppointmentDto> getAppointmentById(@PathVariable Long id){
		
		AppointmentDto appointmentDto = appointmentService.getAppointmentById(id);
		return ResponseEntity.ok(appointmentDto);
		
	}
	
	
	@PutMapping("/update/{id}")
	public Appointment updateAppointment(@PathVariable Long id, @RequestBody AppointmentDto appointmentDto) {
		return appointmentService.updateAppointment(id, appointmentDto);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteAppointment(@PathVariable Long id) {
		appointmentService.deleteAppointment(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
