<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="/jspf/menu.jspf"></jsp:include>
<c:forEach var="item" items="${movies}">
    <c:out value="${item}"/>
</c:forEach>
</body>
</html>
