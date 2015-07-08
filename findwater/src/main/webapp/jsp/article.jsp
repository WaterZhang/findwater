<!DOCTYPE HTML>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<html>
<script type="text/javascript"></script>
<body>
	<div class="main">
		<div class="article">
			<div id="title" class="article_title">${article.title}</div>
			<div id="content" class="article_content">	
				${article.content }	
			</div>
		</div>
	</div>
</body>
</html>