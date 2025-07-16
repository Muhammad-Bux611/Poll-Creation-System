<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Show Users</title>

    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container py-5">
        <h2 class="text-center mb-4">Voted Users</h2>

        <c:forEach items="${votedUsers}" var="votedUser">
            <div class="card mb-3 shadow-sm">
                <div class="card-body">
                    <h5 class="card-title">Voter: ${votedUser.user.userName}</h5>
                    <p class="card-text">
                        <strong>Question:</strong> ${votedUser.question.questions}<br>
                        <strong>Selected Option:</strong> ${votedUser.voteOption}<br>
                        <strong>Poll Created On:</strong> ${votedUser.question.date}
                    </p>
                    <a href="deleteVote?voteId=${votedUser.voteId}" class="btn btn-danger">Delete Vote</a>
                </div>
            </div>
        </c:forEach>

        <c:if test="${empty votedUsers}">
            <div class="alert alert-info text-center">No users have voted yet.</div>
        </c:if>
    </div>

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
