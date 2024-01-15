<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.simpli.*" %>
<center><h1>Welcome to EProducts.com</h1></center>


<!--  JSP Declaration -->
<%! int data=100; %> 

<%! EProduct e1 = new EProduct(); %> 

<%! public int add(int a, int b){
	
	return a+b;
}
%> 

<!--  JSP Expresssions Demo -->
<br> Data value is: <%= data %>
<br> 2 + 3 is: <%= add(2,3) %>

<br> EProduct name is: <%= e1.getName() %>
<br><br> Time now is : <%= new java.util.Date() %> 

