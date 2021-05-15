<%@page import="java.sql.*"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Company List</title>
<link
	href="https://unpkg.com/bootstrap@4.5.0/dist/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
</head>
<%@ include file="leastPrivilegeHeader.jsp"%>
<!-- 
	Title: JSP 6 CRUD - Search Data
	Author: CodeTube
	Date: Aug 18, 2017
	Code version: 1.0
	Availablity: https://www.youtube.com/watch?v=W4D1TVGd7UA
 -->
<body>

	<div class="col-md-4 mb-2">
		<form action=""method-"get">
			<input type="text" class="form-control" name="search"
				placeholder="Search postcode or sector" />
		</form>
	</div>
	<div class="container mb-5">
		<table border="1" class="table table-striped table-bordered">
			<thead>
				<tr class="bg-info">
					<th>Name</th>
					<th>Address</th>
					<th>Postcode</th>
					<th>Sector</th>
					<th>Additional Information</th>
				</tr>
			</thead>
			<!-- 
			Below code is connecting to the hosted database.
			Its taking in the postcode or sector entered by the end user 
			then assigning that to variable result which is then used in the SQL query to query the database 
			assigning all matches to data, which returns all matching companies in a ResultSet			
			 -->
			<tbody>
				<%
			String host = "jdbc:mysql://eu-cdbr-west-01.cleardb.com/heroku_298fc475a99a62d";
			Connection connection = null;
			Statement statement = null;
			ResultSet resultSet = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(host,"b0a60f8774be0e","13f98876");
			statement = connection.createStatement();
			String result = request.getParameter("search");
			String query;
			if(result!=null){
				query = "select * FROM company_details where postcode like '%"+result+"%' or sector like '%"+result+"%'";
			}else{
				query = "select * FROM company_details order by companyId desc";
			}
			resultSet = statement.executeQuery(query);
			while(resultSet.next()){
			%>
				<tr>
					<td><%=resultSet.getString("companyName") %></td>
					<td><%=resultSet.getString("address") %></td>
					<td><%=resultSet.getString("postcode") %></td>
					<td><%=resultSet.getString("sector") %></td>
					<td><%=resultSet.getString("details") %></td>
				</tr>
				<%
			}
			%>
			</tbody>
		</table>
	</div>
</body>
</html>