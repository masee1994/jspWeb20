<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function logoutProc(){
		location.href="./login/logoutProc.jsp";
	}
</script>


</head>
<body>
<%
if(session.getAttribute("sessionID")==null){	//로그인안됨
	response.sendRedirect("login/loginForm.jsp");
}else{	//로그인상태
%>
	<%=session.getAttribute("sessionID") %>님 로그인 되었습니다. <br /><br />
	<input type = "button" value="logout" onclick="logoutProc();" />
	
<% 	
}

%>
</body>
</html>