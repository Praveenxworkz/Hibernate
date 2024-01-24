package com.xworkz.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.Address;
import com.xworkz.entity.Certificate;
import com.xworkz.entity.StudentEntity;

public class StudentDAOImpl implements StudentDAO{

	@Override
	public void saveStudent() {
	
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Certificate certi = new Certificate("React js","2 months");
		StudentEntity student = new StudentEntity(3, "Kishore", 25,"web developer",certi);
	//	session.save(student);
		
		Address address = new Address();
		address.setAddressId(3);
		address.setPlace("Bengaluru");
		address.setPincode(560019);
		address.setAddedDate(new Date());
		address.setX(1234.23);
	//	session.save(address);
		
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void getStudent(int studentID) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		StudentEntity studentEntity = session.get(StudentEntity.class,studentID);
		System.out.println(studentEntity);
		session.close();
	}

	@Override
	public void getAddress(int addressId) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Address address = session.load(Address.class, addressId);
		System.out.println(address);
		session.close();
		
	}

	@Override
	public void updateStudent(int studentID) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		StudentEntity studentEntity = session.get(StudentEntity.class, studentID);
		Certificate certificate = new Certificate("Data science","3 months");
		studentEntity.setCertificate(certificate);
		session.update(studentEntity);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void deleteStudent(int studentID) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(studentID);
		session.getTransaction().commit();
		session.close();
	}
	
}
