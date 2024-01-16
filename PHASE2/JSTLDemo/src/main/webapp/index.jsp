<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div style="text-align: right;"></div>
<hr>
Setting variables and printing them core tag demo
<br>
<c:set var="x" value="100" />

Value of x:
<c:out value="${x}" />

<hr>
Conditional core tag demo
<br>

<c:if test="${x==100}"> X is 100 is true </c:if>


<hr>
Conditional if/esle/else core tag demo
<br>

<c:choose>
<c:when test="${x==100}">X is 100</c:when>
<c:when test="${x<100}">X is LT 100</c:when>
<c:otherwise>X is GT 100</c:otherwise>
</c:choose>


<hr>
For loop core tag demo
<br>

<c:forEach var="i" begin="1" end="5"> <li> Hello <c:out value="${i}" />  </c:forEach> 
