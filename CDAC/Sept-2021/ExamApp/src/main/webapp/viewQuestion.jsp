<%@page import="com.cdac.model.Option"%>
<%@page import="java.util.List"%>
<%@page import="com.cdac.model.Question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CalculateScoreServlet">
<%
	Question q = (Question) session.getAttribute("currentQs");
	List<Option> ops = q.getOptions();
%>
	<h1><%= q.getQuestion() %></h1>
<%
	int no = 0;
	for(Option op : ops) {
%>
		<h3><input type="radio" name="op" value="<%= no++ %>" /><%= op.getOption() %></h3>
<%
	}
%>
<!-- <a href="QuestionLoaderServlet">Next Question</a>  -->
<button type="submit">Next Question</button>
</form>
</body>
</html>