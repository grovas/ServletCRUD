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
    <title>Dodaj Pracownika:</title>
</head>
<body>
    <div class="container">
        <h1>Tutaj możesz dodać nowego pracownika</h1>
    </div>
    <form class="form-inline" action="insert" method="post">
        <div class="form-group">
            <label> Imię: </label>
            <input class="form-control" type="text" name="firstName">
        </div>
        <div class="form-group">
            <label> Nazwisko: </label>
            <input class="form-control" type="text" name="lastName">
        </div>
        <div class="form-group">
            <label> Wiek: </label>
            <input class="form-control" type="text" name="age">
        </div>
        <div class="form-group">
            <label> Płaca: </label>
            <input class="form-control" type="text" name="salary">
        </div>
        <button class="btn btn-default" type="submit">
            Dodaj
        </button>
    </form>
</body>
</html>