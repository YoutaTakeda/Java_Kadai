<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="DTO.Hab" %>
    <%@ page import="DAO.HabDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>一覧画面</title>
</head>
<body>
	<%
	ArrayList<Hab> list = HabDAO.getAll();
	%>
	<table border="1">
		<tr>
			<th>日</th>
			<th>費目</th>
			<th>メモ</th>
			<th>収入</th>
			<th>支出</th>
		</tr>
		<%for(Hab str : list){ %>
		<tr>
			<td><%=str.getDay() %></td>
			<td><%=str.getExpenses() %></td>
			<td><%=str.getMemo() %></td>
			<td><%=str.getPayment() %></td>
			<td><%=str.getWithdrawal() %></td>
		</tr>
		<%} %>
	</table>
	<a href="/Household_account_book/MainHab">一覧画面</a>
	<a href="/Household_account_book/ListView_Servlet">一覧画面</a>
</body>
</html>