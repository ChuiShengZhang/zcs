<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page  import="java.sql.*,shopbean.ConnDB" %>

<html>
  <head>
    <title>order_delete</title>
  </head>
  
  <body>
    <%
    	Connection conn = null;
    	Statement stmt = null;
    	try{
	    	String orderid = request.getParameter("name");
	    	int result = 0;
	    	String sql = "delete from Orders where order_id='"+orderid+"'";
	    	ConnDB cdb = new ConnDB();
	    	conn = cdb.getConnection();
	    	stmt = conn.createStatement();
	    	result = stmt.executeUpdate(sql);
	    	if(result>=1){
	    		out.println("<font size=5 color='red'>删除成功</font>");
	    	}else{
	    		out.println("<font size=5 color='red'>删除失败<font>");
	    	}
	    }catch(Exception e){
	    	out.println(e.toString());	
	    }finally{
	    	conn.close();
   			stmt.close();
	    }
	    	
     %>
  </body>
</html>
