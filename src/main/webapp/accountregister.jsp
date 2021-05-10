<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Account</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<script defer src="password.js"></script>
</head>
<%@ include file="adminHeader.jsp"%>
<body>
	<div>
		<h1></h1>
		<div id="error"></div>
		<form id="form" action="<%=request.getContextPath() %>/register" method="post">
		<div class="container col-md-5">
			<div class="card">
				<div class="card-body">
				<fieldset class="form-group">
					<label>First Name</label> <input type="text"
						value="<c:out value='${account.firstName}' />" class="form-control"
						name="firstName" required>
				</fieldset>
				<fieldset class="form-group">
					<label>Last Name</label> <input type="text"
						value="<c:out value='${account.lastName}' />" class="form-control"
						name="lastName" required>
				</fieldset>
				<fieldset class="form-group">
					<label>Username</label> <input type="text"
						value="<c:out value='${account.username}' />" class="form-control"
						name="username" required>
				</fieldset>
				<fieldset class="form-group">
					<label>Password</label> <input id="password" type="text"
						value="<c:out value='${account.password}' />" class="form-control"
						name="password">
				</fieldset>
				<fieldset class="form-group">
					<label>Phone</label> <input type="text"
						value="<c:out value='${account.phone}' />" class="form-control"
						name="phone" required>
				</fieldset>
				<fieldset class="form-group">
					<label>Email</label> <input type="text"
						value="<c:out value='${account.email}' />" class="form-control"
						name="email" required>
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