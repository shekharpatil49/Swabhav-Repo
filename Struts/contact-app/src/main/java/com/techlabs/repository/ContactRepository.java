package com.techlabs.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlabs.model.Contact;

public class ContactRepository {

	private List<Contact> contact = new ArrayList<Contact>();

	public ContactRepository() {

		Contact c1 = new Contact("101", "Ram", "7666666125", "ram@gmail.com");
		Contact c2 = new Contact("102", "Sham", "7506034344", "sham@gmail.com");
		Contact c3 = new Contact("103", "John", "8286554555", "john@gmail.com");
		contact.add(c1);
		contact.add(c2);
		contact.add(c3);

	}

	public void loadData() {

	}

	public void addData(Contact c) {
		contact.add(c);
	}

	public List getData() {
		return this.contact;
	}

	public void removeFromList(String id) {
		
	for(Iterator<Contact> iterator = contact.iterator();iterator.hasNext(); ) {
			
			Contact c = iterator.next();
			if(c.getId().equals(id)) {
				iterator.remove();
			}
				
		}


	}

	public Contact getObject(String id) {
		
	for(Iterator<Contact> iterator = contact.iterator();iterator.hasNext(); ) {
			
			Contact c = iterator.next();
			if(c.getId().equals(id)) {
				return c;
			}
				
		}
	return null;	
		
	}

	public void update(Contact c,String id) {
		
	for(Iterator<Contact> iterator = contact.iterator();iterator.hasNext(); ) {
			
			Contact cont = iterator.next();
			if(cont.getId().equals(id)) {
				cont.setName(c.getName());
				cont.setNumber(c.getNumber());
				cont.setEmail(c.getEmail());
			}
				
		}
		
		
		
	}

}
