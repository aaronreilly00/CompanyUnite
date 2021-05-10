<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Company</title>
<link href="https://unpkg.com/bootstrap@4.5.0/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<%@ include file="adminHeader.jsp"%>
<body>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">

				<c:if test="${company != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${company == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${company != null}">
            			Edit User
            		</c:if>
						<c:if test="${company == null}">
            			Add New User
            		</c:if>
					</h2>
				</caption>
				
				<c:if test="${company != null}">
					<input type="hidden" name="companyId" value="<c:out value='${company.companyId}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Company Name</label> <input type="text"
						value="<c:out value='${company.companyName}' />" class="form-control"
						name="companyName" required>
				</fieldset>

				<fieldset class="form-group">
					<label>Address</label> <input type="text"
						value="<c:out value='${company.address}' />" class="form-control"
						name="address" required>
				</fieldset>

				<fieldset class="form-group">
					<label>Postcode</label> <input type="text"
						value="<c:out value='${company.postcode}' />" class="form-control"
						name="postcode" required>
				</fieldset>
				
				<fieldset class="form-group">
					<label>Sector</label> <input type="text"
						value="<c:out value='${company.sector}' />" class="form-control"
						name="sector" required>
				</fieldset>
				
				<fieldset class="form-group">
					<label>Details</label> <input type="text"
						value="<c:out value='${company.details}' />" class="form-control"
						name="details" required>
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
<%@ include file="footer.jsp"%>
</html>
