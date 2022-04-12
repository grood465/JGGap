<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ㅈㄱㅊㅇ - 전적과 구인을 한번에</title>
<meta content="Templines" name="author">
<meta content="TeamHost" name="description">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="HandheldFriendly" content="true">
<meta name="format-detection" content="telephone=no">
<meta content="IE=edge" http-equiv="X-UA-Compatible">
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<link rel="shortcut icon" href="resources/assets/img/favicon.png"
	type="image/x-icon">
<link rel="stylesheet" href="resources/assets/css/libs.min.css">
<link rel="stylesheet" href="resources/assets/css/main.css">
<link rel="stylesheet" href="resources/assets/css/login.css">
</head>

<body class="page-login">

	<!-- Loader-->
	<div id="page-preloader">
		<span class="spinner border-t_second_b border-t_prim_a"></span>
	</div>
	<!-- Loader end-->

	<div class="page-wrapper">

		<video muted autoplay loop>
			<source src="resources/assets/img/videoplayback.mp4" type="video/mp4">
		</video>

		<main class="page-first-screen">
			<div class="uk-grid uk-grid-small uk-child-width-1-2@s uk-flex-middle uk-width-1-1" data-uk-grid>
				<div>
					<div class="form-login">
						<div class="form-login__box">
							<div class="uk-heading-line uk-text-center">
								<span>ㅈㄱㅊㅇ</span>
							</div>
							<form action="#!">
								<div class="uk-margin">
									<input class="uk-input" type="text" placeholder="Username">
								</div>
								<div class="uk-margin">
									<input class="uk-input" type="password" placeholder="Password">
								</div>
								<div class="uk-margin">
									<a class="uk-button uk-button-danger uk-width-1-1" href="#">로그인</a>
								</div>
								<div class="uk-margin uk-text-center">
									<a href="#">또 잊어먹음?</a>
								</div>
								<hr>
							</form>
							<div class="uk-text-center">
								<span>계정이 없으신가요?</span>
								<button class="uk-margin-small-left" id="modal_on"
									onclick="init()">회원가입</button>
							</div>
						</div>
					</div>
				</div>
						<div class="form-login hidden" id="modal" style="margin-left: 0px;" />
						<div class="modal hidden" id="modal">
							<div style="display: flex; justify-content: flex-end;">
								<button class="modal-close" id="jsCloseBtn">X</button>
							</div>
						</div>
			</div>
		</main>
	</div>

	<script src="resources/assets/js/libs.js"></script>
	<script src="resources/assets/js/main.js"></script>
	<script src="resources/assets/js/index.js?ver=1"></script>
</body>

</html>
