package com.wipro.healthcare_hospital_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.healthcare_hospital_management.dto.AdminDto;
import com.wipro.healthcare_hospital_management.entity.Admin;



@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

	AdminDto save(AdminDto admindto);

	

}