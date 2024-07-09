
package com.wipro.healthcare_hospital_management.mapping;

import com.wipro.healthcare_hospital_management.dto.AdminDto;

import com.wipro.healthcare_hospital_management.entity.Admin;


public class AdminMapping {

	

	public static Admin mapToAdmin(AdminDto adminDto) {
		
		Admin admin = new Admin();
				
		admin.setId(adminDto.getId());		
		admin.setUsername(adminDto.getUsername());
		admin.setPassword(adminDto.getPassword());	
		admin.setRole(adminDto.getRole());
				
		return admin;
	}
	
	public static AdminDto mapToAdminDto(Admin admin) {
		
		AdminDto adminDto = new AdminDto();
				
		adminDto.setId(admin.getId());		
		adminDto.setUsername(admin.getUsername());
		adminDto.setPassword(admin.getPassword());
		adminDto.setRole(admin.getRole());		
		
		return adminDto;
		
		
	}
}
