package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/xyz")
public class FormProcessingServlet extends HttpServlet {
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();	
		
		String userid = request.getParameter("userid");
		String pass = request.getParameter("pass");
		String gender = request.getParameter("gender");
		
		String[] hobbies = request.getParameterValues("hobbies");
		
		out.write("Hey user, got your GET request");
		out.write("<br>  You submitted userid=<b>"+userid + "</b> and  your password is "+ pass);
		out.write("<br> Gender="+gender + "Hobbies=" + Arrays.toString(hobbies));
				
		System.out.printf("\n User-Agent header value = %s \n", request.getHeader("User-Agent"));
		
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();	
		
		String userid = request.getParameter("userid");
		String pass = request.getParameter("pass");
		
		out.write("Hey user, got your POST request");
		out.write("<br> You submitted userid="+userid + " and  your password is "+ pass);
		
		out.close();
	}

}
