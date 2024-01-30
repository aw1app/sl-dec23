%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

Edit Product<hr>

<div align="center">
Test Date Product<hr>

	<form:form action="testdate" method="post">
		
		<<form:label path="dateAdded">Product Date Added:</form:label>
		<form:input path="dateAdded" />
		<br />



		<form:button>Test Date</form:button>

	</form:form>

	<br>
</div>
	<br> <a href="/"> Back to HOME</a>