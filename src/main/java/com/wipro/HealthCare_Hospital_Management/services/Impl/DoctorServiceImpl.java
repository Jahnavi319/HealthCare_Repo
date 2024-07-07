
package com.wipro.HealthCare_Hospital_Management.services.Impl;


import org.springframework.stereotype.Service;

import com.wipro.HealthCare_Hospital_Management.Mapping.DoctorMapping;

import com.wipro.HealthCare_Hospital_Management.dto.DoctorDto;

import com.wipro.HealthCare_Hospital_Management.entity.Doctor;

import com.wipro.HealthCare_Hospital_Management.repository.DoctorRepository;

import com.wipro.HealthCare_Hospital_Management.services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{

	
	private DoctorRepository doctorRepository;
	
	
	
	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}



	@Override
	public DoctorDto createDoctor(DoctorDto doctorDto) {
		Doctor doctor = DoctorMapping.mapToDoctor(doctorDto);
		System.out.println("++++++++++++++++++++++++++++++++++++++"+doctor);
		Doctor savedDoctor = doctorRepository.save(doctor);
		return DoctorMapping.mapToDoctorDto(savedDoctor);
		
	}
	
	@Override
	public DoctorDto getDoctorById(Long id) {
		
		Doctor doctor = doctorRepository.findById(id).orElseThrow(()->new RuntimeException("doctor does not exist "));
		return DoctorMapping.mapToDoctorDto(doctor);
	}



	

}

