<%@page contentType="text/html; charset=utf-8"%>
<%@page import="java.sql.*"%>
<html>
<head>
<title></title>
</head>
<body>
	<%
    	Connection conn = null;
    	Statement stmt = null;
    	ResultSet rs = null;
    	String user = request.getParameter("user");
    	String psw = request.getParameter("psw");
    	String sql = "use WebShop select name,psw from zp";
    	
    	try{
    		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    		conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=WebShop","sa","123456");
    		stmt = conn.createStatement();
    		rs = stmt.executeQuery(sql);
    		rs.next();
    		out.println();
    		if(rs.getString("name").equals(user) && rs.getString("psw").equals(psw)){
    			out.println("登录成功");	
    		}else{
    			out.println("登录失败");	    			
    		}
    	}catch(ClassNotFoundException e){
    		out.println(e.getMessage());
    	}catch(SQLException e){
    		out.println(e.getMessage());
    	}finally{
    		if(conn!=null)
    			conn.close();
    		if(stmt!=null)
    			stmt.close();
    		if(rs!=null)
    			rs.close();	
    	}
     %>
</body>
</html>
