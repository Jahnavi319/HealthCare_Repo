package com.wipro.healthcare_hospital_management.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admin")
public class Admin {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "adminname")
	private String adminname;
	
	@Column(name = "speciality")
	private String speciality;
	
	@Column(name = "Experience")
	private int Experience;
	
	@Column(name = "qualification")
	private String qalification;
	
	@Column(name = "designation")
	private String designation;
	
	@OneToMany(mappedBy = "admin")
    private Set<Doctor> doctors = new HashSet<>();

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int id, String adminname, String speciality, int experience, String qalification, String designation) {
		super();
		this.id = id;
		this.adminname = adminname;
		this.speciality = speciality;
		Experience = experience;
		this.qalification = qalification;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	public String getQalification() {
		return qalification;
	}
	public void setQalification(String qalification) {
		this.qalification = qalification;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
