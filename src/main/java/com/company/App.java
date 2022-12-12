package com.company;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.company.models.Person;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().addAnnotatedClass(Person.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {	
		session.beginTransaction();
		Person person = session.get(Person.class, 1);
		System.out.println(person.getName() + " " + person.getAge());
		session.getTransaction().commit();
		}finally {
			sessionFactory.close();
		}
		
	}

}
