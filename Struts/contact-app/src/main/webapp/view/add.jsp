<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add Form</h1>
<s:form action="addForm" method="post">
<s:textfield name="name" label="Name"/>
<s:textfield name="number" label="Number"/>
<s:password name="email" label="Email"/>
<s:submit type="addForm"/>
</s:form> 
</body>
</html>