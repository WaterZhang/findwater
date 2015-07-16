<!DOCTYPE HTML>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/home.css">
<link rel="stylesheet" type="text/css" href="css/login.css">
<script type="text/javascript" src="script/jquery-1.11.3.min.js"></script>
<script>
$(document).ready(function(){
  $("p").click(function(){
    $(this).hide();
  });
});
</script>
</head>

<body class="page_login">
	<c:import url="header.jsp" />
	
	<div class="form_login">	
		<form action="/login.html" method="post">
			<div class="form_user input">
				<span class="icon"><i>用户名</i></span>
				<input type="text" name="username"/>
			</div>
			<div class="form_pass input">
				<span class="icon"><i>密码</i></span>
				<input type="password" name="password"/>
			</div>
			<div class="form_submit btn"><input type="submit" value="登陆"/></div>
		</form>
	</div>
	
	<p>如果您点击我，我会消失。</p>
	<p>点击我，我会消失。</p>
	<p>也要点击我哦。</p>
	
	<c:import url="footer.jsp" />
	
</body>


</html>