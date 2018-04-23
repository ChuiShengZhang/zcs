<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>登录</title>
    <style>
    	#head1{
    		text-align:center;
    		background-color:#3CF;
    	}
    </style>
    <script>
    	function check(){
    		if(document.form.user.value.length==0){
    			alert("用户名不能为空");
    			document.form.user.focus();
    			return false;
    		}
    		if(document.form.psw.value.length==0){
    			alert("密码不能为空");
    			document.form.psw.focus();
    			return false;
    		}
    	}
    </script>
  </head>
  <body onLoad="document.form.user.focus();">
    <form name="form" method="post" onSubmit="return check();" action="dologin.jsp">
    	<table>
    		<tr><td id="head1">用户登录</td></tr>
    		<tr><td>用户名：<input type="text" name="user" /></td></tr>
    		<tr><td>&nbsp;&nbsp;&nbsp;密码： <input type="password" name="psw" /></td></tr>
    		<tr><td>
    			<a href="#">忘记密码？</a>
    			<input type="submit" value="登录" name="submit" />
    			<input type="reset" value="注册" name="reset" />
    		</td></tr>
    	</table>
    </form>
  </body>
</html>
