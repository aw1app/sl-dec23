package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet3")
public class Servlet3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		out.println("<h1> I am Servlet3."
				+ " I have been redirected from F/I/R Servlet</h1>");
		
		out.close()	;
		
	}
}
