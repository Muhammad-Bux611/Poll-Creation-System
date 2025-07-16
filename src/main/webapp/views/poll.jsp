<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Dashboard</title>

    <!-- Bootstrap 5 CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container d-flex flex-column justify-content-center align-items-center vh-100">
        <div class="text-center">
            <h2 class="mb-4">Admin Panel</h2>

            <div class="d-grid gap-3 col-8 mx-auto">
                <a href="poll" class="btn btn-primary btn-lg">Create Poll</a>
                <a href="showPolesToAdmin" class="btn btn-info btn-lg">Show Polls</a>
                <a href="showUser" class="btn btn-success btn-lg">Show Voted Users</a>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS (optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
