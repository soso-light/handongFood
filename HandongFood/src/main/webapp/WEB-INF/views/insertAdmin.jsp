<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<style>
		#header{
			color: blue;
			text-align:center;
		}
	</style>
</head>
<body>
<div style='width:100%;text-align:center;padding-top:100px'> 
<h1 id="header">Somoon 회원가입</h1>
<img src="../img/HandongLogo.png" width="250" height="250"/>
</div>

<div style="width:100%;text-align:center;padding-top:100px">
<form action="insertok" method="post">
	userID:<input type="text" name="userid"><br>
	userName:<input type="text" name="username"><br>
	Password:<input type="password" name="password"><br>
	<input type="submit" value="SIGN_UP">
</form>
</div>

</body>
</html>
