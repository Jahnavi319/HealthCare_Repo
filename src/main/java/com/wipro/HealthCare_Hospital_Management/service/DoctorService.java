package com.wipro.healthcare_hospital_management.service;

import com.wipro.healthcare_hospital_management.dto.DoctorDto;

public interface DoctorService {
	
    DoctorDto createDoctor(DoctorDto doctorDto);
	
	DoctorDto getDoctorById(Long Id);

	void deleteDoctor(Long id);

	DoctorDto updateDoctor(Long id, DoctorDto doctorDto);

}
