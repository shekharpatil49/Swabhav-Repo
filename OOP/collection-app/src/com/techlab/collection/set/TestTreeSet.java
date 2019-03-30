package com.techlab.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {

		Set set = new TreeSet();
		Student s1 = new Student(1,9,"A","B");
		Student s2 = new Student(2,9,"A","B");
		Student s3 = new Student(3,9,"A","B");
	    set.add(s1);
	    set.add(s2);
	    set.add(s3);
	    System.out.println(set.size());
	 
		
	}

}
