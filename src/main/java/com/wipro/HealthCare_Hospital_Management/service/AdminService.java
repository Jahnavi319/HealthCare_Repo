package com.wipro.healthcare_hospital_management.service;

import com.wipro.healthcare_hospital_management.dto.AdminDto;
import com.wipro.healthcare_hospital_management.entity.Admin;

public interface AdminService {

	AdminDto createAdmin(AdminDto adminDto);

	AdminDto getAdminById(Long id);

	Admin updateAdmin(Long id, AdminDto adminDto);

	void deleteAdmin(Long id);

}
