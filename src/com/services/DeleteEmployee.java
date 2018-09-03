package com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Employee;

public class DeleteEmployee {
	public static void main(String[] args) {

		EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA_PRO");
		EntityManager emg = fac.createEntityManager();
		emg.getTransaction().begin();
		Employee e = new Employee();
		e = emg.find(Employee.class, 10);
		System.out.println("Employee found--" + e.getId());
		emg.remove(e);
		emg.getTransaction().commit();
		emg.close();
		fac.close();
	}
}
