<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Account</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<%@ include file="adminHeader.jsp"%>
<body>
	<div>
		<h1></h1>
		<form action="<%=request.getContextPath() %>/register" method="post">
		<div class="container col-md-5">
			<div class="card">
				<div class="card-body">
			
				<!--<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" /></td>
				</tr>  -->
				<fieldset class="form-group">
					<label>First Name</label> <input type="text"
						value="<c:out value='${account.firstName}' />" class="form-control"
						name="firstName">
				</fieldset>
				<!--<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" /></td>
				</tr>  -->
				<fieldset class="form-group">
					<label>Last Name</label> <input type="text"
						value="<c:out value='${account.lastName}' />" class="form-control"
						name="lastName">
				</fieldset>
				<!--<tr>
					<td>Username</td>
					<td><input type="text" name="username" /></td>
				</tr>  -->
				<fieldset class="form-group">
					<label>Username</label> <input type="text"
						value="<c:out value='${account.username}' />" class="form-control"
						name="username">
				</fieldset>
				<!--<tr>
					<td>Password</td>
					<td><input type="text" name="password" /></td>
				</tr>  -->
				<fieldset class="form-group">
					<label>Password</label> <input type="text"
						value="<c:out value='${account.password}' />" class="form-control"
						name="password">
				</fieldset>
				<!--<tr>
					<td>Phone</td>
					<td><input type="text" name="phone" /></td>
				</tr>  -->
				<fieldset class="form-group">
					<label>Phone</label> <input type="text"
						value="<c:out value='${account.phone}' />" class="form-control"
						name="phone">
				</fieldset>
				<!--<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				</tr>  -->
				<fieldset class="form-group">
					<label>Email</label> <input type="text"
						value="<c:out value='${account.email}' />" class="form-control"
						name="email">
				</fieldset>
			<button type="submit" class="btn btn-success">Save</button>
		</div>
		</div>
		</div>
		</form>
	</div>
</body>
<%@ include file="footer.jsp"%>
</html>