<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<script type = "text/javascript">
	function checkLogin(){
		var form = document.loginForm;
		if(form.id.value ==""){
			alert("아이디를 입력해주세요.");
			form.id.focus();
			return false;
		}
		else if(form.passwd.value ==""){
			alert("비밀번호를 입력해주세요.");
			form.passwd.focus();
			return false;
		}
		form.submit();
	}
</script>




<title>Validation</title>
</head>
<body>
	<form name = "loginForm" action = "validation_process.jsp">
	<p>아이디 : <input type = "text" name = "id">
	<p>비밀번호 : <input type = "password" name = "passwd">
	<p><input type = "button" value = "전송" onclick = "checkLogin()">
	</form>
</body>
</html>