<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
  <head>
    <title>index_top</title>
    <style>
    	#xp{
    		width:100px;
    		height:30px;
    		background-color:#3CF;
    	}
    	#more{
    		float:right;
    	}
    	#right{
    		float:left;
    	}
    	#left{
    		position:absolute;
    		float:right;
    	}
    	#red{
    		color:red;
    	}
    	#pageright{
    		width:400px;
    	}
    </style>
  </head>
  
  <body>
  <span id="right">
  	<jsp:include page="login.jsp" flush="true"></jsp:include>
  	<jsp:include page="notice.jsp" flush="true"></jsp:include>
  </span>
  <span>
    <table width="75%">
    	<tr>
    		<td colspan="3"><span id="xp">新品上架</span><span id="more"><a href="#" >更多>></a></span></td>
    	</tr>
    	<tr>
    		<td>
    			<span>
    				<img src="image\2.png">
    			</span>
    			<span id="left">
    				电脑<br><br>
    				<div id="red">￥1599</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    		<td>
    			<span>
    				<img src="image\2.png">
    			</span>
    			<span id="left">
    				电脑<br><br>
    				<div id="red">￥569</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    		<td>
    			<span>
    				<img src="image\2.png">
    			</span>
    			<span id="left">
    				电脑<br><br>
    				<div id="red">￥199</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    	</tr>
    	<tr><td><br></td></tr>
    	<tr>
    		<td>
    			<span>
    				<img src="image\2.png">
    			</span>
    			<span id="left">
    				电脑<br><br>
    				<div id="red">￥888</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    		<td>
    			<span>
    				<img src="image\2.png">
    			</span>
    			<span id="left">
    				电脑<br><br>
    				<div id="red">￥666</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    		<td>
    			<span>
    				<img src="image\2.png">
    			</span>
    			<span id="left">
    				电脑<br><br>
    				<div id="red">￥398</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    	</tr>
    </table>
    </span>
  </body>
</html>
