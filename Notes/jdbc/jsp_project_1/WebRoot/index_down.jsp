<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>index_down</title>
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
    </style>
  </head>
  
  <body>
  	<span id="right" width="30%">
  	<jsp:include page="sales.jsp" flush="true"></jsp:include>
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
    				<div id="red">￥499</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    		<td>
    			<span>
    				<img src="image\2.png">
    			</span>
    			<span id="left">
    				电脑<br><br>
    				<div id="red">￥589</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    		<td>
    			<span>
    				<img src="image\2.png">
    			</span>
    			<span id="left">
    				电脑<br><br>
    				<div id="red">￥789</div><br>
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
    				<div id="red">￥1899</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    		<td>
    			<span>
    				<img src="image\2.png">
    			</span>
    			<span id="left">
    				电脑<br><br>
    				<div id="red">￥148</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    		<td>
    			<span>
    				<img src="image\2.png">
    			</span>
    			<span id="left">
    				电脑<br><br>
    				<div id="red">￥99</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    	</tr>
    	<tr>
    		<td>
    			<span>
    				<img src="image\2.png">
    			</span>
    			<span id="left">
    				电脑<br><br>
    				<div id="red">￥89</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    		<td>
    			<span>
    				<img src="image\2.png">
    			</span>
    			<span id="left">
    				电脑<br><br>
    				<div id="red">￥9999</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    		<td>
    			<span>
    				<img src="image\2.png">
    			</span>
    			<span id="left">
    				电脑<br><br>
    				<div id="red">￥899</div><br>
    				<input type="button" value="详情" />
    			</span>
    		</td>
    	</tr>
    </table>
    </span>
  </body>
</html>
