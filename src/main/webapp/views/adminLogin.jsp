<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Poll | Login as Admin</title>
    
    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="card shadow p-4" style="width: 100%; max-width: 400px;">
            <h3 class="text-center mb-4">Admin Login</h3>

            <form action="login" method="post">
                <div class="mb-3">
                    <label for="mail" class="form-label">Email address</label>
                    <input type="email" class="form-control" id="mail" name="email" placeholder="name@gmail.com" required>
                </div>

                <div class="mb-3">
                    <label for="pin" class="form-label">Password</label>
                    <input type="password" class="form-control" id="pin" name="password" placeholder="8-12 characters" required>
                </div>

                <div class="d-grid gap-2">
                    <button type="submit" class="btn btn-primary">Login</button>
                </div>

                <div class="mt-3 text-center">
                    <span>Don't have an account?</span>
                    <a href="registerAdmin">Register</a>
                </div>
            </form>
        </div>
    </div>

    <!-- Bootstrap JS (optional, for interactivity) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
