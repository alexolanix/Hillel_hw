<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
        <head>
                <title>Login</title>
        </head>
        <body>
                <jsp:include page="menu.jsp"/>
        <form action="login" method="post">
                <input type="text" placeholder="username" name="username"/>
                <input type="text" placeholder="password" name="password"/>
                <input type="submit" value="login"/>
        </form>
                <c:if test="${not empty error}">
                        ${error}
                </c:if>
        </body>
</html>
