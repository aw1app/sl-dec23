<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.simpli.*" %>
<center><h1>Welcome to EProducts.com</h1></center>

<a href="new-product.html" > Add new Product </a>
<br>
<a href="demo-error-handling.jsp" > Demo Error Handling </a>


<br><br>
<!--  JSP Declaration Demo-->
<%! int data=100; %> 

<%! EProduct e1 = new EProduct(); %> 

<%! String[] names = {"Shasi", "Somu", "Robert"} ;%>

<%! public int add(int a, int b){
	
	return a+b;
}
%> 



<!--  JSP Expresssions Demo -->
<br> Data value is: <%= data %>
<br> 2 + 3 is: <%= add(2,3) %>

<br> EProduct name is: <%= e1.getName() %>
<br><br> Time now is : <%= new java.util.Date() %> 

<br><br>
<!--  JSP Scriplet Demo -->
<% out.print("welcome to jsp"); %> 

<% 
	for(int i=0; i<5; i++)
	out.print("<li> Happy coding");

%> 

<% for(int i=0; i< names.length; i++){ %><li><%out.println(names[i]); }%></li>
