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
<%@ include file="adminHeader.jsp"%>
<body>

	<div class="container">
			<h1 class="text-center text-success">Register Company</h1>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New Company</a>
			</div>
			<br>
		<table border = "1" class="table table-striped table-bordered">
			<tr class="bg-info">
				<th>ID</th>
				<th>Name</th>
				<th>Address</th>
				<th>Postcode</th>
				<th>Sector</th>
				<th>Additional Information</th>
				<th>Modify/Delete</th>
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
					/ <a href="delete?companyId=<c:out value='${companyDetails.companyId}' />">Delete</a></td>
			</tr>
		
			</c:forEach>
		</table>
	</div>
</body>
<%@ include file="footer.jsp"%>
</html>