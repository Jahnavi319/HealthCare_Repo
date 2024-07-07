package com.wipro.HealthCare_Hospital_Management.services;

import com.wipro.HealthCare_Hospital_Management.dto.DoctorDto;

public interface DoctorService {
	
    DoctorDto createDoctor(DoctorDto doctorDto);
	
	DoctorDto getDoctorById(Long Id);

}
