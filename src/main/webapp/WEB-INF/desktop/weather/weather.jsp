<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>weather.jsp</title>
</head>
<body>
	<hr>
		<h1>날씨 정보 조회 결과</h1>
	<hr>
	<table border="1" style="border-collapse: collapse;">
		<c:forEach var="c" items="${weather.forcecasts}">
			<tr><td>${c.low}</td>
			<td>${c.high}</td>
			<td>${c.date}</td></tr>
		</c:forEach>
	</table>
	
<%-- 	${requestScope.weather.current.temperature}<br> --%>
<%-- 	${requestScope.weather.current.skycode}<br> --%>
<%-- 	${requestScope.weather.current.skytext}<br> --%>
	
<%-- 	${requestScope.weather.forcecasts[1].low}<br> --%>
<%-- 	${requestScope.weather.forcecasts[1].high}<br> --%>
<%-- 	${requestScope.weather.forcecasts[1].date}<br>	 --%>
</body>
</html>