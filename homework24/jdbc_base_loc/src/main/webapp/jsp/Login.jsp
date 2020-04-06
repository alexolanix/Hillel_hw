<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<fmt:setBundle basename="com.hillel.i18n.messages" />
<html>
        <head>
                <title>Login</title>
        </head>
        <body>
                <jsp:include page="menu.jsp"/>
        <form action="login" method="post">
                <input type="text" placeholder=<fmt:message key="title.user"/> name="username"/>
                <input type="text" placeholder=<fmt:message key="title.pass"/> name="password"/>
                <input type="submit" value=<fmt:message key="menu.login"/> />
        </form>
                <c:if test="${not empty error}">
                        ${error}
                </c:if>
        </body>
</html>
