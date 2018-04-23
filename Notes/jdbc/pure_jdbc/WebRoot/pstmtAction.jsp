<%@page contentType="text/html;charset=UTF-8"%>
<%@page import="java.sql.*"%>

<%!
	Connection conn = null;
	PreparedStatement pstmt = null;
	String user,psw,sex,bir,email;
	String[] strs = {user,psw,sex,bir,email};
	int intTemp = 0;
 %>
<%
	user = request.getParameter("user");
	psw = request.getParameter("psw");
	sex = request.getParameter("sex");
	bir = request.getParameter("bir");
	email = request.getParameter("email");
	try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=WebShop1","sa","123456");
		String sql = "insert into zp values(?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,user);
		pstmt.setString(2,psw);
		pstmt.setString(3,sex);
		pstmt.setString(4,bir);
		pstmt.setString(5,email);
		intTemp = pstmt.executeUpdate();
		if(intTemp>0)
			out.println("<font size=7 color='red'>插入成功</font>");
	}catch(ClassNotFoundException e){
		out.println(e.getMessage());
	}catch(SQLException e){
		out.println(e.getMessage());
	}
 %>