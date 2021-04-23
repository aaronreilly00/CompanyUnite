<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form1</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
	<table border = "1">
		<tr>
			<th>firstName</th>
			<th>lastName</th>
			<th>username</th>
			<th>password</th>
			<th>address</th>
			<th>contact</th>
		</tr>
		
		<c:forEach items = "${list}" var = "details">
			<tr>
				<td>${details.firstName}</td>
				<td>${details.lastName}</td>
				<td>${details.username}</td>
				<td>${details.password}</td>
				<td>${details.address}</td>
				<td>${details.contact}</td>
			</tr>
		
		</c:forEach>
	</table>
</body>
</html>