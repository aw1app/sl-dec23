<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="true"%>


<%
String username = request.getParameter("username");
String password = request.getParameter("password");

if (username.equals("admin") && password.equals("admin123")) {
	session.setAttribute("logged", true);
	out.print("LOGIN SUCCESSFULLY");
	out.print("<a href=\"logout.jsp\">LOGOUT HERE </a>");
} else {
	out.print("INVALID USER/PASSWORD !");
	out.print("<a href=\"login.html\">LOGIN </a>");
}
%>