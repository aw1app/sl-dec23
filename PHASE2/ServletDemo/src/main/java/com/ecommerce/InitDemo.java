package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = "/init-demo")
public class InitDemo extends HttpServlet{
	
	public void init(ServletConfig config) {
		System.out.printf("\n Inside init .\n");	
		
		String db_user = config.getInitParameter("database_username");
		System.out.printf("db_user = %s \n", db_user);	
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		System.out.printf("\n Inside do Get.\n");
		
		PrintWriter out = response.getWriter();	
		
		out.write("Hello from Init demo servlet");
		
		out.close();
	}
	
	public void destroy() {
		System.out.printf("\n Inside destroy .\n");
	}

}
