<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calendar.jsp</title>
<script type="text/javascript">
	var year;
	var month;
	var date;

	function changeListener() {
		//alert(this.value);
		var calc = new Date(year.value, month.value-1 + 1, 1);
		calc.setDate(calc.getDate() - 1);
// 		alert("date = " + calc.toLocaleString());
		
		var options="";
		for(var i=0; i<calc.getDate(); i++) {
			options += "<option>" + (i+1) + "일</option>\n";
		}
// 		alert(options);
		date.innerHTML = options;
		
		var calendar="<tr><th>일</th><th>월</th><th>화</th><th>수</th><th>목</th><th>금</th><th>토</th></tr><tr>";
		
		calc = new Date(year.value, month.value-1, 1);
		for(var i=0; i<calc.getDay(); i++) {
			calendar += "<td></td>";
		}
		var month1 = calc.getMonth();
		while(month1 == calc.getMonth()) {
			if(calc.getDay() == 0) {
				calendar += "</tr>";
			}
			calendar += "<td>" + calc.getDate() + "</td>";
			if(calc.getDay() == 6) {
				calendar += "</tr>";
			}
			calc.setDate(calc.getDate() + 1);
		}

// 		alert(calendar);
		result.innerHTML = calendar;
		
	}

	window.onload = function() {
		year = document.querySelector("select[name=year]");
		month = document.querySelector("select[name=month]");
		date = document.querySelector("select[name=date]");
		
		year.onchange = changeListener;
		month.onchange = changeListener;
	};
</script>
</head>
<body>
<hr>
<h1>Calendar</h1>
<hr>
<%
	Date current = new Date();
	pageContext.setAttribute("current", current);
	
	Date calc = new Date(current.getYear(), current.getMonth() + 1, 1);
	calc.setDate(calc.getDate() - 1);
	pageContext.setAttribute("calc", calc);
%>

<input name="year" type="range" min="2000" max="2100" value="2015">
<input name="year" type="number" min="2000" max="2100" value="2015">
<hr>

<select name="year">
	<c:forEach var="year" begin="2000" end="2020">
		<c:if test="${year == current.year + 1900}">
			<option value="${year}" selected="selected">${year} 년도</option>
		</c:if>
		<c:if test="${year != current.year + 1900}">
			<option value="${year}">${year} 년도</option>
		</c:if>
	</c:forEach>
</select>
<select name="month">
	<c:forEach var="month" begin="1" end="12">
		<c:if test="${month == current.month + 1}">
			<option value="${month}" selected="selected">${month}월</option>
		</c:if>
		<c:if test="${month != current.month + 1}">
			<option value="${month}">${month}월</option>
		</c:if>
	</c:forEach>
</select>
<select name="date">
	<c:forEach var="date" begin="1" end="${calc.date}">
		<c:if test="${date == current.date}">
			<option value="${date}" selected="selected">${date}일</option>
		</c:if>
		<c:if test="${date != current.date}">
			<option value="${date}">${date}일</option>
		</c:if>
	</c:forEach>
</select>

<div style="border: 1px solid red; height: 150px;">
	<table id="result" border="1" style="border-collapse: collapse;">
	</table>
</div>

</body>
</html>