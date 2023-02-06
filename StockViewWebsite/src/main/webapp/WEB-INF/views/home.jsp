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

<!-- �˻�â  -->
<input type="" 




<!-- �ֽ� ��ȸ  -->
<table>
	<thead>
		<th>�����ڵ�</th>
		<th>�����</th>
		<th>���屸��</th>
		<th>�����</th>
		<th>�ð�</th>
		<th>����</th>
		<th>�ŷ���</th>
		<th>�ŷ����</th>
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