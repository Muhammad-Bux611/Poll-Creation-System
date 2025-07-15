<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
   <%@page isELIgnored="false" %>
   <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
these are some method :
<br>
<c:forEach items="${polls }" var="item">
	<form action="getUser">
	<label ><b>Question#${item.questionId}:</b>
	<b>${item.questions }</b>
	</label>
	<br>
	<input type="hidden" value="${item.questionId}" name="questionId">
	<input type="hidden" value="${email }" name="userEmail">
	<%-- <input type="hidden" value="${item } " name="question"> --%>
	<input type="radio" name="voteOption" value="${item.option1 }">${item.option1 }
	<input type="radio" name="voteOption" value="${item.option2 }">${item.option2 }
	<input type="radio" name="voteOption" value="${item.option3 }">${item.option3 }
	<input type="radio" name="voteOption" value="${item.option4 }">${item.option4 }
	<br>
	Creation Date:<b><label>${item.date }</label></b>
	<%
	String role =(String)request.getAttribute("user") ;
	if(role!=null){
	if(role.equals("admin")){
		%>
		<br>
		<a href="deletePoll?questionId=${item.questionId}">Delete Poll</a>
		<br>
		<a href="updatePoll?questionId=${item.questionId }"> Update Poll</a>
		<%
	}
	}else{
	%>
	<br>
	<input type="submit" value="Vote">
	</form>
<!-- 	<a href="vote">Vote</a> -->
	<br>
	<%} %>
	</c:forEach>
</body>
</html>