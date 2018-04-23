<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page  import="java.sql.*,shopbean.ConnDB" %>

<html>
  <head>
    <title>order_select</title>
  </head>
  
  <body>
    <form action="detail.jsp">
    	请输入要查询的订单号<br>
    	订单号:<input type="text" name="orderid" /><input type="submit" name="submit" value="搜索" />
    </form>
  </body>
</html>
