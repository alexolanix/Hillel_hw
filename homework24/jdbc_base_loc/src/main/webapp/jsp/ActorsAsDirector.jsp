<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Actors_Directors</title>
</head>
<body>
<jsp:include page="menu.jsp"/>
<c:forEach var="item" items="${directors}">
    <c:out value="${item}"/>
</c:forEach>
</body>
</html>
