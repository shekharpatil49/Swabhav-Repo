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

<h1>Edit Contact</h1>
<s:form action="editForm" method="post">
<s:textfield name="name" label="Name"/>
<s:textfield name="number" label="Number"/>
<s:textfield name="email" label="Email"/>
<s:submit type="editForm"/>
</s:form> 

</body>
</html>