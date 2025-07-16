<%@page import="com.poll.Model.EmbaddedClass"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Poll | Registration</title>

    <!-- Bootstrap 5 CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="card shadow p-4 w-100" style="max-width: 600px;">
            <h3 class="text-center mb-4">Register for Poll System</h3>

            <form action="register" method="post">
                <div class="mb-3">
                    <label for="name" class="form-label">Enter your Name</label>
                    <input type="text" class="form-control" id="name" name="name" placeholder="Your Name" required>
                </div>

                <div class="mb-3">
                    <label for="caste" class="form-label">Enter your Caste</label>
                    <input type="text" class="form-control" id="caste" name="lastName" placeholder="Your Caste" required>
                </div>

                <div class="mb-3">
                    <label for="dateOfBirth" class="form-label">Enter your Date of Birth</label>
                    <input type="date" class="form-control" id="dateOfBirth" name="dob" required>
                </div>

                <div class="mb-3">
                    <label for="mail" class="form-label">Enter your Email Address</label>
                    <input type="email" class="form-control" id="mail" name="email" placeholder="name@gmail.com" required>
                </div>

                <div class="mb-4">
                    <label for="pin" class="form-label">Enter your Password</label>
                    <input type="password" class="form-control" id="pin" name="password" placeholder="8–12 characters" required>
                </div>

                <div class="d-grid">
                    <button type="submit" class="btn btn-primary">Register</button>
                </div>
            </form>
        </div>
    </div>

    <!-- Bootstrap 5 JS (optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
