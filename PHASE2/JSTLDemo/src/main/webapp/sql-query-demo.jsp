<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:setDataSource var="ecommerce" driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/ecommercedb" user="root"
	password="rootroot" />


<sql:query dataSource="${ecommerce}" var="resultSet">
	SELECT * FROM eproduct
</sql:query>

LIST OF PRODUCT <br>
<table border=1>
	<tr style="background-color:lightgrey">
		<th>ID
		<th>NAME
		<th>PRICE
		<th>DATE ADDED
	</tr>

	<c:forEach var="row" items="${resultSet.rows}">
		<tr>
			<td>${row.ID }
			<td>${row.name }
			<td>${row.price }
			<td>${row.date_added }
		</tr>
	</c:forEach>

</table>