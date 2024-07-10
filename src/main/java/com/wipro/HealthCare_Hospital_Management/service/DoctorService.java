package com.wipro.healthcare_hospital_management.service;

import java.util.List;

import com.wipro.healthcare_hospital_management.dto.DoctorDto;
import com.wipro.healthcare_hospital_management.entity.Doctor;

public interface DoctorService {
	
    DoctorDto createDoctor(DoctorDto doctorDto);
	
	DoctorDto getDoctorById(Long Id);

	void deleteDoctor(Long id);

	Doctor updateDoctor(Long id, DoctorDto doctorDto);

//	List<DoctorDto> getAllDoctors();

}
