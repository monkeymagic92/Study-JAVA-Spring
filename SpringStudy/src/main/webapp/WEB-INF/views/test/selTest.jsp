<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<table>
			<tr>
				<td>제목</td>
				<td>내용</td>
			</tr>
			<c:forEach items="${list}" var="item">
			<tr>
				<td>${item.title}</td>
				<td>${item.ctnt}</td>
			</tr>
			</c:forEach>
		</table>
	</div>	
	<button type="button" onclick="moveToWrite()">글쓰기</button>
	
<script>
	function moveToWrite() {
		location.href="/test"
	}	
</script>
</body>
</html>