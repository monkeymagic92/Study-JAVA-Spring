<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>인증이 완료되었습니다</h1>
	<button type="button" onclick="move()">사이트로 돌아가기</button>
	
<script>
	function move() {
		location.href="/auth/mail"
	}
</script>
</body>
</html>