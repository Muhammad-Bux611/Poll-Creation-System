<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Polls</title>

    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container py-5">
    <h2 class="mb-4 text-center">Available Polls</h2>

    <c:forEach items="${polls}" var="item">
        <div class="card mb-4 shadow-sm">
            <div class="card-body">
                <form action="getUser" method="post">
                    <h5 class="card-title">
                        <strong>Question #${item.questionId}:</strong> ${item.questions}
                    </h5>

                    <input type="hidden" value="${item.questionId}" name="questionId">
                    <input type="hidden" value="${email}" name="userEmail">

                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="voteOption" value="${item.option1}" id="opt1-${item.questionId}">
                        <label class="form-check-label" for="opt1-${item.questionId}">${item.option1}</label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="voteOption" value="${item.option2}" id="opt2-${item.questionId}">
                        <label class="form-check-label" for="opt2-${item.questionId}">${item.option2}</label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="voteOption" value="${item.option3}" id="opt3-${item.questionId}">
                        <label class="form-check-label" for="opt3-${item.questionId}">${item.option3}</label>
                    </div>
                    <div class="form-check mb-3">
                        <input class="form-check-input" type="radio" name="voteOption" value="${item.option4}" id="opt4-${item.questionId}">
                        <label class="form-check-label" for="opt4-${item.questionId}">${item.option4}</label>
                    </div>

                    <p><strong>Creation Date:</strong> ${item.date}</p>

                    <%
                        String role = (String) request.getAttribute("user");
                        if (role != null && role.equals("admin")) {
                    %>
                        <a href="deletePoll?questionId=${item.questionId}" class="btn btn-danger me-2">Delete Poll</a>
                        <a href="updatePoll?questionId=${item.questionId}" class="btn btn-warning">Update Poll</a>
                    <%
                        } else {
                    %>
                        <button type="submit" class="btn btn-success">Vote</button>
                    <%
                        }
                    %>
                </form>
            </div>
        </div>
    </c:forEach>

    <c:if test="${empty polls}">
        <div class="alert alert-info text-center">No polls available.</div>
    </c:if>
</div>

<!-- Bootstrap JS (Optional) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
