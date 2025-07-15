<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		this is the user address:
		<br>
	<form action="loginUser" method="post">
		<label for="mail" >Enter the email address:</label>
		<br>
		<br>
		<input type="email" id="mail" name="email" placeholder="name@gmail.com"  required>
		<br>
		<br>
		<label for="pin">Enter your password:</label>
		<br>
		<br>
		<input type="password" id="pin" name="password" placeholder="8-12 characters" required>
		<br>
		<br>
		<input type="submit" value="Login">
			<label id="link">Register?</label>
		<a id="link" href="register">Register</a>
		</form>
		


</body>

</html>