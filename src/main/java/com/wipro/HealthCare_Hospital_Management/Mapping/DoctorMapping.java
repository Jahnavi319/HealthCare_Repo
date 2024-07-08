package com.wipro.HealthCare_Hospital_Management.Mapping;

import com.wipro.HealthCare_Hospital_Management.dto.DoctorDto;

import com.wipro.HealthCare_Hospital_Management.entity.Doctor;

public class DoctorMapping {
	
	public static Doctor mapToDoctor(DoctorDto doctorDto) {
		
		Doctor doctor = new Doctor();
		
		
		doctor.setDoctorName(doctorDto.getDoctorName());
		doctor.setEmail(doctorDto.getEmail());
		doctor.setPhoneNumber(doctorDto.getPhoneNumber());
		doctor.setYearsOfExperience(doctorDto.getYearsOfExperience());
		doctor.setSpecialization(doctorDto.getSpecialization());
		
		
		return doctor;
		
	}
	
	public static DoctorDto mapToDoctorDto(Doctor doctor) {
		
		DoctorDto doctorDto = new DoctorDto();
		
		doctorDto.setDoctorName(doctor.getDoctorName());
		doctorDto.setEmail(doctor.getEmail());
		doctorDto.setPhoneNumber(doctor.getPhoneNumber());
		doctorDto.setSpecialization(doctor.getSpecialization());
		doctorDto.setYearsOfExperience(doctor.getYearsOfExperience());
		
		return doctorDto;
		
	}

}
