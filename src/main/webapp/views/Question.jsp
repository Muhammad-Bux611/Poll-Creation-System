<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create Poll Question</title>

    <!-- Bootstrap 5 CSS CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="card shadow p-4 w-100" style="max-width: 600px;">
            <h3 class="text-center mb-4">Create New Poll Question</h3>

            <form action="addQuestion" method="post">
                <div class="mb-3">
                    <label for="ques" class="form-label">Write the Question</label>
                    <input type="text" class="form-control" id="ques" name="questions" placeholder="Enter your question" required>
                </div>

                <div class="mb-3">
                    <input type="text" class="form-control" name="option1" placeholder="Option 1" required>
                </div>

                <div class="mb-3">
                    <input type="text" class="form-control" name="option2" placeholder="Option 2" required>
                </div>

                <div class="mb-3">
                    <input type="text" class="form-control" name="option3" placeholder="Option 3" required>
                </div>

                <div class="mb-3">
                    <input type="text" class="form-control" name="option4" placeholder="Option 4" required>
                </div>

                <div class="d-grid">
                    <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </form>
        </div>
    </div>

    <!-- Bootstrap 5 JS CDN (optional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
