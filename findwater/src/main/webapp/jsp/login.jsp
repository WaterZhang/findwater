<!DOCTYPE HTML>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/home.css">
<link rel="stylesheet" type="text/css" href="css/login.css">
<script type="text/javascript" src="script/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="script/login.js"></script>
</head>

<body class="page_login">
	<c:import url="header.jsp" />
	
	<div class="form_login">	
		
		<form id="login" action="login.html" method="post">
			
			<div class="form_user input">
				<span class="icon"><i>用户名</i></span>
				<input id="login_user" type="text" name="username"/>
			</div>
			<div id="empty_user" class="warning" style="display: none;">请输入账号</div>
			<c:if test="${USER_INVALID }">
				<div id="invalid_user" class="warning">账号不存在</div>
			</c:if>
			<div class="form_pass input">
				<span class="icon"><i>密码</i></span>
				<input type="password" name="password"/>	
			</div>
			<div id="empty_pass" class="warning" style="display: none;">请输入密码</div>
			<c:if test="${PASSWORD_INVALID }">
				<div id="invalid_pass" class="warning">密码错误</div>
			</c:if>
			<div id="login_submit" class="form_submit btn"><input type="submit" value="登陆"/></div>
		</form>
	</div>
	
	<c:import url="footer.jsp" />
	
</body>


</html>