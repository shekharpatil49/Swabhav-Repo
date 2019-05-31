package com.techlab.organization.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.techlab.organization.business.Employee;
import com.techlab.organization.dataacess.IDataLoader;

public class HierarchyBuilder {

	private IDataLoader load;
	int i = 1;

	Set<Employee> data;
	ArrayList<Employee> list= new ArrayList();

	public Set<Employee> getData() {
		return data;
	}

	public HierarchyBuilder(IDataLoader load) {

		data = load.readData();

	}

	public void buildHierarchy() {

		for (Employee emp : data) {
			list.add(emp);
		}
	
		
		

	}
}
