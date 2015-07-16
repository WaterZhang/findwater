<!DOCTYPE HTML>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/home.css">
<link rel="shortcut icon" type="image/x-icon" href="image/favicon.ico">
<title>寻找水世界</title>
</head>
<body class="page_home">
	<c:import url="header.jsp" />
	
	<div class="main">
		<div>
			<div id="content_box" class="">
				<c:if test="${ empty articles}">
					<div class="content">
						<div class="content_title">
							<div>
							<h2 class="">${defaultArticle.title }</h2>
							<span class="content_date">${defaultArticle.dateStr }</span>
							</div>
						</div>
						<div class="content_text">
							${ defaultArticle.contentSub } ...
						</div>
						
					</div>
				</c:if>
				
				<c:if test="${not empty articles }">
					<c:forEach var="acticle" items="articles">
						<div class="content">
							<div class="content_title">
								<div>
								<h2 class="">${acticle.title }</h2>
								<span class="content_date">${acticle.dateStr }</span>
								</div>
							</div>
							<div class="content_text">
								${ acticle.contentSub } ...
							</div>
							
						</div>
					</c:forEach>
				</c:if>
				
			</div>
		</div>
		<div>
			<div class="right_nav">
				这是导航栏部分
			</div>
		</div>
		
	</div>
	
	<c:import url="footer.jsp" />
	
</body>

</html>