<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!-- 
	Header is used for end users who are not administrators
	Providing them with the options of logging just in case they are an admin, 
	also the company list with the search option along with the About us page
 -->
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-info mb-5">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"
					href="/CompanyUnite/Login.jsp">Login</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/CompanyUnite/companySearch.jsp">Company List</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/CompanyUnite/about.jsp">About us</a></li>
			</ul>
		</div>
	</nav>
</body>
</html>