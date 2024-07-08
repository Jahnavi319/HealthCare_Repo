package com.wipro.healthcare_hospital_management.service;

import com.wipro.healthcare_hospital_management.dto.AdminDto;

public interface AdminService {

	AdminDto createAdmin(AdminDto adminDto);

	AdminDto getAdminById(Long id);

	AdminDto updateAdmin(Long id, AdminDto adminDto);

	void deleteAdmin(Long id);

}
