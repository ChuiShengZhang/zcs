
<%@page contentType="text/html;charset=utf-8"%>
<html>
<head>
<title>注册</title>
<style type="text/css">
#title {
	font-size: 30px;
	color: blue;
}

#form {
	position: absolute;
	top: 100px;
	left: 600px;
}

#tr {
	cellmargin-top: 200px;
}
#red{
	color:red;
}
#reds{
	font-size:25px;
	color:red;
}
#center{
	text-align:center;
}
</style>
</head>
<body>
	<div id="form">
		<form method="post" action="registAction.jsp">
			<table border=0 cellspacing="10%" cellpadding="25">
				<tr id="title">
					<td colspan=2 id="center">欢迎注册</td>
				<tr>
				<tr>
					<td id="tr"><span id="red">*</span>用户名：</td>
					<td><input type="text" width=10 height=20 size=20 name="user" /></td>
				</tr>
				<tr>
					<td><span id="red">*</span>密码：</td>
					<td><input type="password" name="psw" /></td>
				</tr>
				<tr>
					<td><span id="red">*</span>重输密码：</td>
					<td><input type="password" name="repsw" /></td>
				</tr>
				<tr>
					<td>性别：</td>
					<td><input type="radio" name="sex" value="boy" checked="true" />男
						<input type="radio" name="sex" value="girl" />女</td>
				</tr>
				<tr>
					<td>出生时间</td>
					<td>年<select name="year">
							<option value="0">请选择
							<option value="2000">2000
							<option value="2001">2001
							<option value="2002">2002
							<option value="2003">2004
							<option value="2005">2005
					</select> 月<select name="month">
							<option value="0">--
							<option value="1">1
							<option value="2">2
							<option value="3">3
							<option value="4">4
							<option value="5">5
					</select> 日<select name="day">
							<option value="0">--
							<option value="1">1
							<option value="2">2
							<option value="3">3
							<option value="4">4
							<option value="5">5
					</select>
					</td>
				</tr>
				<tr>
					<td><span id="red">*</span>电子邮箱</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td colspan=2><span id="reds">*为必填项</span></td>
				</tr>
				<tr>
					<td colspan=2 id="center">
						<input type="image" src="regist.jpg" width=200 height=70 name="submit"
						onClick="document.formName.submit()" />
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>

</html>
