<%@page contentType="text/html;charset=utf-8"%>
<%@page import="java.sql.*"%>
<html>
<title></title>
<body>
	<%!String user, psw, repsw, sex, year, month, day, email;
	Connection conn = null;
	Statement stmt = null;%>
	<%!public String toDate(String year, String month, String day) {
		return year + "-" + month + "-" + day;
	}

	public String toSql(String name, String psw, String sex, String date, String email) {
		return "use WebShop insert into zp values('" + name + "','" + psw + "','" + sex + "','" + date + "','" + email
				+ "')";
	}

	public boolean pswIsSame(String psw, String repsw) {
		if (psw.equals(repsw))
			return true;
		else
			return false;
	}

	public boolean nameIsSame(Statement stmt, String user) throws SQLException {
		ResultSet rs = stmt.executeQuery("use WebShop select name from zp");
		while (rs.next()) {
			if (user.equals((rs.getString("name")).trim()))
				return false;
		}
		return true;
	}

	public String isNull(String user, String psw, String email) {
			if (user.equals(""))
				return "<font size=5 color='red'>用户名不能为空</font><br>";
			else if (psw.equals(""))
				return "<font size=5 color='red'>密码不能为空</font><br>";
			else if (email.equals(""))
				return "<font size=5 color='red'>邮箱不能为空</font><br>";
			else
				return null;
	}
	
	public String checkEmail(String email){
		String[] strs = email.split("@");
		strs[1] = strs[1].trim();
		String[] emails = {"qq.com","163.com","gmail.com"};
		for(String i : emails){
			if(strs[1].equals(i))
				return null;
			}
		return "<font size=5 color='red'>不支持"+strs[1]+"的邮箱<font><br>仅支持qq.com,163.com,gmail.com的邮箱<br>";
	}
	
	%>
	<%
		request.setCharacterEncoding("utf-8");
	%>
	<%
		user = request.getParameter("user");
		psw = request.getParameter("psw");
		repsw = request.getParameter("repsw");
		sex = request.getParameter("sex");
		year = request.getParameter("year");
		month = request.getParameter("month");
		day = request.getParameter("day");
		email = request.getParameter("email");
		int flag = 0;

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost;DatabaseName = WebShop", "sa", "123456");
			stmt = conn.createStatement();
			String temp = isNull(user, psw, email);
			if (temp != null) {
				out.print(temp);
				out.println("三秒后跳转回<a href='regist.jsp'>注册页面</a>");
				response.setHeader("Refresh", "3;URL=regist.jsp");
			}else{
				String no = checkEmail(email);
				if(no!=null){
					out.println(no);
					out.println("三秒后跳转回<a href='regist.jsp'>注册页面</a>");
					response.setHeader("Refresh", "3;URL=regist.jsp");
				}
				if (nameIsSame(stmt, user)) {
					if (pswIsSame(psw, repsw)) {
						out.println("<font size=5 color='red' >注册成功</font>");
					} else {
						flag++;
						out.println("<font size=5 color='red' >密码输入不一致<br></font>");
					}
				} else {
					flag++;
					out.println("<font size=5 color='red' >名字重复</font><br>");
				}
	
				if (flag != 0) {
					out.println("三秒后跳转回<a href='regist.jsp'>注册页面</a>");
					response.setHeader("Refresh", "3;URL=regist.jsp");
				}
				String sql = toSql(user, psw, sex, toDate(year, month, day), email);
				int num = stmt.executeUpdate(sql);
				}
		} catch (ClassNotFoundException e) {
			out.println("cnf" + e.getMessage());
		} catch (SQLException e) {
			out.println("sql" + e.getMessage());
		} finally {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
		}
	%>
</body>
</html>
