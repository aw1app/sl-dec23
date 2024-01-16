<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error2.jsp"%>

    
    <%
     String name = request.getParameter("name");
     String priceStr  = request.getParameter("price");
     float price = Float.parseFloat(priceStr);
     
     String[] colors  = request.getParameterValues("colors");
    
     out.println("<br> Added a new product succesfully!");
     out.println("<br> Details:");
     out.println("<li> name:"+name);
     out.println("<li> price:"+price);  
     out.println("<li> price:"+java.util.Arrays.toString(colors)); 
     
     //response.sendRedirect("index.jsp");
     
     %>
     
     
      <% 
    
    int a = 10; 
    int b = 5;
    
    out.print(a/(b-b));
    
    %>
     
     