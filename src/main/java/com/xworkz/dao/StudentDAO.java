package com.xworkz.dao;

public interface StudentDAO {

	public void saveStudent();
	public void getStudent(int studentID);
	public void getAddress(int addressId);
	public void updateStudent(int studentID);
	public void deleteStudent(int studentID);
	
}
