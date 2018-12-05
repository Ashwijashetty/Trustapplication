<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Bus Details Page</title>
<style type="text/css">
.error{
	color: red;
	font-style: italic;
}
</style>
</head>
<body>

	<div align="center">

		<table>
			<form:form method="post" modelAttribute="busdetails" action="details">

				<tr>
					<td><form:label path="busId">Bus ID</form:label></td>
					<td><form:input path="busId" required="required"
							pattern="[1-9]{1}[0-9]{3}"
							title="Bus ID should contain exactly 4 digits" /> <form:errors
							path="busId" /></td>
				</tr>
				<tr>
					<td><form:label path="busTravelName">Bus Travel Name</form:label></td>
					<td><form:input path="busTravelName" /> <form:errors
							path="busTravelName" cssClass="error" /></td>
				</tr>

				<tr>
					<td><form:label path="source">Source</form:label></td>
					<td><form:input path="source" /> <form:errors
							path="source" cssClass="error"/></td>
				</tr>

				<tr>
					<td><form:label path="destination">Destination</form:label></td>
					<td><form:input path="destination" /> <form:errors
							path="destination" cssClass="error"/></td>
				</tr>
				<tr>
					<td><form:label path="totalSeats">Total Seats</form:label></td>
					<td><form:input path="totalSeats" required="required"
							pattern="^[1-9]\\d*$"
							title="seats should not contain negative values or zero" /> <form:errors
							path="totalSeats" /></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Add Details"></td>
				</tr>
			</form:form>
		</table>
	</div>
</body>
</html>