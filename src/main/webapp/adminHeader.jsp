<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-info mb-5">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="/CompanyUnite/ModifyCompanyList">Register Company</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/CompanyUnite/register">Registration</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" id="logout" href="/CompanyUnite/Login.jsp">Logout</a>
      </li>
    </ul>
  </div>
</nav>


</body>
<script>
	$('#Logout').click(function(){
		$('.alert').addClass("hide");
		$('.alert').addClass("show");
	});

</script>
</html>