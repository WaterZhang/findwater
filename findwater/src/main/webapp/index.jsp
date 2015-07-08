<!DOCTYPE HTML>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://ckeditor.com" prefix="ckeditor" %>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="css/index.css">
	</head>
	<body>
		<form action="article.html" method="post">
			<div class="marginbotom10">
				<label for="editor1">Title:</label>
				<input id="articleTitle" name="title" type="text" size="96" class="" value="">
			</div>
			<div>
				<textarea cols="80" id="editor1" name="content" rows="10"></textarea>
			</div>
			
			<p>
			<input type="submit" value="Submit" />
			</p>
		</form>
	<ckeditor:replace replace="editor1" basePath="/findwater/ckeditor/" />
	</body>	
</html>
