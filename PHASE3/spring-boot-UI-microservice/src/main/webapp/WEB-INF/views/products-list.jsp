<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table border=1>
	<tr>
		<td>ID
		<td>NAME
		<td>PRICE
		<td>DATE ADDED
		<td>ACTIONS
	</tr>

	<c:forEach var="product" items="${products}">
		<tr>
			<td>${product.ID}
			<td>${product.name}
			<td>${product.price}
			<td>${product.dateAdded}</td>
		</tr>
	</c:forEach>

</table>