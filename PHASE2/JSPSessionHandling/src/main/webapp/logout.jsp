<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"%>


<%
session.invalidate();
out.print("LOGOUT SUCCESSFUL");
out.print("<a href=\"login.html\">LOGIN AGAIN </a>");

%>