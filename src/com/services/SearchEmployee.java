package com.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Employee;

public class SearchEmployee {
	public static void main(String[] args) {

		EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA_PRO");
		EntityManager emg = fac.createEntityManager();
		emg.getTransaction().begin();
		Employee e = new Employee();
		e = emg.find(Employee.class, 10);
		System.out.println("Employee found--");
		System.out.println("Emp_id : " + e.getId());
		System.out.println("Emp_name : " + e.getName());
		System.out.println("Emp_dept : " + e.getDepartment());
		System.out.println("Emp_salry : " + e.getSalary());
		emg.close();
		fac.close();
	}
}
