package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.config.HibernateUtil;
import com.example.entity.Person;

public class App {
	public static void main(String[] args) {

		Session session = HibernateUtil.makeSession();
		System.out.println("got a session " + session);

		Person p1 = new Person();
		p1.setId(100);
		p1.setName("amitava");
		p1.setEmail("a@gmail.com");
		Transaction tr = session.beginTransaction();
		session.save(p1);
		tr.commit();
		session.close();
		System.out.println("--------------object saved using hibernate--------------------");

	}
}
