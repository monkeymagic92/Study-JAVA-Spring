<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	
	.heartBlack {
		color: black;
		cursor: pointer;
	}
	
	.heartRed {
		color: red;
		cursor: pointer;
	}
	
</style>
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
	<br><br><br><br>
	<hr>
	<div>
		<h3>chk값</h3>
		<br>
		<h3>${item.chk}</h3>
	</div>
	
	<%--
		검정색일떄는 insLike
		빨간색일때는 delLike
	 --%>
	 
	<div id="likeBox">a : </div>
		
<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>	
<script>
	var abc = 0

	function moveToList() {
		location.href="/";
	}

	function moveToDel(i_board) {
		location.href="/del?i_board="+i_board
	}
	
	function moveToReg(i_board) {
		location.href="/reg?i_board="+i_board
	}
	
	function heartBox() {
		
		var heartChk = `${item.chk}` 
		var i_board = `${item.i_board}`
		var a;
		var heart = document.createElement('span')
		
		if(heartChk == 0) {
			
			var chk = 1
			
			heart.setAttribute('class', 'heartBlack')
			heart.onclick = function() {
				a = insLike(i_board, chk);
				console.log('a : ' + a);
			}
			
		} else {
			
			var chk = 0
			heart.setAttribute('class', 'heartRed')
			heart.onclick = function() {
				a = delLike(i_board, chk);
				console.log('a : ' + a);
			}
		}
		heart.innerText = '♥'
		if(a == 1) {
			console.log('a값 1임')
			heart.setAttribute('class', 'heartRed')
		} else {
			console.log('a값 2임')
			heart.setAttribute('class', 'heartBlack')
		}
		
		likeBox.append(heart)
				
	}
	heartBox()
	
	
	function insLike(i_board, chk) {
		
		console.log('ㄱ : ' + i_board)
		console.log('ㄴ : ' + chk)
		
		axios.post('/like/insLike',  {
			
			i_board : i_board,
			chk : chk
			
			
			
		}).then(function(res) {
			console.log('resdata값 : ' + res.data)
			var abc = res.data
						
		})
		return 1
	}
	
	
	// 좋아요 취소 빨 -> 검
	function delLike(i_board, chk) {
		
		
		axios.post('/like/delLike',  {
			
			i_board : i_board,
			chk : chk
		
		
		}).then(function(res) {
			console.log('resdata값 : ' + res.data)
			var abc = res.data
			
			
		})
		return 2
	}
	
	
	
	

</script>
</body>
</html>