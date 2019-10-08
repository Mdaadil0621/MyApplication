<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IRCTC</title>
</head>
<body>
	<form:form action="showForm.htm" method = "Post" modelAttribute="ticket">
	<table>
		<tr>
			<td>Passenger Name</td>
			<td><form:input path="passengerName"/></td>
		</tr>
		<tr>
			<td>Source Station</td>
			<td><form:input path="sourceStation"/></td>
		</tr>
		<tr>
			<td>Destination</td>
			<td><form:input path="destinationStation"/></td>
		</tr>
		<tr>
			<td>Booking Date</td>
			<td><input type = "datetime-local" name ="bookinDate"></td>
		</tr>
		
		<tr>
			<td>Email</td>
			<td><form:input path="email"/></td>
		</tr>
		<tr>
		<td><input type="submit" value="Book Ticket"></td>
		</tr>
	
	</table>
	
	
	</form:form>
</body>
</html>