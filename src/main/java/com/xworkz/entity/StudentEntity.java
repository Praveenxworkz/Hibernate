package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student_details")
public class StudentEntity {

	@Id
	@Column(name = "ID")
	private int studentID;
	@Column(name = "NAME")
	private String name;
	@Column(name = "AGE")
	private int age;
	@Column(name = "JOB")
	private String job;
	
	private Certificate certificate ;
	
	public StudentEntity() {
		System.out.println("student object is created");
	}

	public StudentEntity(int studentID, String name, int age, String job, Certificate certificate) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		this.job = job;
		this.certificate = certificate;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "StudentEntity [studentID=" + studentID + ", name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
}
