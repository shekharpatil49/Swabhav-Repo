package com.techlab.sorttreeset.emplyee;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		 int nameComp = emp1.getFirstName().compareTo(emp2.getFirstName());
		    return ((nameComp == 0) ? 
		    		emp1.getLastName().compareTo(emp2.getLastName()) : nameComp);
	}

	

}
