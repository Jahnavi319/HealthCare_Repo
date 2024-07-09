package com.wipro.healthcare_hospital_management.service;

import org.springframework.stereotype.Service;

import com.wipro.healthcare_hospital_management.dto.AdminDto;

import com.wipro.healthcare_hospital_management.entity.Admin;
import com.wipro.healthcare_hospital_management.mapping.AdminMapping;
import com.wipro.healthcare_hospital_management.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
		
		private AdminRepository adminRepository;
		
		


		public AdminServiceImpl(AdminRepository adminRepository) {
			super();
			this.adminRepository = adminRepository;
		}


		@Override
		public AdminDto createAdmin(AdminDto adminDto) {
			
			Admin admin = AdminMapping.mapToAdmin(adminDto);
			Admin savedAdmin = adminRepository.save(admin);
			return AdminMapping.mapToAdminDto(savedAdmin);
		}


		@Override
		public AdminDto getAdminById(Long id) {
			Admin admin = adminRepository.findById(id).orElseThrow(()->new RuntimeException("Admin does not exist "));
			
			return AdminMapping.mapToAdminDto(admin);
		}

		@Override
		public AdminDto updateAdmin(Long id,AdminDto adminDto) {
			Admin admin = adminRepository.findById(id).orElseThrow(() -> new RuntimeException("Admin does not exist"));
	        Admin savedAdmin = adminRepository.save(admin);
	        return AdminMapping.mapToAdminDto(savedAdmin);
	    }
		
		@Override
		public void deleteAdmin(Long id) {
			if (!adminRepository.existsById(id)) {
	            throw new RuntimeException("Admin does not exist");
	        }
	        adminRepository.deleteById(id);
			
		}


}


