<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>pk : ${item.i_board}</p>
	<p>제목 : ${item.title}</p>
	<p>내용 : ${item.ctnt}</p>
	<p>날짜 : ${item.r_dt}</p>
	
	
	<button type="button" onclick="moveToList()">리스트</button>
	<br><br>
	<button type="button" onclick="moveToDel(${item.i_board})">삭제</button>
	<br><br>
	<button type="button" onclick="moveToReg(${item.i_board})">수정</button>
	
<script>
	function moveToList() {
		location.href="/";
	}

	function moveToDel(i_board) {
		location.href="/del?i_board="+i_board
	}
	
	function moveToReg(i_board) {
		location.href="/reg?i_board="+i_board
	}
</script>
</body>
</html>