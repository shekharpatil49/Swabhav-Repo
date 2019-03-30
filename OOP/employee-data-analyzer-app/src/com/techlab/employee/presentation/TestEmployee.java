package com.techlab.employee.presentation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.techlab.employee.business.Employee;
import com.techlab.employee.dataaccess.DiskDataLoader;
import com.techlab.employee.dataaccess.IDataLoader;
import com.techlab.employee.dataaccess.WebDataLoader;
import com.techlab.employee.service.EmployeeReportService;

public class TestEmployee {

	public static void main(String args[]) {
		
		EmployeeReportService service = new EmployeeReportService(new DiskDataLoader());
		Employee emp1 = service.maximumSalaryEmployee();
		System.out.println(service.getDesignationWiseCount());
		System.out.println(emp1.getEmpName() + " with Salary " + emp1.getSalary());
		System.out.println(service.getDepartmentWiseCount());

	}
	
		
	}

