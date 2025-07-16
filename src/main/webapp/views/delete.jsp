<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Vote | Poll Creation System</title>

    <!-- Bootstrap 5 CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="card shadow p-4 text-center" style="max-width: 500px; width: 100%;">
            <h3 class="mb-3 text-danger">Delete Vote</h3>
            <p class="mb-4">Are you sure you want to delete this vote? This action cannot be undone.</p>

            <form action="deleteVote" method="post">
                <!-- You can pass hidden values here if needed -->
                <!-- Example: <input type="hidden" name="voteId" value="${vote.id}"> -->

                <div class="d-flex justify-content-between">
                    <a href="viewVotes" class="btn btn-secondary">Cancel</a>
                    <button type="submit" class="btn btn-danger">Delete</button>
                </div>
            </form>
        </div>
    </div>

    <!-- Bootstrap 5 JS CDN (optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
