package com.techlab.organization.dataacess;

import java.util.Set;

import com.techlab.organization.business.Employee;

public interface IDataLoader {
	
	public Set<Employee> readData();

}
