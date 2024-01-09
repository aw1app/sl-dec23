package com.ecommerce;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class IncludeForwardReirectDemo extends HttpServlet {

	// Demo redirection
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();	
		
		response.sendRedirect("servlet3");
		
		out.flush();		
		out.close()	;		
	}
	
	
	// Demo forwarding
	protected void doGet1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();		
		
		
		request.getRequestDispatcher("/servlet2").forward(request, response);
		
				
		out.append("This content in IncludeForwardReirectDemo servlet will"
				+ "not be in response, because the forwarding has "
				+ "already happened.");
		
		out.flush();		
		out.close()	;
		
	}
	
	
	// Demo Inlcude
	protected void doGet0(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();		
		
		
		request.getRequestDispatcher("/header").include(request, response);
		
				
		out.append("Today is Mega Sale day. Hurry until stock lasts.");
		
		out.flush();
		
		out.close()	;
		
	}

	

}
