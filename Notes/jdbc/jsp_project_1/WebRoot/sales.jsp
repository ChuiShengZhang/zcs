<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>sales</title>
    <style>
    	#title{
    		width:300px;
    		height:30px;
    		text-align:center;
    		background-color:#3CF;
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
    	#body{
    		height:10px;
    	}
    </style>
  </head>
  
  <body id="body">
	<div id="title">
  		促销商品
  	</div>
 	<div>
    	<span>
    		<img src="image\2.png">
    	</span>
    	<span id="left" align="center">
    		电脑<br>
    		<div id="red"><s>原价￥9999</s></div>
    		<div>￥7999</div>
    		<input type="button" value="详情" />
    	</span>
    </div>
     	<div>
    	<span>
    		<img src="image\2.png">
    	</span>
    	<span id="left" align="center">
    		电脑<br>
    		<div id="red"><s>原价￥588</s></div>
    		<div>￥419</div>
    		<input type="button" value="详情" />
    	</span>
    </div>
     	<div>
    	<span>
    		<img src="image\2.png">
    	</span>
    	<span id="left" align="center">
    		电脑<br>
    		<div id="red"><s>￥2799</s></div>
    		<div>￥2399</div>
    		<input type="button" value="详情" />
    	</span>
    </div>
  </body>
</html>
