<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Login | Poll System</title>

    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="card shadow p-4 w-100" style="max-width: 500px;">
            <h3 class="text-center mb-3">User Login</h3>
            <p class="text-center text-muted">This is the user address</p>

            <form action="loginUser" method="post">
                <div class="mb-3">
                    <label for="mail" class="form-label">Email Address</label>
                    <input type="email" class="form-control" id="mail" name="email" placeholder="name@gmail.com" required>
                </div>

                <div class="mb-4">
                    <label for="pin" class="form-label">Password</label>
                    <input type="password" class="form-control" id="pin" name="password" placeholder="8–12 characters" required>
                </div>

                <div class="d-grid">
                    <button type="submit" class="btn btn-success">Login</button>
                </div>

                <div class="mt-3 text-center">
                    <span>Don't have an account?</span>
                    <a href="register">Register</a>
                </div>
            </form>
        </div>
    </div>

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
