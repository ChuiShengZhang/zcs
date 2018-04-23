<%@page contentType="text/html;charset=utf-8"%>
<%@page import="java.sql.*"%>
<html>
<head>
<title>jdbc_odbc</title>
</head>
<body>
	<%
		//String dirverName = "sun.jdbc.odbc.JdbcOdbcDirver";
		String dirverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		//String connUrl = "jdbc:odbc:WebShop";
		String connUrl = "jdbc:sqlserver://LAPTOP-12GISDAU:1433; DatabaseName=WebShop";
		String user = "sa";
		String password = "123";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(dirverName);
			conn = DriverManager.getConnection(connUrl, user, password);
			out.println("<h2>链接成功</h2>");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from Types");
			while (rs.next()) {
				out.println(rs.getString("t_ID"));
				out.println(rs.getString("t_Name"));
				out.println(rs.getString("t_Description"));
				out.println("<br>");
			}
			out.println("....");
		} catch (ClassNotFoundException e) {
			out.println("ClassNotFound:" + e.getMessage());
		} catch (SQLException e) {
			out.println("SQL:" + e.getMessage());
		} catch (Exception e) {
			out.println("ex:" + e.getMessage());
		} finally {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
			if (rs != null)
				rs.close();
		}
	%>
</body>
</html>