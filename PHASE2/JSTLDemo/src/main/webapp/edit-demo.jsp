<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<%@ include file="header.jsp" %>

<sql:setDataSource var="ecommerce" driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/ecommercedb" user="root"
	password="rootroot" />
	
	<sql:query dataSource="${ecommerce}" var="resultSet">
	
	SELECT * FROM eproduct where ID='<%=request.getParameter("ID") %>'
	
	</sql:query>
	
	<c:forEach var="row" items="${resultSet.rows}">
	
	<form action="save-edited-product.jsp" method="post">
	
	<br>ID: <input name="ID"   value="${row.ID}">
	<br>Name: <input name="name" value="${row.name }">
	<br><br>Price: <input name="price" value="${row.price}">	
	
	<br><br><input type="submit" value="Submit">
	
	</form>
	
	</c:forEach>
	
	