<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<style>
#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}
</style>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div align="left"> <button type="button" class="btn btn-danger">
		Number of contact <span class="badge"><s:property
				value="sizeOfList" /></span>
	</button> <button type="button" class="btn btn-danger"><a href="add">
	  Add to Contact</a>
	</button></div>
	
	<div>

	<table id="customers">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Number</th>
			<th>Email</th>
			<th>Action</th>
			<th>Delete</th>
		</tr>
		<s:iterator status="stat" value="contact">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="number" /></td>
				<td><s:property value="email" /></td>
				<td><s:a href="edit?id=%{id}"><button class="btn btn-primary glyphicon glyphicon-pencil"></button></s:a> </td>
				<td><s:a href="delete?id=%{id}"><button class="btn btn-danger glyphicon glyphicon-trash">Delete</button></s:a> </td>

			</tr>
		</s:iterator>
	</table>
	</div>
</body>
</html>