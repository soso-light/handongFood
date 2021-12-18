<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Post</title>
</head>
<body>
	<!-- name, category, address, photo, average, url, menu -->
	<h1>가게 추가</h1>
	<form action="addok" method="post">
		<table id="edit">
			<tr>
				<td>가게명:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>카테고리:</td>
				<td><select name="category" id="category">
						<option value="">--Please choose a category--</option>
						<option value="한식">한식</option>
						<option value="일식">일식</option>
						<option value="양식">양식</option>
						<option value="중식">중식</option>

				</select></td>
			</tr>
			<tr>
				<td>주소:</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>URL:</td>
				<td><input type="text" name="url" /></td>
			</tr>
			<tr>
				<td>사진:</td>
				<td><input type="file" name="photo"
					accept="image/png, image/jpeg"></td>
			</tr>

			<tr>
				<td>별점:</td>
				<td><input type="text" name="average" /></td>
			</tr>
			<tr>
				<td>메뉴:</td>
				<td><textarea cols="50" rows="5" name="content"></textarea></td>
			</tr>
		</table>
		<button type="button" onclick="location.href='list'">목록보기</button>
		<button type="submit">등록하기</button>
	</form>

</body>
</html>