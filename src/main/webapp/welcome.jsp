<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Worker" %>
<%@ page import="controller.WorkersDAO" %>
<%@ page import="controller.WelcomeServlet" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="main.css">
    <title>Welcome</title>
</head>
<body>
    <c:set var="emptyList" value="${emptyList}" />
    <c:if test="${ emptyList eq 'empty' }" >
        <h3>Lista jest pusta ... możesz dodawać</h3>
    </c:if>
    <c:if test="${ emptyList ne 'empty' }">
        <h3>No dobra udało się zalogować - program gotowy do pracy</h3>
    </c:if>
    <div class="container">
        <a href="/printall" class="btn btn-info" role="button">Lista pracowników</a>
        <a href="/insert" class="btn btn-info" role="button">Dodanie nowego pracownika</a>
        <a href="logout" class="btn btn-primary btn-warning active">Wyjście z programu</a>
    </div>

</body>
</html>