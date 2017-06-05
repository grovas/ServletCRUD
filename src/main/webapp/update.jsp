<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Worker" %>
<%@ page import="controller.WorkersDAO" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="main.css">
    <title>Edytuj dane pracownika:</title>
</head>
<body>
    <div class="container">
        <h1>Tutaj edytujemy pracownika</h1>
    </div>
    <form class="form-inline" action="update" method="post">
        <input type="hidden" name="id" value="${worker.id}"/>
        <div class="form-group">
            <label> Imię: </label>
            <input class="form-control" type="text" value="${worker.firstName}" name="firstName"/>
        </div>
        <div class="form-group">
            <label> Nazwisko: </label>
            <input class="form-control" type="text" value="${worker.lastName}" name="lastName"/>
        </div>
        <div class="form-group">
            <label> Wiek: </label>
            <input class="form-control" type="text" value="${worker.age}" name="age"/>
        </div>
        <div class="form-group">
            <label> Pensja: </label>
            <input class="form-control" type="text" value="${worker.salary}" name="salary"/>
        </div>
        <button class="btn btn-default" type="submit"
                onclick="return confirm('Czy na pewno auktualnić dane pracownika o id ${worker.id}?')">
            Zapisz
        </button>
    </form>
</body>
</html>