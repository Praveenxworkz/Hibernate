package com.xworkz.entity;

import com.xworkz.dao.StudentDAOImpl;

public class Tester {

	public static void main(String[] args) {
		
		StudentDAOImpl sdi = new StudentDAOImpl();
//		sdi.saveStudent();
		sdi.getStudent(2);
		sdi.getAddress(2);
		sdi.updateStudent(2);
//		sdi.deleteStudent(4); 
	}
	
}
