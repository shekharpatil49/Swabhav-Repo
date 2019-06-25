package com.techlab.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.techlab.model.CardType;

/**
 * Servlet Filter implementation class FormValidate
 */
@WebFilter("/add")
public class FormValidator implements Filter {

	private CardType card;

	/**
	 * Default constructor.
	 */
	public FormValidator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		 HttpSession session = ((HttpServletRequest) request).getSession();
		 System.out.println(session.getAttribute("userName"));

		 if (session.getAttribute("userName") == null) {
		
			RequestDispatcher view = request.getRequestDispatcher("auth");
			view.forward(request, response);

		} else {
			
			HttpServletRequest req = (HttpServletRequest) request;
			if (req.getParameter("firstName").equals("")
					|| req.getParameter("lastName").equals("") || req.getParameter("myradio")==null
					|| req.getParameter("dob")==null || req.getParameter("balance")==null) 
			{
				
				RequestDispatcher view = request.getRequestDispatcher("addCustomer.jsp");
				view.forward(request, response);
				
			}
			else {

			
			String firstName = req.getParameter("firstName").toString();
			String lastName = req.getParameter("lastName").toString();
			if (req.getParameter("myradio").toString().equals("CREDIT")) {
				;
				card = card.CREDIT;
			}
			if (req.getParameter("myradio").toString().equals("DEBIT")) {
				;
				card = card.CREDIT;
			}
			String dob = req.getParameter("dob").toString();

			double balance = Double.parseDouble(req.getParameter("balance"));

			chain.doFilter(request, response);
			}

			
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
