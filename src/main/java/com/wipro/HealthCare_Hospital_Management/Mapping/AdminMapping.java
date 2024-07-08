package com.wipro.healthcare_hospital_management.mapping;

import com.wipro.healthcare_hospital_management.dto.AdminDto;

import com.wipro.healthcare_hospital_management.entity.Admin;


public class AdminMapping {

	

	public static Admin mapToAdmin(AdminDto adminDto) {
		
		Admin admin = new Admin();
				
		admin.setId(adminDto.getId());		
		admin.setAdminname(adminDto.getAdminname());
		admin.setSpeciality(adminDto.getSpeciality());	
		admin.setDesignation(adminDto.getDesignation());
		admin.setQalification(adminDto.getQalification());
		admin.setExperience(adminDto.getExperience());	
				
		return admin;
	}
	
	public static AdminDto mapToAdminDto(Admin admin) {
		
		AdminDto adminDto = new AdminDto();
				
		adminDto.setId(admin.getId());		
		adminDto.setAdminname(admin.getAdminname());
		adminDto.setSpeciality(admin.getSpeciality());
		adminDto.setDesignation(admin.getDesignation());		
		adminDto.setQalification(admin.getQalification());
		adminDto.setExperience(admin.getExperience());	
		
		return adminDto;
		
		
	}
}
