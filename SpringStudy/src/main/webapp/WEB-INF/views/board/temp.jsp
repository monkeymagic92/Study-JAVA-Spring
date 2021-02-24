<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.container {
		margin-top: 250px;
		margin-left: 800px;
	}
</style>
</head>
<body>
	<div class="container">
		<jsp:include page="/WEB-INF/views/${view}.jsp"></jsp:include>
	</div>
</body>
</html>