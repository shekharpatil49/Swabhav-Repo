package com.techlabs.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.ContactService;

public class DeleteAction implements Action {
	
	
	private String id;
	
	
	
	public DeleteAction() {
		
		
	}

	@Override
	public String execute() throws Exception {
		//String id = ServletActionContext.getRequest().getParameter("id");
		ContactService.getInstance().deleteFromList(this.id);
		return this.SUCCESS;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	
	

}
