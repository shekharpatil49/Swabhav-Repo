package com.techlabs.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;

public class RegisterAction extends ActionSupport {

	private String name;
	private String password;
	private String confirmPassword;
	private double balance;
	private boolean queryFlag;

	public RegisterAction() {

	}

	@Override
	public void validate() {

		if (this.name != null || this.password != null || this.confirmPassword != null || this.balance != 0) {
			try {
				if (this.name.trim().equals("")) {
					addActionError("All fields are required");
					return;
				}
				if (this.balance == 0) {
					addActionError(this.name);
					addActionError("All fields are required");
					return;
				}
				if (this.password.equals(confirmPassword) || !this.name.equals("") || this.balance != 0) {
					this.queryFlag = CustomerService.getInstance()
							.addCustomer(new Customer(this.name, this.password, this.balance));
				
				} else {
					addActionError(this.name);
					addFieldError("password", "password does not match");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public String execute() {

		return this.SUCCESS;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public double getBalance() {
		return balance;
	}
}
