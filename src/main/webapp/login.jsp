+<%@ page contentType="text/html;charset=UTF-8" language="java" %>
+<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="main.css">
    <title>CRUD Login</title>
</head>
<body>
    <div class="container">
        <h1>Witamy w systemie zarządzania pracownikami</h1>
        <h3>Zaloguj się, aby kontynuować</h3>
    </div>
    <div>
        <form class="form-inline" action="login" method="post">
            <div class="form-group">
                <label> Użytkownik: </label>
                <input class="form-control" type="text" name="username">
            </div>
            <div class="form-group">
                <label> Hasło: </label>
                <input class="form-control" type="password" name="password">
            </div>
            <button class="btn btn-default" type="submit">
                Zaloguj się
            </button>
            <div style="color:red"><c:out value="${error}" /></div>
        </form>
    </div>
</body>
</html>
