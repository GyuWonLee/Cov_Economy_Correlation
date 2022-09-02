<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
request.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>



<style>
.cls1 {
	text-decoration: none;
}

.cls2 {
	text-align: center;
	font-size: 30px;
	display: block;
}
</style>

</head>

<body>
	<h1> test below </h1>
	<form name = "articleForm" method = "post" action = "{contextPath}/test/">
	<table>
	<tbody>
	
	<c:forEach var = "data" items = "${data}" varStatus = "datas">
		<tr align = "center">
			<td width = "5%">${datas.count}</td>
			<td width = "10%">${data.year2012}</td>
			<td width = "10%">${data.year2013}</td>
			<td width = "10%">${data.year2014}</td>
			<td width = "10%">${data.year2015}</td>
			<td width = "10%">${data.year2016}</td>
			<td width = "10%">${data.year2017}</td>
			<td width = "10%">${data.year2018}</td>
			
				<td align="left" width="35%">
			<span style="padding-right : 30px"> </span>
			</td>
		</tr>
		</c:forEach>
		
	</tbody>
	</table>
	</form>
</body>
</html>