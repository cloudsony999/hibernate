package com.example;

import org.hibernate.Session;

import com.example.config.HibernateUtil;
import com.example.entity.Person;

public class AppSelect {
	public static void main(String[] args) {

		Session session = HibernateUtil.makeSession();
		System.out.println("got a session " + session);

		// using get
		Person pp = (Person) session.get(Person.class, 101);
		// System.out.println("the person is using Get " + pp.getName() + " " +
		// pp.getEmail());
		if (pp == null)
			System.out.println("getting a null actually!!!!");

		// using load
		Person pp2 = (Person) session.get(Person.class, 100);
		System.out.println("the person is using Load " + pp2.getName() + " " + pp2.getEmail());

		session.close();
		System.out.println("--------------object saved using hibernate--------------------");

	}
}
