<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import ="DTO.Hab" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録内容確認!</title>
</head>
<body>
<%
	Hab show = (Hab)request.getAttribute("Insert");
%>
<table border="1">
	<tr>
	<th>年月日</th>
	<th>費目</th>
	<th>メモ</th>
	<th>収入</th>
	<th>出費</th>
	</tr>
	<tr>
	<td><%=show.getDay() %></td>
	<td><%=show.getExpenses() %></td>
	<td><%=show.getMemo() %></td>
	<td><%=show.getPayment() %></td>
	<td><%=show.getWithdrawal() %></td>
	</tr>
</table>
</body>
</html>