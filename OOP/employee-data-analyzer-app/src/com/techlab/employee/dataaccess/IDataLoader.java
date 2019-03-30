package com.techlab.employee.dataaccess;

import java.io.FileNotFoundException;
import java.util.Set;

import com.techlab.employee.business.Employee;

public interface IDataLoader {

	public Set<Employee> readData();
}
