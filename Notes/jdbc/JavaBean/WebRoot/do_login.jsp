<%@ page language="java" import="javabean.MyBean" pageEncoding="ISO-8859-1"%>

<html>
  <head>
    <title>do_login</title>
  </head>
  
  <body>
   	<jsp:useBean id="myBean" class="javabean.MyBean" />
   	<jsp:setProperty property="name" name="name" value="zhangsan" />
   	<jsp:getProperty property="name" name="name" />
  </body>
</html>
