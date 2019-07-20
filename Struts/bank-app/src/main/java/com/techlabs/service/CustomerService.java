package com.techlabs.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Customer;
import com.techlabs.repository.CustomerRepository;

public class CustomerService {
	
	private CustomerRepository cr;
	
	private static CustomerService  instance;
	
	private CustomerService () {
		
		cr = new CustomerRepository();
		
	}
	public static CustomerService  getInstance() {
		if (instance == null) {
			instance = new CustomerService ();
		}
		return instance;
	}
	public boolean addCustomer(Customer customer) throws SQLException  {
		
		return cr.addCustomerToDB(customer);
		
		
	}
	public Customer getPassword(String username) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return cr.getCustomer(username);
	}
	public void doTransaction(String name,String amount,String transaction) throws SQLException {
		cr.doTransaction(name,amount,transaction);
		
	}
	

}
