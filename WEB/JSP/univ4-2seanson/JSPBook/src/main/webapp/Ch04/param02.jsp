<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Action Tag</title>
</head>
<body>
	<h3>param 액션 태그</h3>
	<jsp:include page="param01_data.jsp">
	<jsp:param name="title" value="<%=java.net.URLEncoder.encode("오늘의 날짜와 시각") %>" />
	<jsp:param name="date" value="<%= java.util.Calendar.getInstance().getTime() %>" />
	</jsp:include>
	<p>Java Server Page
</body>
</html>