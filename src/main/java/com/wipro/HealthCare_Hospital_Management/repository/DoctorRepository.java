package com.wipro.HealthCare_Hospital_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.HealthCare_Hospital_Management.dto.DoctorDto;
import com.wipro.HealthCare_Hospital_Management.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{

	DoctorDto save(DoctorDto doctorDto);

	//Doctor findById(Doctor doctor);

}
