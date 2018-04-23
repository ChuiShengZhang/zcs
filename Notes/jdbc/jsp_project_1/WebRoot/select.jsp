<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>select</title>
    <style>
    	#table{
    		background-color:#3CF;
    	}
    </style>
  </head>
  
  <body>
  <table width="100%" id="table">
    <tr>
    	<td>	
    		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		类型：
   			<select>
   				<option>-商品类型-</option>
   				<option>厨卫系列</option>
   				<option>电脑专区</option>
   				<option>电视机系列</option>
   				<option>洗衣机系列</option>
   			</select>
   		</td>
   		<td>
   			商品名:<input type="text" name="proname" />
   			<input type="submit" name="submit" value="搜索" />
    	</td>
    	</tr>
   </table>
  </body>
</html>
