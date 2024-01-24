package com.xworkz.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.Address;
import com.xworkz.entity.StudentEntity;

public class HibernateUtil {

	private static SessionFactory sessionFactory = null ;
	
	public static SessionFactory getSessionFactory() {
		
		if (sessionFactory == null) {
			Configuration con = new Configuration();
	    	con.configure();
	    	con.addAnnotatedClass(StudentEntity.class);
	    	con.addAnnotatedClass(Address.class);
	        sessionFactory = con.buildSessionFactory();
		}  
		return sessionFactory;
	}
	
}
