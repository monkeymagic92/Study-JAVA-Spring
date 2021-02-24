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
		<form id="frm" action="/reg" method="post" onsubmit="return chk()">
			<input type="text" name="title" placeholder="제목" value="${item.title}">
			<input type="text" name="ctnt" placeholder="내용" value="${item.ctnt}">
			
			<input type="hidden" name="updResult" value="${item.i_board}">
			<input type="submit" value="${item.i_board == null ? '글등록' : '글수정'}">
		</form>
	</div>
<script>
	
	function chk() {
		if(frm.title.value.length == 0) {
			alert('제목을 입력해 주세요')
			frm.title.focus()
			return false;
		}
		
		if(frm.ctnt.value.length == 0) {
			alert('내용을 입력해 주세요')
			frm.ctnt.focus()
			return false;
		}
	}
</script>
</body>
</html>