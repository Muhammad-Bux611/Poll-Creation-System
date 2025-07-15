<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

			<form action="registerUser" method="post">
			<label for="name">
			Enter your name:
			</label>
			<input type="text" name="userName" id="name" placeholder="Your Name">
			<br>
			<br>
			<label for="caste">
			Enter your caste:
			</label>
			<input type="text" name="userCaste" id="caste" placeholder="Your caste">
			<br>
			<br>
			
			<label for="dateOfBirth">
			Enter your Date of Birth:
			</label>
			<input type="date" name="dob" id="dateOfBirth" placeholder="Date Of Birth">
			<br>
			<br>
			<label for="mail">
			Enter your Email Address:
			</label>
			<input type="email" name="email" id="mail" placeholder="name@gmail.com">
			<br>
			<br>
			<label for="pin">
			Enter your password:
			</label>
			<input type="password" name="password" id="pin" placeholder="8-12 character">
			<br>
			<br>
			
			<input type="submit" value="Register">
			
			</form>
			
		
		
</body>
</html>