<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<fmt:setBundle basename="com.hillel.i18n.messages" />
<html>
<head>
    <meta charset="UTF-8">
    <title>Head</title>
</head>
<body>
<form action="local" method="post">
    <select name="lang">
        <option value="en_US"><fmt:message key="title.eng"/></option>
        <option value="ru_RU"><fmt:message key="title.ru"/></option>
    </select>
    <input type="submit" value=<fmt:message key="button.lang"/>/>
</form>
<ul>
    <li><a href="films"><fmt:message key="menu.Findnewfilms"/></a></li>
    <li><a href="actors"><fmt:message key="menu.Findactorsfromfilms"/></a></li>
    <li><a href="actorsdirectors"><fmt:message key="menu.Findactorswhowasdirectors"/></a></li>
    <li><a href="actorsNfilms"><fmt:message key="menu.Findactorsfilmedinnfilms"/></a></li>
    <li><a href="delete"><fmt:message key="menu.delete"/></a></li>
    <c:choose>
        <c:when test="${not empty user}">
            <br>
            <fmt:message key="title.greating"/>, ${user.first_name} ${user.last_name}!
            <li><a href="logout"><fmt:message key="menu.logout"/></a></li>
        </c:when>
        <c:otherwise>
            <li><a href="login"><fmt:message key="menu.login"/></a></li>
        </c:otherwise>
    </c:choose>
</ul>


</body>
</html>
