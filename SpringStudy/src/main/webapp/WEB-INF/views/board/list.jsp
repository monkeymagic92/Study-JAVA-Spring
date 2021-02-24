<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	tr:hover {
		cursor: pointer;
		background-color: grey;
	}
</style>
</head>
<body>
	
	<table>
		<tr>
			<td>pk</td>
			<td>제목</td>
			<td>날짜</td>
		</tr>
		<c:forEach items="${list}" var="item">
		<tr onclick="moveToDetail(${item.i_board})">
			<td>${item.i_board}</td>
			<td>${item.title}</td>
			<td>${item.r_dt}</td>
		</tr>
		</c:forEach>
	</table>
	
	<button type="button" onclick="moveToReg()">글등록</button>
	
	<div>
		<form action="/email" method="post">
			<input type="email" name="email" placeholder="이메일 입력">
			<input type="submit" value="전송">
		</form>
	</div>
	
	
<script>
	function moveToDetail(i_board) {
		location.href="/detail?i_board="+i_board
	}
	
	function moveToReg() {
		location.href="/reg";
	}
</script>
</body>
</html>