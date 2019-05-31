package com.techlab.organization.presenetation;

import java.util.HashMap;
import java.util.Map;

import com.techlab.organization.business.Employee;
import com.techlab.organization.dataacess.DiskDataLoader;
import com.techlab.organization.service.HierarchyBuilder;

public class TestEmployee {
	
public static void main(String args[]) {
	DiskDataLoader dsk=new DiskDataLoader();
		HierarchyBuilder service = new HierarchyBuilder(dsk);
		
		
		service.buildHierarchy();
		
		for(Employee emp :dsk.getList()) {
			System.out.println(emp.getEmpName());
			
		}
        
	}

}
