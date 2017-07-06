<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Worker" %>
<%@ page import="dao.WorkersDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="main.css">
    <title>Lista pracowników</title>
</head>
<body>
<div class="container">
    <h3>Lista wszystkich pracowników</h3>
    <a href="/insert" class="btn btn-info" role="button">Dodanie nowego pracownika</a>
    <a href="logout" class="btn btn-primary btn-warning active">Wyjście z programu</a>
</div>
<div>
    <br />
    <br />
    <div class="container">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Id</th>
                <th>Imię</th>
                <th>Nazwisko</th>
                <th>Wiek</th>
                <th>Pensja</th>
                <th>Usunięcie pracownika</th>
            </tr>
            </thead>
            <tbody>
            <%-- <c:set var="listWorkers" value="${workers.size()}" />
             <c:if test="${listWorkers > 0}" >--%>
            <c:forEach var="i" begin="0" end="${workers.size()-1}" >
                <tr>
                    <td><c:out value="${workers.get(i).id}"/></td>
                    <td><a href="/update?id=${workers.get(i).id}"><c:out value="${workers.get(i).firstName}"/></a></td>
                    <td><c:out value="${workers.get(i).lastName}"/></td>
                    <td><c:out value="${workers.get(i).age}"/></td>
                    <td><c:out value="${workers.get(i).salary}"/></td>
                    <td>
                        <a href="/delete?id=${workers.get(i).id}" class="glyphicon glyphicon-trash"
                           onclick="return confirm('Czy na pewno usunąć pracownika o id ${workers.get(i).id}?')">
                            <i class="icon-align-center"/>
                        </a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>