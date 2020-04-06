<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Head</title>
</head>
<body>
<ul>
    <li><a href="films">Find new films</a></li>
    <li><a href="actors">Find actors from films</a></li>
    <li><a href="actorsdirectors">Find actors who was directors</a></li>
    <li><a href="actorsNfilms">Find actors filmed in n films</a></li>
    <li><a href="delete">Delete films elder n years</a></li>
    <c:choose>
        <c:when test="${not empty user}">
            <br>
            Salam, ${user.first_name} ${user.last_name}!
            <li><a href="logout">Logout</a></li>
        </c:when>
        <c:otherwise>
            <li><a href="login">Login</a></li>
        </c:otherwise>
    </c:choose>
</ul>


</body>
</html>
