package com.wipro.healthcare_hospital_management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.healthcare_hospital_management.dto.DoctorDto;
import com.wipro.healthcare_hospital_management.service.DoctorService;


@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
	
	private DoctorService doctorService;
	
	public DoctorController(DoctorService doctorService) {
		super();
		this.doctorService = doctorService;
	}
	
	@PostMapping("/insert")
	public ResponseEntity<DoctorDto> addDoctor(@RequestBody DoctorDto doctorDto){
		
        System.out.println("====================================================="+doctorDto);
        
		return new ResponseEntity<>(doctorService.createDoctor(doctorDto),HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DoctorDto> getDoctorById(@PathVariable Long id){
		
		DoctorDto doctorDto = doctorService.getDoctorById(id);
		return ResponseEntity.ok(doctorDto);
		
	}
	
	

}

