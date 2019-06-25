<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
<h1 align="center">Beer Recommendation JSP </h1>
<p>
<%
List styles = (List)request.getAttribute("styles");
Iterator it = styles.iterator();
while(it.hasNext()){
	out.println("<br> try: "+it.next());
}

%>



</body>
</html>