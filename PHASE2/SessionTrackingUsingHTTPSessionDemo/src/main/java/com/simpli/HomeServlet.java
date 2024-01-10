package com.simpli;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// .getSession(true) create a new session object if a http session object was never created for this user
		HttpSession session = request.getSession(true);
		
		//session.setAttribute("cart-item", "apple");
		
		
		response.sendRedirect("dashboard");		
	}
    

}
