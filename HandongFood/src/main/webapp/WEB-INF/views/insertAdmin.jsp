<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	회원 가입
</h1>

<form action="insertok" method="post">
	userID:<input type="text" name="userid"><br>
	userName:<input type="text" name="username"><br>
	Password:<input type="password" name="password"><br>
	<input type="submit" value="SIGN_UP">
</form>
</body>
</html>
