package com.techlab.organization.dataacess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import com.techlab.organization.business.Employee;

public class DiskDataLoader implements IDataLoader{
	
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
	int mng=1;
	int slm=1;
	int als=1;
	int clr=1;
	Employee CEO ;
	Employee manager[] = new Employee[10];
	Employee salesman[]= new Employee[10];
	Employee clerk[] = new Employee[10] ;
	Employee analyst[]= new Employee[10];
	ArrayList<Employee> list= new ArrayList();
	
	
	public ArrayList<Employee> getList() {
		return list;
	}


	public void setList(ArrayList<Employee> list) {
		this.list = list;
	}


	public Set<Employee> getData() {
		return data;
	}


	public Set<Employee> readData() {

		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
                
				line = line.replaceAll("\\s+", "").replaceAll("'", "");
	            String[] values = line.split(cvsSplitBy);
	            if(values[maganerID].equalsIgnoreCase("NULL")) {
	            	CEO = new Employee(Integer.parseInt(values[empID]), 
							values[empName], values[designation],
							values[maganerID], values[dateOfJoining], 
							Integer.parseInt(values[salary]), values[commission],
							Integer.parseInt(values[departmentNumber]));
	            	data.add(CEO); 
	            	
	            }
	            if(values[designation].equalsIgnoreCase("manager")) {
	            	manager[mng++] = new Employee(Integer.parseInt(values[empID]), 
							values[empName], values[designation],
							values[maganerID], values[dateOfJoining], 
							Integer.parseInt(values[salary]), values[commission],
							Integer.parseInt(values[departmentNumber]));
	            	data.add(manager[mng-1]); 
	            	
	            }
	            if(values[designation].equalsIgnoreCase("salesman")) {
	            	salesman[slm++] = new Employee(Integer.parseInt(values[empID]), 
							values[empName], values[designation],
							values[maganerID], values[dateOfJoining], 
							Integer.parseInt(values[salary]), values[commission],
							Integer.parseInt(values[departmentNumber]));
	            	data.add(salesman[slm-1]); 
	            }
	            if(values[designation].equalsIgnoreCase("clerk")) {
	            	clerk[clr++] = new Employee(Integer.parseInt(values[empID]), 
							values[empName], values[designation],
							values[maganerID], values[dateOfJoining], 
							Integer.parseInt(values[salary]), values[commission],
							Integer.parseInt(values[departmentNumber]));
	            	data.add(clerk[clr-1]);
	            }
	            if(values[designation].equalsIgnoreCase("analyst")) {
	            	analyst[als++] = new Employee(Integer.parseInt(values[empID]), 
							values[empName], values[designation],
							values[maganerID], values[dateOfJoining], 
							Integer.parseInt(values[salary]), values[commission],
							Integer.parseInt(values[departmentNumber]));
	            	data.add(analyst[als-1]);
	            }  
	            
				
			}
		} catch (Exception e) {
			
		}
		for(Employee emp:data) {
			if(emp.getMaganerID().equalsIgnoreCase("null")) {
				continue;
			}
			else if(CEO.getEmpID()==Integer.parseInt(emp.getMaganerID())){
				emp.setLevel(1);
				list.add(emp);
				
			}
			}
		
		return data;
	}


}
