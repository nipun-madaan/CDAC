package com.cdac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure(); 
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Student s = new Student("Abhijeet","abhijeet123@gmail.com","879546321");
		session.save(s);
		t.commit();
		session.close();
		
	}
}
