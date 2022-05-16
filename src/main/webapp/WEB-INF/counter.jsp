<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>You have visited http://your_server 
	<c:out value="${count}"/> times.</p>
	<a href="http://localhost:8080/your_server">Test another visit?</a>
	<a href="http://localhost:8080/counter2">counter+2</a>
</body>
</html>