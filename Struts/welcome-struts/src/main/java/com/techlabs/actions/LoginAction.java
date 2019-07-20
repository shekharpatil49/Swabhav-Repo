package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String username;

	private String password;
	
	private String message;

	public LoginAction() {

	}

	public void validate() {
		
        if(this.username!=null && this.password!=null) {
        	if(this.username.equals("")) {
        		addFieldError("username", "username required");
        	}
        	if(this.password.equals("")) {
        		addFieldError("password", "password required");
        	}
        	if (this.username.equals("") || this.password.equals("") ) {
    			addActionError("username");
    			return;
    		}
        
    		if (this.username.equals(this.password)) {
    			System.out.println("Log In Success");
    			this.message="Welcome "+ this.username;
    			return  ;
    		}
    		this.message ="Login Failed";
        	
        }
	
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
 
	public String execute() {
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	public String getMessage() {
		return this.message;
	}

}
