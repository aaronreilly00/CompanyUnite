<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Account</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<%@ include file="header.jsp"%>
<body>
	<div>
		<h1></h1>
		<form action="<%=request.getContextPath() %>/register" method="post">
			<table style="width: 80%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" /></td>
				</tr>
				<tr>
					<td>Username</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="password" /></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				</tr>
			</table>
			<input type="submit" value="Submit"/>
		</form>
	</div>
</body>
<%@ include file="footer.jsp"%>
</html>