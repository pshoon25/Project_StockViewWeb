<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
				<tr>
					<td>아이디<td>
					<td><input name="memberId"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input name="memberPw" type="password"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input name="memberName"></td>
				</tr>
				<tr>
					<td>생년월일</td>
					<td><input name="memberBirth" maxlength="8"></td>
				</tr>	
			</tbody> 
			<tbody>
				<c:forEach var="check" items="${allViews }">
					<tr>
						<td>${check.stockItemName }</td>
						<td><input type="checkbox" name="stockItemName" value="${check.stockItemName }"></td>
					</tr>
				</c:forEach>
			</tbody>
			<input type="submit" value="가입완료">
		</table>
	</form> 
</body>
</html>