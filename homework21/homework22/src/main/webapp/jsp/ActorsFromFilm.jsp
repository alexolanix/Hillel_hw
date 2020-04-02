<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Actors</title>
</head>

<body>
<jsp:include page="/jspf/menu.jspf"></jsp:include>

<form action="actors" method="post">
    <input type="text" placeholder="filmID" name="filmID"/>
    <input type="submit" value="Find"/>
</form>
    <c:if test="${not empty actors}">
        ${actors}

    </c:if>


</body>
</html>
    