<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

New Product Status Page:
    
    <jsp:useBean id="product2" class="com.ecommerce.EProduct" scope="session">          
     </jsp:useBean>
     
     <br> <br>  Product details:
     
   <br> Name: <jsp:getProperty property="name" name="product2" />
   <br> Price: <jsp:getProperty property="price" name="product2"/>
   
   
   <br><br>
   <br> Product Name : <%= product2.getName() %>
   <br>Product Price : <%= product2.getPrice() %>