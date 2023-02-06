<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">
<title>Insert title here</title>
</head>
<body>
	<h1>${detailView.stockItemName }</h1>
	<table>
		<thead>
			<th>종목코드</th>
			<th>시장구분</th>
			<th>소속부</th>
			<th>대비</th>
			<th>등락률</th>
			<th>시가</th>
			<th>고가</th>
			<th>저가</th>
			<th>종가</th>
			<th>거래량</th>
			<th>거래대금</th>	
		</thead>
		<tbody>
			<tr>
				<td>${detailView.itemCode }</td>
				<td>${detailView.marketSegmentation }</td>
				<td>${detailView.presence }</td>
				<td>${detailView.prepare }</td>
				<td>${detailView.fluctuationRate }</td>
				<td>${detailView.openPrice }</td>
				<td>${detailView.highPrice }</td>
				<td>${detailView.lowPrice }</td>
				<td>${detailView.closingPrice }</td>
				<td>${detailView.tradingVolume }</td>
				<td>${detailView.transactionAmount }</td>
			</tr>
		</tbody>
	</table>
</body>
</html>