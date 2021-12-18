<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>

   <h1>Edit Form</h1>
   <form:form commandName="boardVO" method="POST" action="../editok">
      <form:hidden path="sid" />
      <table id="edit">
         <tr>
            <td>가게명:</td>
            <td><form:input path="name" /></td>
         </tr>
         <tr>
            <td>카테고리:</td>
            <td><form:select path="category" id="category">
                  <option value="">--Please choose a category--</option>
                  <option value="한식">한식</option>
                  <option value="한식">한식</option>
                  <option value="양식">양식</option>
                  <option value="중식">중식</option>

            </form:select></td>
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
            <td><input type="file" name="photo"
               accept="image/png, image/jpeg"/></td>
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
      <input type="submit" value="수정하기" />
      <input type="button" value="취소하기" onclick="history.back()" />
   </form:form>
</body>
</html>