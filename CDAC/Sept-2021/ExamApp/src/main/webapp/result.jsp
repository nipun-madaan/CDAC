<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Congratulations on completing the exam!</h2>
<h3>You have scored : <%= session.getAttribute("score") %> marks</h3>
<h3><a href="logout">Logout</a></h3>
</body>
</html>