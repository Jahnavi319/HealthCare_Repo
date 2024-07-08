package com.wipro.healthcare_hospital_management.service;

import org.springframework.stereotype.Service;

import com.wipro.healthcare_hospital_management.dto.AppointmentDto;
import com.wipro.healthcare_hospital_management.dto.DoctorDto;
import com.wipro.healthcare_hospital_management.entity.Appointment;
import com.wipro.healthcare_hospital_management.entity.Doctor;
import com.wipro.healthcare_hospital_management.mapping.AppointmentMapping;
import com.wipro.healthcare_hospital_management.mapping.DoctorMapping;
import com.wipro.healthcare_hospital_management.repository.DoctorRepository;


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
		//System.out.println("++++++++++++++++++++++++++++++++++++++"+doctor);
		Doctor savedDoctor = doctorRepository.save(doctor);
		return DoctorMapping.mapToDoctorDto(savedDoctor);
		
	}
	
	@Override
	public DoctorDto getDoctorById(Long id) {
		
		Doctor doctor = doctorRepository.findById(id).orElseThrow(()->new RuntimeException("doctor does not exist "));
		return DoctorMapping.mapToDoctorDto(doctor);
	}


	@Override
	public DoctorDto updateDoctor(Long id, DoctorDto doctorDto) {
		Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor does not exist"));
        Doctor updatedDoctor = doctorRepository.save(doctor);
        return DoctorMapping.mapToDoctorDto(updatedDoctor);
    }
	
	@Override
	public void deleteDoctor(Long id) {
		if (!doctorRepository.existsById(id)) {
            throw new RuntimeException("Doctor does not exist");
        }
        doctorRepository.deleteById(id);
		
	}


	

}

