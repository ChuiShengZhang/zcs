<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page  import="java.sql.*,shopbean.ConnDB" %>
<html>
  <head>
    <title>order_all</title>
  </head>
  
  <body>
   	<%
   		ConnDB cdb = new ConnDB();
   		String sql = "select * from Orders";
   		Connection conn = null;
   		Statement stmt = null;
   		ResultSet rs = null;
   		try{
   			conn = cdb.getConnection();
   			stmt = conn.createStatement();
   			rs = stmt.executeQuery(sql);
   			out.println("<table border='1' name='table'><tr bgcolor='blue'><td>用户名</td><td>订单号</td><td>订单时间</td><td>总金额</td><td colspan='2' align='center'>操作</td></tr>");
   			while(rs.next()){
   				out.println("<tr>");
   				out.println("<td>"+rs.getString("order_user")+"</td>");
   				out.println("<td>"+rs.getString("order_id")+"</td>");
   				out.println("<td>"+rs.getString("order_time")+"</td>");
   				out.println("<td>"+rs.getString("order_sum")+"</td>");
   				out.println("<td>[&nbsp;<a href='detail.jsp?orderid="+rs.getString("order_id")+"'>查看详细资料</a>&nbsp;]</td>");
   				out.println("<td>[&nbsp;<a href='order_delete.jsp?name="+rs.getString("order_id")+"'>删除</a>&nbsp;]</td>");
   				out.println("</tr>");
   			}
   			out.println("</table>");
   		}catch(Exception e){
   			out.println(e.toString());	
   		}finally{
   			conn.close();
   			stmt.close();
   			rs.close();
   		}
   	 %>
  </body>
</html>
