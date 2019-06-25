package com.techlab.organization.presenetation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import com.techlab.organization.business.Employee;
import com.techlab.organization.business.EmployeeDTO;
import com.techlab.organization.dataacess.DiskDataLoader;
import com.techlab.organization.service.HierarchyBuilder;

public class TestEmployee {
	
public static void main(String args[]) throws ParserConfigurationException, TransformerException {
	    DiskDataLoader dsk=new DiskDataLoader();
		HierarchyBuilder service = new HierarchyBuilder(dsk);
		//EmployeeDTO empDTO= new EmployeeDTO(dsk) ;
		 //empDTO.createMap();
		// empDTO.displayMap();
		service.buildHierarchy();
		//System.out.println(service.returnHierarchy());
	    
		}
        
	}

