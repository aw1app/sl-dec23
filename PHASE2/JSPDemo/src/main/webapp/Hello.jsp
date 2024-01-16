<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<center><h1>Welcome to EProducts.com</h1></center>

Time now is : <%= new java.util.Date() %> 


<%! int x=20; %>

<hr>
<% if (x>20) { 
	out.print("x  is GT 20 ");
}
else{
	out.print("x  is LT or EQ to  20 ");
}

%>

<hr>

<% if (x>20) { %>
	x  is GT 20
<%} else{	%>
	x  is LT or EQ to  20	
<% } %>

<hr>