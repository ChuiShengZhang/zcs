<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
  <head>
    <title>登录成功</title>
    <style>
    	#title{
    		color:red;
    		text-align:center;
    	}
    </style>
  </head>
  
  <body>
    <%!
    	String user;String psw;int count=0;
    	void countPeople(){
    		count++;
    	}
     %>
    <%
    	user = request.getParameter("user");
    	psw = request.getParameter("psw");
    	if(user!=null && psw!=null){
    		session.setAttribute("user","ok");	
    	}
    	if(session.getAttribute("user")!=null){
    		countPeople();
    		String userCount = String.valueOf(count);
    		session.setAttribute("people",userCount);
    	}
    	if(session.getAttribute("user")!=null){
    %>
    <table border="1">
    	<tr><td id="title" colspan="2">欢迎的登录Ebuy商城</td></tr>
    	<tr><td rowspan="5"><img src="image\1.jpg" /></td><td><a href="#">我的购物车</a></td></tr>
    	<tr><td><a href="#">我的订单</a></td></tr>
    	<tr><td><a href="#">意见反馈</a></td></tr>
    	<tr><td><a href="#">修改我的资料</a></td></tr>
    	<tr><td><a href="#">退出</a></td></tr>
    	<tr><td colspan="2">您是第<%=(String)session.getAttribute("people")%>个登录本站</td></tr>
    </table>
    <%
    	}else{
     %>
     <%
     	response.sendRedirect("login.jsp");
     	}
      %>
  </body>
</html>
