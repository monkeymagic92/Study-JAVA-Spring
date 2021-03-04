<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	.container {
		margin-left: 750px;
		margin-top: 350px;
		 
	}
</style>
<body>
	<div class="container">
		<form id="frm" action="/auth/mail" method="post">
			<input type="email" name="email" placeholder="이메일 입력">
			<input type="submit" value="전송">
		</form>
	</div>
</body>
</html>