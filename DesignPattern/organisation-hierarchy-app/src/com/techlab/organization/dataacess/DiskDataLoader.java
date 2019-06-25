package com.techlab.organization.dataacess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
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
	private Employee CEO ;
	private Employee manager[] = new Employee[10];
	private Employee salesman[]= new Employee[10];
	private Employee clerk[] = new Employee[10] ;
	private Employee analyst[]= new Employee[10];
	private ArrayList<Employee> list= new ArrayList();
	private ArrayList<Employee> list2= new ArrayList();
	private ArrayList<Employee> list4 = new ArrayList();
	private ArrayList<Employee> level2Employee = new ArrayList();
	private ArrayList<Employee> level3Employee = new ArrayList();
	private ArrayList<Employee> level1Employee = new ArrayList();
	private ArrayList<Employee>[] list3 = new ArrayList[10];
	private ArrayList<Employee> list5 = new ArrayList();
	
	public ArrayList<Employee>[] getList3() {
		return list3;
	}
	public ArrayList<Employee> getList() {
		return list;
	}
	public ArrayList<Employee> getlevel1Employee() {
		level1Employee.remove(0);
		return level1Employee;
	}
	public ArrayList<Employee> getlevel2Employee() {
		level2Employee.remove(0);
		return level2Employee;
	}
	public ArrayList<Employee> getlevel3Employee() {
		level3Employee.remove(0);
		return level3Employee;
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
		for (int x = 0; x < list3.length; x++) {
            list3[x] = new ArrayList<>();
        }
		
		
		for(Employee emp:data) {
			list2.add(emp);
		}
		for(Employee emp:data) {
			if(emp.getMaganerID().equalsIgnoreCase("null")) {
				continue;
			}
			else if(CEO.getEmpID()==Integer.parseInt(emp.getMaganerID())){
				emp.setLevel(1);
				list.add(emp);
				
			}list.add(null);
			}
		  int k=0; 
		for (int counter1 = 0; counter1 < list.size(); counter1++) { 	
			for (int counter2 = 0; counter2 < list2.size(); counter2++) { 
				if(list2.get(counter2).getMaganerID().equalsIgnoreCase("null")) {
					continue;
				}
				if(list.get(counter1)==null) {
					continue;
				}
				if(list.get(counter1).getEmpID()==
						Integer.parseInt(list2.get(counter2).getMaganerID())) {
					
					list2.get(counter2).setLevel(2);
					list3[k].add(list2.get(counter2));
				}
			}
			k++;
	         		
	      }   	
		
		for(int counter=0;counter<list3.length;counter++) {
			for (int counter1 = 0; counter1 < list3[counter].size(); counter1++) {
				list4.add(list3[counter].get(counter1));		
			}
			list4.add(null);
		}
		int counter4=0;
		while(counter4<list4.size()) {
			if(counter4+1<list4.size()) {
			if(list4.get(counter4)!=list4.get(counter4+1)) {
				level2Employee.add(list4.get(counter4));
			}
			
			}
			counter4++;
		}
		for(int counter=0;counter<list4.size();counter++) {
			for (int counter1 = 0; counter1 < list2.size(); counter1++) {
				
				if(list2.get(counter1).getMaganerID().equalsIgnoreCase("null")) {
					continue;
				}
				if(list4.get(counter)==null) {
					continue;
				}
				if(list4.get(counter).getEmpID()==
						Integer.parseInt(list2.get(counter1).getMaganerID())) {
					list2.get(counter1).setLevel(3);
					list5.add(list2.get(counter1));
				}
					
			}
			list5.add(null);
		}
		counter4=0;
		while(counter4<list5.size()) {
			if(counter4+1<list5.size()) {
			if(list5.get(counter4)!=list5.get(counter4+1)) {
				level3Employee.add(list5.get(counter4));
			}
			
			}
			counter4++;
		}
		counter4=0;
		while(counter4<list.size()) {
			if(counter4+1<list.size()) {
			if(list.get(counter4)!=list.get(counter4+1)) {
				level1Employee.add(list.get(counter4));
			}
			
			}
			counter4++;
		}
	
		
		
		return data;
	}


}
