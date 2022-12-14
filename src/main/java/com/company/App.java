package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.company.models.Item;
import com.company.models.Person;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {	
		session.beginTransaction();
		
// get List<Item> of person	
//		
//		Person person = session.get(Person.class, 3);
//		List<Item> items = person.getItems();
//		System.out.println(items);
		
// get owner of item
//		
//		Item item = session.get(Item.class, 2);
//		Person person = item.getOwner();
//		System.out.println(person);
		
// Add new person with new item
//	
//	    Person person = new Person("Sasha",24);
//	    Item item = new Item("MacBook",person);
//	    person.setItems(new ArrayList<>(Collections.singletonList(item)));
//	    session.save(person);
//	    session.save(item);
		
// Remove all items of person
//		
//		Person person = session.get(Person.class,3);
//		List<Item> items = person.getItems();
//		for(Item item : items)
//			session.remove(item);
//		person.getItems().clear();
		
// Remove person
//		
//		Person person = session.get(Person.class,2);
//		session.remove(person);
//		person.getItems().forEach(x->x.setOwner(null));
		
// change owner of item
//		
//		Person person = session.get(Person.class, 1);
//		Item item = session.get(Item.class,7);
//		item.getOwner().getItems().remove(item);
//		item.setOwner(person);
//		person.getItems().add(item);
	
		
		session.getTransaction().commit();
		}finally {
			sessionFactory.close();
		}
		
	}

}
