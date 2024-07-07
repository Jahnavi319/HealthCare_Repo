package com.wipro.HealthCare_Hospital_Management.controller;

import java.util.List;



import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.HealthCare_Hospital_Management.dto.AppointmentDto;
import com.wipro.HealthCare_Hospital_Management.entity.Appointment;
import com.wipro.HealthCare_Hospital_Management.repository.AppointmentRepository;
import com.wipro.HealthCare_Hospital_Management.services.AppointmentService;

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
	
	
/*	@RequestMapping("/insert")
	public AppointmentDto createAppointment(@RequestBody AppointmentDto appointmentdto) {
		
		return appointmentRepository.save(appointmentdto);
		
	}
	@GetMapping("/show")
	public List<Appointment> getAllAppointment(){
		return appointmentService.findAll();
	}*/
}
