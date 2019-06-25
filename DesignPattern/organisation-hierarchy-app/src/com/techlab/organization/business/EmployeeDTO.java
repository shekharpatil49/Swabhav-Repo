package com.techlab.organization.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.techlab.organization.dataacess.DiskDataLoader;
import com.techlab.organization.dataacess.IDataLoader;

public class EmployeeDTO {
	
	private HashMap<Employee,List<Employee>> map = new HashMap<Employee,List<Employee>>();
	private List<Employee> reporties = new ArrayList<Employee>();
	private Set<Employee> data;
	private List<Employee> dataList=new ArrayList();
	public EmployeeDTO(DiskDataLoader dsk) {
		
		data=dsk.readData();
	}
    public void createMap() {
    	for(Employee emp:data) {
    		dataList.add(emp);
    	}
    	
    	for(int i=0;i<dataList.size();i++) {
    		for(int j=0;j<dataList.size();j++) {
    			if(dataList.get(j).getMaganerID().equalsIgnoreCase("null")){
    				continue;
    			}
    			if(dataList.get(i).getEmpID()==Integer.parseInt(dataList.get(j).getMaganerID())) {
    				reporties.add(dataList.get(j));
    			}
    		}
    		
    		//map.put(dataList.get(i).getEmpID(),reporties);
    		if(!reporties.isEmpty()) {
    			map.put(dataList.get(i), reporties=new ArrayList<Employee>());
    		}
    		//System.out.println(reporties);
    		for(Employee emp:reporties) {
    			System.out.print(emp.getEmpName()+" ");
    		}
    		System.out.println("");
    		reporties.clear();
    		}
    	displayMap();
    	}
    	
    
       public void displayMap() {
    	   for (Map.Entry<Employee, List<Employee>> entry : map.entrySet()) {
    		     System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    		}
    }
   
	

}	
