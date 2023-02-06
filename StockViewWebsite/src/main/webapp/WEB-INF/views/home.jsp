<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<html>
<head>
	<title>StockViewWeb</title>
	<meta charset="EUC-KR">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>
<h1>
	StockViewWeb
</h1>

<!-- 검색창  -->
<input type="" 




<!-- 주식 조회  -->
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