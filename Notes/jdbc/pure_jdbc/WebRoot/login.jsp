<%@page contentType="text/html;charset=utf-8"%>
<html>
<head>
<title>登录</title>
</head>
<body>
	<form method="post" action="login.jsp">
		用户名:<input type="text" name="user" /><br> 
		密码:<input type="password" name="psw" /><br> 
		<input type="image" src="login.jpg" width=200 height=70 name="submit" onClick="document.formName.submit()" />
	</form>
</body>
</html>
