package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstDemo {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();//configuration object
		cfg.configure("hibernate.cfg.xml");
		
		//it is an interface
		SessionFactory sf = cfg.buildSessionFactory();  //session factory gather all the facts
		Session s = sf.openSession(); //start
		Transaction t = s.beginTransaction();
		
		Student stud = new Student();
		stud.setId(1003);
		stud.setSname("Neha");
		stud.setSaddress("Mumbai");
		
		
		
		s.save(stud);
		
		t.commit();                   //end transaction
		s.close();                    //close session

	}

}
