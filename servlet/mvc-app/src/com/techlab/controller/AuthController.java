package com.techlab.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AuthController
 */
@WebServlet("/auth")
public class AuthController extends HttpServlet {
	 private boolean isDisabled = true;
	 public String url="";
	 
	 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getAttribute("url")==null) {
			
			RequestDispatcher view = request.getRequestDispatcher("login.jsp");
			view.forward(request, response);
			return;
			
		}
		url=request.getAttribute("url").toString();
		RequestDispatcher view = request.getRequestDispatcher("login.jsp");
		view.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		
		if(userName.equals(password)) {
			HttpSession session = request.getSession();
			session.setAttribute("userName", userName);
			System.out.println(session.getId());
		
			if(url.equals("")) {
			response.sendRedirect("index.html");
			}
			else {
			response.sendRedirect(url);	
			}
			
			return;
			
		}
		out.println("Wrong Password");
		
		
	}
	
	public boolean isDisabled() {
		return isDisabled;
	}

}
