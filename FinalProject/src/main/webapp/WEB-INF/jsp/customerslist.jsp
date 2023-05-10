<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Customers List</h1>
	Id		 |	   First Name	   |	   Last Name  | <br/>
	----------------------------------------------------<br/>
	
	<c:forEach var="customer" items="${customersList}">
		${customer.id}   |   ${customer.firstname}    |   ${customer.lastname} </br>
	</c:forEach>
</body>
</html>