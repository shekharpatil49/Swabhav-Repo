package com.techlab.composite.test;

import com.techlab.composite.Employee;

public class TestCompositePattern {

	public static void main(String[] args) {

		Employee CEO = new Employee("Shekhar", "CEO", 30000);

		Employee headSales = new Employee("ABC", "Head Sales", 20000);

		Employee headMarketing = new Employee("RAM", "Head Marketing", 20000);

		Employee clerk = new Employee("SHYAM", "Marketing", 10000);

		Employee salesExecutive = new Employee("PQR", "Sales", 10000);

		CEO.add(headSales);
		CEO.add(headMarketing);
		headSales.add(salesExecutive);
		headMarketing.add(clerk);

		System.out.println(CEO);

		for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);

			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}

}
