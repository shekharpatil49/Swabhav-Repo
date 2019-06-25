package com.techlab.controller;

import java.io.IOException;

import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlab.model.CardType;
import com.techlab.model.Customer;
import com.techlab.service.CustomerService;

/**
 * Servlet implementation class AddController
 */
@WebServlet("/addCustomer")
public class AddCustomerController extends HttpServlet {

	private CardType card;
	private Customer customer;

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCustomerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 RequestDispatcher view = request.getRequestDispatcher("addCustomer.jsp") ;
		 
		 view.forward(request, response);

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id ="";
	
		
	       if(request.getAttribute("ID")==null) {
	    	  id = UUID.randomUUID().toString(); 
	       }else {
	    	   id = request.getAttribute("ID").toString();
	       }
			
			System.out.println(id);
			String firstName = request.getParameter("firstName").toString();
			System.out.println(firstName);
			String lastName = request.getParameter("lastName").toString();
			if (request.getParameter("myradio").toString().equals("CREDIT")) {
				;
				card = card.CREDIT;
			}
			if (request.getParameter("myradio").toString().equals("DEBIT")) {
				;
				card = card.CREDIT;
			}
			String dob = request.getParameter("dob").toString();

			double balance = Double.parseDouble(request.getParameter("balance"));
			List<Customer> l = CustomerService.getInstance().getCustomerList();
			for (Customer c : l) {
				if (c.getId() == id) {
					c.setFirstName(firstName);
					c.setLastName(lastName);
					c.setDob(dob);
					c.setBalance(balance);
					c.setCard(card);
					response.sendRedirect("CustomerController");
					return;
				}

			}

			customer = new Customer(id, firstName, lastName, dob, balance, card);
			CustomerService.getInstance().addCustomerToList(customer);

			response.sendRedirect("CustomerController");
		}

	

}
