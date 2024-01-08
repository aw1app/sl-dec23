<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <% 
    
    String userid = request.getParameter("userid");
	String pass = request.getParameter("pass");
	
	out.write("Hey user, got your GET request");
	out.write("<br>  You submitted userid="+userid + " and  your password is "+ pass);   
    
    
    %>