<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Action Tag</title>
</head>
<body>
	<jsp:useBean id="bean" class = "ch04.com.dao.Calculator" />
	<%
	int m = bean.process(5);
	out.println("5�� 3���� : " + m );
	%>
</body>
</html>