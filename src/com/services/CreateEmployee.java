package com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory ef = Persistence.createEntityManagerFactory("JPA_PRO");// provide the persistent unit name
																					// here
		EntityManager em = ef.createEntityManager(); //create entity manager
		em.getTransaction().begin();
		Employee e = new Employee();
		e.setId(20);
		e.setName("emp2");
		e.setDepartment("safety");
		e.setSalary(35000);
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Employee data saved");
		em.close();
		ef.close();
	}

}
