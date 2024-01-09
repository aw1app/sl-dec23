package com.ecommerce.filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class MyFilter1 extends HttpFilter implements Filter {
	
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Inside MyFilter1");
		
		PrintWriter out = response.getWriter();
		
		String comments= request.getParameter("comments");
		
		if(comments==null || comments.equals("")) {
			out.print("Comments section cannot be null. Please enter some comments.");
		}
		else {
		// pass the request along the filter chain
		chain.doFilter(request, response);
		}
	}

	

}
