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
	request.setCharacterEncoding("utf-8");
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
	<td><%=request.getParameter("day") %></td>
	<td><%=request.getParameter("expenses") %></td>
	<td><%=request.getParameter("memo") %></td>
	<td><%=request.getParameter("payment") %></td>
	<td><%=request.getParameter("withdwaral") %></td>
	</tr>
</table>
<a href="/Household_account_book/MainHab">一覧画面</a>
<a href="/Household_account_book/ListView_Servlet">一覧画面</a>
</body>
</html>