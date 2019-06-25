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

<%
List<Customer> list = (List)request.getAttribute("customers");
out.println("<table>");
out.println("<tr><th>ID</th><th>firstName</th><th>lastName</th><th>Balance</th><th>DOB</th><th>Card Type</th><th>EDIT</th><th>DELETE</th></tr>");
%>
<% for(Customer customer : list){%>
	<tr>
	<td><%=customer.getId()%></td>
	<td><%=customer.getFirstName()%></td>
	<td><%=customer.getLastName() %></td>
	<td><%=customer.getBalance() %></td>
	<td><%=customer.getDob() %></td>
	<td><%=customer.getCard() %></td>
	<td><button><a href="editCustomer?ID=<%=customer.getId()%>">EDIT</a></button></td>
	<td><button><a href="deleteCustomer?ID=<%=customer.getId()%>">Delete</a></button></td>
	</tr>
	
<% } %>
</table>	

 <button><a href="LogoutController">Log Out</a></button>

</body>
</html>