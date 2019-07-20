<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<style>
td.tdErrorMessage {
	background-color: #CC9999; color: black;
}


</style>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<s:form action="login1" method="post">
<s:textfield name="username" label="Username"/>
<s:password name="password" label="Password"/>
<s:submit type="login1"/>
</s:form> 



</body>
</html>