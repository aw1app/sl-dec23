<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    <%
    boolean loggedIn=false;
    
    if(session.getAttribute("logged")!=null)
    loggedIn = (boolean) session.getAttribute("logged");
    
    if(loggedIn==true){
    	out.print("TODAY's hot news is ...");
    }else{
    	out.print("You need to be Logged In to see the hot news!");
    	out.print("<a href=\"login.html\">LOGIN </a>");
    }
    
     %>