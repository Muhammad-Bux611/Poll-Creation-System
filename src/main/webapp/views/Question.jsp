<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="addQuestion" method="post">
		<label for="ques">
		Write the Question
		</label>
		<br>
		<input type="text" name="questions" placeholder="Enter Question" > 
		<br>
		<br>
		<input type="text" name="option1" placeholder="option 1" >
		<br>
		<input type="text" name="option2" placeholder="option 2" >
		<br>
		<input type="text" name="option3" placeholder="option 3" >
		<br>
		<input type="text" name="option4" placeholder="option 4" >
		<br>
		<input type="submit" value="Submit">
		
		</form>
</body>
</html>