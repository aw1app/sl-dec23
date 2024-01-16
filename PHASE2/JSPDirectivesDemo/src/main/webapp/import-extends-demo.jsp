<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.io.*" %>

    
    
    Date : <%= new Date() %>
    <br>
    <% File f = new File("F:\temp.txt");
    	out.print(f.exists());
    %>