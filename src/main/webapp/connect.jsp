<%
String host = "jdbc:mysql://localhost:3306/company";
Connection conn = null;
Class.forName("com.mysql.jdbc.Driver").newInstance();
conn = DriverManager.getConnection(host,"root","Celeron123!");

%>