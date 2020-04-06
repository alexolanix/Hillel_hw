<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<jsp:include page="menu.jsp"/>

<form action="actorsNfilms" method="post">
    <input type="text" placeholder="filmQ" name="filmQ"/>
    <input type="submit" value="Find"/>
</form>
<c:if test="${not empty multyactors}">
    ${multyactors}

</c:if>


</body>
</html>
