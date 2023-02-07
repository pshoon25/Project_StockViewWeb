<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>
<table>
	<form method="post">
		<tbody>
			<tr><h5>아이디</h5></tr>
			<tr><input name="memberId"></tr>
			<tr><h5>비밀번호</h5></tr>
			<tr><input name="memberPw" type="password"></tr>
			<tr>
				<td><input type="submit" value="로그인"></td>
				<td><a href="signup">회원가입</a></td>
			</tr>
		</tbody>
	</form>
</table>
</body>
</html>