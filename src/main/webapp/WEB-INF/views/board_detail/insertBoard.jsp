<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>구인 게시글 작성 페이지</title>
    <link href="../resources/css/post_detail.css" rel="stylesheet" type="text/css">
    <script src="../resources/js/post_detail.js?ver=3" type="text/javascript"></script>
</head>
<body>
	<%@ include file="/WEB-INF/views/basic/header.jsp" %>
	
	<hr><br>

	<div class="post-wrap">
		<form method="post" action="postInsert.do" onsubmit="return checkValidation();">
			<div class="post-header">
				<h1 class="post-header-top">글 작성</h1>
				<div class="post-header-bottom">
					<input type="text" id="title" placeholder="제목을 입력해주세요" name="board_title" maxlength=30>
					
					<div class="category-wrap">
						<div class="category-content">
							<div class="category-title">맵 분류</div>
							<select class="category-map" id="category-map" name="game_map">
								<option value="none">선택해주세요.</option>
								<option value="소환사의 협곡">소환사의 협곡</option>
								<option value="칼바람 나락">칼바람 나락</option>
							</select>
						</div>
						
						<div class="category-content">
							<div class="category-title">게임 분류</div>
							<select class="category-game" id="category-game" name="game_mode">
								<option value="none">선택해주세요.</option>
								<option value="일반">일반</option>
								<option value="솔로 랭크">솔로 랭크</option>
								<option value="자유 랭크">자유 랭크</option>
							</select>
						</div>
						
						<div class="category-content">
							<div class="category-title">모집인원</div>
							<select class="category-cru-max" id="category-cru-max" name="cru_max">
								<option value="none">선택해주세요.</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
							</select>
						</div>
					</div>
				</div>
			</div>
			<div class="post-content">
				<div class="textarea-wrap"><textarea id="content" name="board_text"></textarea></div>
			</div>
			<div class="button-wrap">
				<button class="post-submit detail-big-btn" type="submit">작성</button>
				<button class="post-discard detail-big-btn" type="button" onclick="confirmDiscard()">취소</button>
			</div>
		</form>
	</div>
	
	<hr>
	
	<%@ include file="/WEB-INF/views/basic/footer.jsp" %>
</body>
</html>