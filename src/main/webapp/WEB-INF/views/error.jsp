<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.cg.bta.busapplication.exceptions.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>
		<c:if test="${not empty errorInfo}">
		exception raised at ${errorInfo.url}<br>
		and the message is : ${errorInfo.message}
		</c:if>
	</h2>
</body>
</html>