<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	img, label{
		display:inline-block;
	}
	label{width: 130px}
	button{font-size:15px}
	#header{
		color: blue;
	}
</style>
</head>
<body>
<div style='width:100%;text-align:center;padding-top:100px'> 
<img src="../img/HandongLogo.png" width="300" height="250"/>
<h1 id="header">Somoon 한동 맛집 추천 사이트에 오신 것을 환영합니다!</h1>
</div>

<div style="width:100%;text-align:center;padding-top:100px">
<form method="post" action="loginOk">
<div><label>User ID: </label><input type="text" name="userid"/></div>
<div><label>Password: </label><input type="password" name="password"/></div>
<br>
<button type="submit">login</button>
<input type="button" name="register" value="회원가입" onClick="location.href='insertAdmin'">
</form>
</div>
</body>
</html>