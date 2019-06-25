<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Customer</title>

</head>
<body>
	<%
		String id = request.getParameter("ID");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String dob = request.getParameter("dob");
		String balance = request.getParameter("balance");
		if (firstName == null || lastName == null || dob == null) {
			firstName = "";
			lastName = "";
			dob = "";
		}
	%>
	
			<form action="addCustomer" method="post">
				first
				Name : <input type="text" name="firstName" value="<%=firstName%>">
				last Name : <input type="text" name="lastName"
					value="<%=lastName%> "> balance:<input type="number"
					name="balance" value="<%=balance%>"> dob : <input
					type="date" name="dob" value="<%=dob%>"> CardType: <input
					type="radio" name=myradio value="CREDIT" />CREDIT <input
					type="radio" name=myradio value="DEBIT" />DEBIT <input
					type="submit">
			</form>



</body>
</html>