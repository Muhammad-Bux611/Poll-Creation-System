<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update the poll</title>
</head>
<body>
		<form action="updated" method="post">
		<label for="ques">
		Write the Question
		</label>
		<br>
		<input type="hidden" name="QuestionId" value="${question.questionId }">
		<input type="text" name="questions" placeholder="Enter Question" value="${question.questions }" > 
		<br>
		<br>
		<input type="text" name="option1" placeholder="option 1"  value="${question.option1 }">
		<br>
		<input type="text" name="option2" placeholder="option 2" value="${question.option2 }" >
		<br>
		<input type="text" name="option3" placeholder="option 3" value="${question.option3 }">
		<br>
		<input type="text" name="option4" placeholder="option 4" value="${question.option4 }">
		<br>
		<input type="submit" value="Submit">
		
		</form>
		
</body>
</html>