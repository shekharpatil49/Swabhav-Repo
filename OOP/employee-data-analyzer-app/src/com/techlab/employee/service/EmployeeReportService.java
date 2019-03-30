package com.techlab.employee.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.techlab.employee.business.Employee;
import com.techlab.employee.dataaccess.IDataLoader;

public class EmployeeReportService {
	private IDataLoader load;
	Employee emp = new Employee();
	Set<Employee> data;
	public EmployeeReportService(IDataLoader load) {
      
		data=load.readData();
		
	}

	public Employee maximumSalaryEmployee() {
		int max = 0;
		Employee temp = null;
		for (Employee emp : data) {
			if (emp.getSalary() > max) {
				max = emp.getSalary();
				temp = emp;
			}
		}
		return temp;

	}

	public Map<String, Integer> getDesignationWiseCount() {
		String type = " ";
		Map<String, Integer> d = new HashMap<>();
		for (Employee emp : data) {
			if (d.containsKey(emp.getDesignation())) {
				d.put(emp.getDesignation(), d.get(emp.getDesignation()) + 1);
			} else {
				d.put(emp.getDesignation(), 1);
			}

		}
		return d;

	}

	public Map<Integer, Integer> getDepartmentWiseCount() {
		String type = " ";
		Map<Integer, Integer> dCount = new HashMap<>();
		for (Employee emp : data) {
			if (dCount.containsKey(emp.getDepartmentNumber())) {
				dCount.put(emp.getDepartmentNumber(), 
						dCount.get(emp.getDepartmentNumber()) + 1);
			} else {
				dCount.put(emp.getDepartmentNumber(), 1);
			}
		}
		return dCount;

	}

}
