package com.wipro.healthcare_hospital_management.controller;

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

import com.wipro.healthcare_hospital_management.dto.AdminDto;
import com.wipro.healthcare_hospital_management.dto.AppointmentDto;
import com.wipro.healthcare_hospital_management.entity.Admin;
import com.wipro.healthcare_hospital_management.entity.Appointment;
import com.wipro.healthcare_hospital_management.service.AdminService;


@RestController
@RequestMapping("/api/admin")
public class AdminController {
private AdminService adminService;
	
	
	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	@PostMapping("/insert")
	public ResponseEntity<AdminDto> addAdmin(@RequestBody AdminDto adminDto){
		
        System.out.println(adminDto);
		return new ResponseEntity<>(adminService.createAdmin(adminDto),HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AdminDto> getAdminById(@PathVariable Long id){
		
		AdminDto adminDto = adminService.getAdminById(id);
		return ResponseEntity.ok(adminDto);
		
	}
	

	@PutMapping("/update/{id}")
	public Admin updateAdmin(@PathVariable Long id, @RequestBody AdminDto adminDto) {
		return adminService.updateAdmin(id, adminDto);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteAdmin(@PathVariable Long id) {
		adminService.deleteAdmin(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
