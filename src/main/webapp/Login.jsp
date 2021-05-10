<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<script defer src="password.js"></script>
</head>
<%@ include file="leastPrivilegeHeader.jsp"%>
<body>
<form id="form" action="<%=request.getContextPath()%>/Login" method="post">
<div class="container">
	<div id="error"></div>
	<div class="row">
				<div class="col-lg-3"></div>
				<div class="col-sm-6 col-xs-12">
					<div class="jumbotron">
						<h1 class="text-center">Login Page</h1>
						<br>
						<div class="form-group">
							<label class="control-label" for="username">Username</label>
							<input id="username" type="text" name="username" placeholder="Username" required>
						</div>
						<div class="form-group">
							<label class="control-label" for="passwrord">Password</label>
							<input id="password" type="text" name="password" placeholder="Password" required>
						</div>
						<input type="checkbox" name="remember"> Remember Me?
						<br><br>
						<div class="pull-right">
						<button type="submit" class="btn btn-outlining-warning">Login</button>
						<button type="reset" class="btn btn-outlining-dark">Close</button>
						</div>
					</div>
				</div>
			<div class="col-md-3"></div>
	</div>
</div>

</form>

<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
</body>
<%@ include file="footer.jsp"%>
</html>