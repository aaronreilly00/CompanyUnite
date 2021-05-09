	<%@page import="java.sql.*" %>
	<%@page import="java.sql.Connection" %>
	<%@page import="org.project.companies.util.DBConnection" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Company List</title>
<link href="https://unpkg.com/bootstrap@4.5.0/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<%@ include file="leastPrivilegeHeader.jsp"%>
<body>

	<div class="col-md-4">
		<form action="" method-"get">
			<input type="text" class="form-control" name="q" placeholder="Search here...."/>
		</form>
	</div>
	<div class="container">
		<table border = "1" class="table table-striped table-bordered">
		<thead>
			<tr class="thead-dark">
				<th>Name</th>
				<th>Address</th>
				<th>Postcode</th>
				<th>Sector</th>
				<th>Additional Information</th>
			</tr>
			</thead>
			<tbody>
			<%
			String host = "jdbc:mysql://eu-cdbr-west-01.cleardb.com/heroku_298fc475a99a62d";
			Connection conn = null;
			Statement stat = null;
			ResultSet res = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
        	conn = DriverManager.getConnection(host,"b0a60f8774be0e","13f98876");
        	stat = conn.createStatement();
			String query = request.getParameter("q");
			String data;
			if(query!=null){
				data = "select * FROM company_details where postcode like '%"+query+"%' or sector like '%"+query+"%'";
			}else{
				data = "select * FROM company_details order by companyId desc";
			}
			res = stat.executeQuery(data);
			while(res.next()){
			%>
			<tr>
				<td><%=res.getString("companyName") %></td>
				<td><%=res.getString("address") %></td>
				<td><%=res.getString("postcode") %></td>
				<td><%=res.getString("sector") %></td>
				<td><%=res.getString("details") %></td>
			</tr>
			<%
			}
			%>
			</tbody>
		</table>
	</div>
</body>
<%@ include file="footer.jsp"%>
</html>