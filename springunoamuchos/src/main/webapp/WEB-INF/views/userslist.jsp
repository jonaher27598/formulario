<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Users List</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
	<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body>
	<div class="generic-container">
		<div class="panel panel-default">
			  <!-- Default panel contents -->
		  	<div class="panel-heading"><span class="lead">List of Users </span></div>
			<table class="table table-hover">
	    		<thead>
		      		<tr>
				        <th>Nombre</th>
				        <th>Apellido</th>
				        <th>Edad</th>
				        
					</tr>
		    	</thead>
	    		<tbody>
				<c:forEach items="${Alumno}" var="user">
					<tr>
						<td>${user.nombre}</td>
						<td>${user.apellido}</td>
						<td>${user.edad}</td>
						</tr>
				</c:forEach>
	    		</tbody>
	    	</table>
		</div>
	 	<div class="well">
	 		<a href="<c:url value='/newuser' />">Add New User</a>
	 	</div>
   	</div>
</body>
</html>