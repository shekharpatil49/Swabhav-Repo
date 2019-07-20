package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.Action;
import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;

public class PassbookAction implements SessionAware,Action{

	private List<Customer> customer = new ArrayList(); 
	SessionMap<String,Object> sessionMap;


	@Override
	public void setSession(Map<String, Object> session) {
		
		 sessionMap=(SessionMap)session;
		
	}
	@Override
	public String execute() throws Exception {
		
		if(sessionMap.get("User")!=null) {
			CustomerService.getInstance().getPassbookdetails(sessionMap.get("User").)
		}

		return this.SUCCESS;
	}

}
