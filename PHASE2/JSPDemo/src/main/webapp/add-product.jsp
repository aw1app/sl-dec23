<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    <%
     String name = request.getParameter("name");
     String priceStr  = request.getParameter("price");
     float price = Float.parseFloat(priceStr);
    
     out.println("<br> Added a new product succesfully!");
     out.println("<br> Details:");
     out.println("<li> name:"+name);
     out.println("<li> price:"+price);     
     
     %>
     
     