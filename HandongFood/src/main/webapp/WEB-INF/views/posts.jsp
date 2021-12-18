<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList</title>
<style>
#list {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
#list td, #list th {
  border: 1px solid #ddd;
  padding: 8px;
  text-align:center;
}
#list tr:nth-child(even){background-color: #f2f2f2;}
#list tr:hover {background-color: #ddd;}
#list th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: center;
  background-color: #006bb3;
  color: white;
}
</style>
<script>
	function delete_ok(id){
		var a = confirm("정말로 삭제하겠습니까?");
		if(a) location.href='delete_ok/' + id;
	}
</script>
</head>
<body>
<h1>맛집게시판</h1>

<table id="list" width="90%">
<tr>
	<th>음식점</th>
	<th>category</th>
	<th>위치</th>
	<th>평점</th>
	<th>세부사항</th>
	<th>수정</th>
	<th>음식점 삭제</th>
</tr>
<c:forEach items="${list}" var="u">
	<tr>
		<td>${u.getName()}</td>
		<td>${u.getCategory()}</td>
		<td>${u.getAddress()}</td>
		<td>${u.getAverage()}</td>
		<td><a href="gospec/${u.sid}">go</a></td>
		<td><a href="editpost/${u.sid}">수정</a></td>
		<td><a href="javascript:delete_ok('${u.sid}')">삭제</a></td>
	</tr>
</c:forEach>
</table>
<br/><button type="button" onclick="location.href='add'">새글쓰기</button>
</body>
</html>