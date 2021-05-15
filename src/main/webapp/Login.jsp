<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<!-- 
 Login JSP displays the username password options using a jumbotron

 -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0"
	crossorigin="anonymous">
<link href="css/style.css" type="text/css" rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-p34f1UUtsS3wqzfto5wAAmdvj+osOnFyQFpp4Ua3gs/ZVWx6oOypYoCJhGGScy+8"
	crossorigin="anonymous"></script>

</head>
<%@ include file="leastPrivilegeHeader.jsp"%>
<body>
	<form id="form" action="<%=request.getContextPath()%>/Login"
		method="post">
		<div class="text-center mt-5">
			<div class="row">
				<div class="col-lg-3"></div>
				<div class="col-sm-6 col-xs-12">
					<div class="jumbotron">
						<h1 class="text-center text-success">Welcome please sign in</h1>
						<br>
						<div class="text-center">
							<label class="control-label" for="username">Username:</label> <input
								id="username" type="text" name="username" placeholder="Username"
								required>
						</div>
						</br>
						<div class="text-center">
							<label class="control-label" for="passwrord">Password:</label> <input
								id="password" type="text" name="password" placeholder="Password"
								required> </br> <input type="checkbox" name="remember">
							Remember Me?
						</div>
						</br>
						<div class="text-center"">
							<button type="submit" class="btn btn-lg btn-info">Login</button>
						</div>
					</div>
				</div>
				<div class="col-md-3"></div>
			</div>
		</div>
	</form>
</html>