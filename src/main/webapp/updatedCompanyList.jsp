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
			<h3 class="text-center">Register Company</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New Company</a>
			</div>
			<br>
		<table border = "1" class="table table-striped table-bordered">
			<tr class="thead-dark">
				<th>ID</th>
				<th>Name</th>
				<th>Address</th>
				<th>Postcode</th>
				<th>Sector</th>
				<th>Additional Information</th>
			</tr>
			<c:forEach items = "${listCompanies}" var = "companyDetails">
			<tr>
				<td><c:out value="${companyDetails.companyId}" /></td>
				<td><c:out value="${companyDetails.companyName}" /></td>
				<td><c:out value="${companyDetails.address}" /></td>
				<td><c:out value="${companyDetails.postcode}" /></td>
				<td><c:out value="${companyDetails.sector}" /></td>
				<td><c:out value="${companyDetails.details}" /></td>
				
				<td><a href="edit?companyId=<c:out value='${companyDetails.companyId}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?companyId=<c:out value='${companyDetails.companyId}' />">Delete</a></td>
			</tr>
		
			</c:forEach>
		</table>
	</div>
</body>
<%@ include file="footer.jsp"%>
</html>