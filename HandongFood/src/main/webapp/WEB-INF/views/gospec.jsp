<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세부사항 Form</title>
</head>
<body>

   <h1>세부사항</h1>
   <form:form commandName="boardVO" method="POST" action="../specok">
      <form:hidden path="sid" />
      <table id="edit">
         <tr>
            <td>가게명:</td>
            <td><form:input path="name" /></td>
         </tr>
         <tr>
            <td>카테고리:</td>
            <td><form:input path="category" /></td>
         </tr>
         <tr>
            <td>주소:</td>
            <td><form:input path="address" /></td>
         </tr>
         <tr>
            <td>url:</td>
            <td><form:input path="url" /></td>
         </tr>
         <tr>
            <td>사진:</td>
            <td><form:input path="photo" /></td>
         </tr>
         <tr>
            <td>별점:</td>
            <td><form:input path="average" /></td>
         </tr>
         <tr>
            <td>메뉴:</td>
            <td><form:textarea cols="50" rows="5" path="menu" /></td>
         </tr>
      </table>
      <input type="button" value="게시판으로 돌아가기" onclick="history.back()" />
   </form:form>
</body>
</html>