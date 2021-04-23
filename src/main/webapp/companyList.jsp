<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Company List</title>
<link href="https://unpkg.com/bootstrap@4.5.0/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<%@ include file="header.jsp"%>
<body>
	<div class="container">
		<table border = "1" class="table table-striped table-bordered">
			<tr class="thead-dark">
				<th>Name</th>
				<th>Address</th>
				<th>Postcode</th>
				<th>Sector</th>
				<th>Additional Information</th>
			</tr>
			<c:forEach items = "${list}" var = "companyDetails">
			<tr>
				<td>${companyDetails.companyName}</td>
				<td>${companyDetails.address}</td>
				<td>${companyDetails.postcode}</td>
				<td>${companyDetails.sector}</td>
				<td>${companyDetails.details}</td>
			</tr>
		
			</c:forEach>
		</table>
	</div>
</body>
<%@ include file="footer.jsp"%>
</html>