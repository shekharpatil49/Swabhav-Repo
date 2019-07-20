package com.techlbas.entity.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.entity.Department;
import com.techlabs.entity.Employee;

public class TestEnitity {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory.getClass());
		Session session = factory.openSession();
		
		Transaction tran = session.beginTransaction();
		
		Set<Employee> emp = new HashSet<Employee>();
		
		try {
			Department dept = new Department("Cash Management");
			Employee e = new Employee("Shekhar");
			e.setDept(dept);
			emp.add(e);
			dept.setEmp(emp);
			session.save(dept);
			tran.commit();
		}catch(Exception e) {
			tran.rollback();
			
		}finally {
			session.close();
		}
		
		
		
		
		
	}

}
