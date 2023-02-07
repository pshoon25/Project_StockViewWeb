<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
	<table>
		<tbody>
			<tr>아이디</tr>
			<tr><input name="memberId"></tr>
			<tr>비밀번호</tr>
			<tr><input name="memberPw" type="password"></tr>
			<tr>이름</tr>
			<tr><input name="memberName"></tr>
			<tr>생년월일</tr>
			<tr><input name="memberBirth" maxlength="8"></tr>
		</tbody>  
		<%-- <tbody>
			<c:forEach var="search" items="${searchViews }">
			<tr>
				<input type="checkbox" name="${search.stockItemName }" value="${search.stockItemName }">
			</tr>
		</c:forEach>
		</tbody> --%>
		<input type="submit" value="가입완료">
	</table>
</form> 
</body>
</html>