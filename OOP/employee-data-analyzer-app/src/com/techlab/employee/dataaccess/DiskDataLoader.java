package com.techlab.employee.dataaccess;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import com.techlab.employee.business.Employee;

public class DiskDataLoader implements IDataLoader {

	int empID = 0;
	int empName = 1;
	int designation = 2;
	int maganerID = 3;
	int dateOfJoining = 4;
	int salary = 5;
	int commission = 6;
	int departmentNumber = 7;
	String csvFile = "/Users/shekhar/Desktop/dataFile.txt";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
	Set<Employee> data = new TreeSet();

	@Override
	public Set<Employee> readData() {

		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
                
				line = line.replaceAll("\\s+", "").replaceAll("'", "");
	            String[] values = line.split(cvsSplitBy);
				Employee emp1 = new Employee(Integer.parseInt(values[empID]), 
						values[empName], values[designation],
						values[maganerID], values[dateOfJoining], 
						Integer.parseInt(values[salary]), values[commission],
						Integer.parseInt(values[departmentNumber]));
				data.add(emp1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

}
