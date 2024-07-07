package com.wipro.HealthCare_Hospital_Management.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "medical_records")
public class MedicalRecord {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String patientName;
    private int age;
    private String diagnosis;
    private String treatment;
    private Date dateOfRecord;
    
 /*   @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patientId",referencedColumnName = "id")
    private Patient patient;
    
    @OneToMany(mappedBy = "medicalRecord",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Treatment> treatments;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctorId")
    private Doctor doctor;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "medical_record_medication",joinColumns = @JoinColumn(name ="medical_record_id"),inverseJoinColumns = @JoinColumn(name = "medication_id"))
    private List<Medication> medications;*/
    
    
    // Constructors
    public MedicalRecord() {
    }

    public MedicalRecord(Long id, String patientName, Date dateOfBirth, String diagnosis, String treatment, Date dateOfRecord, int age) {
    	this.id = id;
        this.patientName = patientName;
        this.age = age;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.dateOfRecord = dateOfRecord;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public Date getDateOfRecord() {
        return dateOfRecord;
    }

    public void setDateOfRecord(Date dateOfRecord) {
        this.dateOfRecord = dateOfRecord;
    }	
	


}
