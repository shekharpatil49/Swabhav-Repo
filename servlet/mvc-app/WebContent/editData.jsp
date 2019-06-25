<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	   <%@ page import="java.util.*" %>
    <%@ page import= "com.techlab.model.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <% Customer  c = (Customer)request.getAttribute("customerOBJ"); %>
	<form action="addCustomer">
	
		first Name
		: <input type="text" name="firstName" value="<%=c.getFirstName()%>">
		last Name : <input type="text" name="lastName" value="<%=c.getLastName()%> ">
		balance:<input type="number" name="balance" value="<%=c.getBalance()%>">
		dob : <input type="date" name="dob" value="<%=c.getDob()%>">
		CardType: <input type="radio" name=myradio value="CREDIT" />CREDIT <input
			type="radio" name=myradio value="DEBIT" />DEBIT <input type="submit">
	</form>

</body>
</html>