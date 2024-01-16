<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


This part if you want to capture indiual form paramters.
     <jsp:useBean id="product1" class="com.ecommerce.EProduct" scope="page">          
     </jsp:useBean>
     
     <jsp:setProperty property="name" param="name"   name="product1"/>
     <jsp:setProperty property="price"  param="price"  name="product1"/>
     
     
   <br> <br> I.  Product created successfully. Here the details:
     
   <br> Name: <jsp:getProperty property="name" name="product1" />
   <br> Price: <jsp:getProperty property="price" name="product1"/>
   

   
   
    <jsp:useBean id="product2" class="com.ecommerce.EProduct" scope="session">          
     </jsp:useBean>
     
     <jsp:setProperty property="*"  name="product2"/>
     
     
     
   <br> <br> II.  Product created successfully. Here the details:
     
   <br> Name: <jsp:getProperty property="name" name="product2" />
   <br> Price: <jsp:getProperty property="price" name="product2"/>
   
   <a href="approved-status.jsp" >Check status of approval here</a>