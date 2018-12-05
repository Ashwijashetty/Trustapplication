<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>
		<div align="center">

			Bus Details Added are
			<table>
				<tr>
					<td>Bus ID :</td>
					<td>${busdetails.busId}</td>
				</tr>
				<tr>
					<td>Bus Travel Name :</td>
					<td>${busdetails.busTravelName}</td>
				</tr>
				<tr>
					<td>Source :</td>
					<td>${busdetails.source}</td>
				</tr>
				<tr>
					<td>Destination :</td>
					<td>${busdetails.destination}</td>
				</tr>
				<tr>
					<td>Total Seats :</td>
					<td>${busdetails.totalSeats}</td>
				</tr>

			</table>
		</div>
	</h2>
</body>
</html>