<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*"%>
    <%@ page import="com.techlabs.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee</title>
</head>
<body>
<%List<Employee> emp1 = (List)request.getAttribute("employeeList");
out.print("<h3>Count is "+emp1.size());
%>



</body>
</html>