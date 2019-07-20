package com.techlabs.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;

public class LoginAction extends ActionSupport implements SessionAware{
	private String username;
	private Customer customer;
	private SessionMap<String,Object> sessionMap;
	


	private String password;

	
	
	public LoginAction() {
		
	}
	
	
	public void validate() {
		if(this.username!=null && this.password!=null) {
			
			try {
				customer=CustomerService.getInstance().getPassword(this.username);
				if(customer.getPassword()==null) {
					addActionError("No User Found");
					return;
				}
				if(!customer.getPassword().equals(this.password)) {
				    addActionError("Wrong password ");
				   return;
				}
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			sessionMap.put("object",customer);
			sessionMap.put("User", customer.getName());
			sessionMap.put("balance", customer.getBalance());
			
		}
		
	}

	@Override
	public void setSession(Map<String, Object> session) {
		
		 sessionMap=(SessionMap)session;	
		
	}
	
	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String execute() {
		
			return this.SUCCESS;	
	
	}
	public String getUsername() {
		return username;
	}
	
	

}
