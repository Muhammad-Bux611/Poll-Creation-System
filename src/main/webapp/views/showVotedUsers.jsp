<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Users</title>
</head>
<body>
	
	<c:forEach items="${votedUsers }" var="votedUser">
	Voter Name : <b>${votedUser.getUser().getUserName()}</b>
	<br>
	Questions : <b>${votedUser.getQuestion().getQuestions() }</b>
	<br>
	option: <b>${votedUser.getVoteOption() }</b>
	<br>
	date of Creation of Poll : <b>${votedUser.getQuestion().getDate() }</b>
	
	<br>
	
	<a href="deleteVote?voteId=${votedUser.getVoteId() }">Delete Vote</a>
	<br>
	</c:forEach>
	
</body>
</html>