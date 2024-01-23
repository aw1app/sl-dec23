<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp" %><hr>

<table border=1>
<tr> <th>ID <th>NAME <th>PRICE <th>DATE ADDED </tr>

<c:forEach var="product" items="${prodlist}">   
 <tr>  <td> ${product.ID} <td>${product.name} <td>${product.price}<td>${product.dateAdded}
</c:forEach>

</table>



