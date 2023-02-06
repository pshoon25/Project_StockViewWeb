<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>StockViewWeb</title>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>
<h1>
	StockViewWeb
</h1>

<!-- 검색창  -->
<form method="post">
	<table>
		<tr>
			<td><input name="stockItemName" placeholder="검색 종목명을 입력하세요."></td>
			<td><input type="submit" value="검색"></td>
		</tr>
	</table>
</form>

<table>
	<thead>
		<th>종목코드</th>
		<th>종목명</th>
		<th>시장구분</th>
		<th>등락률</th>
		<th>시가</th>
		<th>종가</th>
		<th>거래량</th>
		<th>거래대금</th>
	</thead>
	<tbody>
		<c:forEach var="search" items="${searchViews }">
			<tr>
				<td>${search.itemCode }</td>
				<td>${search.stockItemName }</td>
				<td>${search.marketSegmentation }</td>
				<td>${search.fluctuationRate }</td>
				<td>${search.openPrice }</td>
				<td>${search.closingPrice }</td>
				<td>${search.tradingVolume }</td>
				<td>${search.transactionAmount }</td>
			</tr>
		</c:forEach>
	</tbody>
	<tbody>
		<c:forEach var="view" items="${allViews }">
			<tr>
				<td>${view.itemCode }</td>
				<td>${view.stockItemName }</td>
				<td>${view.marketSegmentation }</td>
				<td>${view.fluctuationRate }</td>
				<td>${view.openPrice }</td>
				<td>${view.closingPrice }</td>
				<td>${view.tradingVolume }</td>
				<td>${view.transactionAmount }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>