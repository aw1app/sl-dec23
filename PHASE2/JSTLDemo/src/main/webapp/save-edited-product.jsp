<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<%@ include file="header.jsp" %>

<sql:setDataSource var="ecommerce" driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/ecommercedb" user="root"
	password="rootroot" />
	
	<sql:update dataSource="${ecommerce}" var="count" >
	
	UPDATE eproduct SET price=<%=request.getParameter("price") %> where ID=<%=request.getParameter("ID") %> 
	
	</sql:update>
	
	<c:out value="${count}" />	Updated Successfully
	
	