<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session</title>
</head>
<body>
<%
 
    System.out.println("Adding attribute to Session...");
    request.getSession().setAttribute("test", "test");
    System.out.println("Adding attribute to Session completed!");
         
    System.out.println("Removing Session...");
    request.getSession().invalidate();
    System.out.println("Removing Session completed!");      
         
    out.println("Successfully adding and removing attributes from Session");    
%>

</body>
</html>