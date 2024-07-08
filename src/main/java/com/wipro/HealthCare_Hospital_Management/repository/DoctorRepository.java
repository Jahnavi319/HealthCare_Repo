package com.wipro.healthcare_hospital_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.healthcare_hospital_management.dto.DoctorDto;
import com.wipro.healthcare_hospital_management.entity.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{

	DoctorDto save(DoctorDto doctorDto);

	//Doctor findById(Doctor doctor);

}
