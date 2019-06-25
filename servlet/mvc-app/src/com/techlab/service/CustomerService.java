package com.techlab.service;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.CardType;
import com.techlab.model.Customer;

public class CustomerService {

	private static CustomerService instance;
	private Customer customer1, customer2, customer3;
	private CardType card;
	private List<Customer> customerlist = new ArrayList();

	private CustomerService() {
		customer1 = new Customer("1", "Ram", "Patil", "31/07/1995", 2000, card.DEBIT);
		customer2 = new Customer("2", "Sham", "Patil", "31/07/1995", 2000, card.CREDIT);
		customer3 = new Customer("3", "John", "Cena", "31/07/1995", 2000, card.DEBIT);
		customerlist.add(customer1);
		customerlist.add(customer2);
		customerlist.add(customer3);
	}

	public static CustomerService getInstance() {
		if (instance == null) {
			instance = new CustomerService();
		}
		return instance;
	}

	public void addCustomerToList(Customer customer) {

		customerlist.add(customer);

	}
	public void removeCustomerFromList(String id) {
		
		for(Customer obj : customerlist) {
			if(obj.getId().equals(id)) {
				customerlist.remove(obj);
				return;
			}
		}
		
	}

	public List getCustomerList() {
		return customerlist;
	}

	public Customer getCustomerObject(String id) {
		
		for(Customer obj : customerlist) {
			if(id.equals(obj.getId())) {
				return obj;
			}
		}
		return null;
		// TODO Auto-generated method stub
		
	}

}
