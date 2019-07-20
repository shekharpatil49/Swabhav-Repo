package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;

public class HomeAction implements SessionAware,Action{
	
	SessionMap<String,Object> sessionMap;
	private Customer customer;
	
	public HomeAction() {
		
	}

	@Override
	public void setSession(Map<String, Object> session) {
		
		sessionMap=(SessionMap)session;
		
		System.out.println(session.get("User"));
		System.out.println(session.get("balance"));
	
	}

	@Override
	public String execute() throws Exception {
		
		if(sessionMap.get("User")!=null) {
			customer=CustomerService.getInstance().getPassword(sessionMap.get("User").toString());
			sessionMap.put("User", customer.getName());
			sessionMap.put("balance", customer.getBalance());
		}
		
		return this.SUCCESS;
	}

	
}
