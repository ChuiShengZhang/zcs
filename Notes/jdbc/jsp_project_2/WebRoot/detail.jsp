<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page  import="java.sql.*,shopbean.ConnDB" %>

<html>
  <head>
    <title>detail</title>
  </head>
  
  <body>
  	 <%
  	 	Connection conn = null;
    	Statement stmt = null;
    	ResultSet rs = null;
    	try{
	    	String orderid = request.getParameter("orderid");
	    	if(orderid!=null){
	    		String sql = "select * from Orders where order_id='"+orderid+"'";
	    		ConnDB cdb = new ConnDB();
	    		conn = cdb.getConnection();
	    		stmt = conn.createStatement();
	    		rs = stmt.executeQuery(sql);
	    		
		    	out.println("<table border='1' name='table'><tr colspan='4'>查询结果</tr><tr bgcolor='blue'><td>用户名</td><td>订单号</td><td>订单时间</td><td>总金额</td></tr>");
		    	while(rs.next()){
		    		out.println("<td>"+rs.getString("order_user")+"</td>");
		   			out.println("<td>"+rs.getString("order_id")+"</td>");
		   			out.println("<td>"+rs.getString("order_time")+"</td>");
		   			out.println("<td>"+rs.getString("order_sum")+"</td>");
		   			out.println("</tr>");
		    	}
	    		out.println("</table>");	
		    }
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
