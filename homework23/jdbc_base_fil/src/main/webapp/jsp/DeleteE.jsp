<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="menu.jsp"/>

<form action="delete" method="post">
    <input type="text" placeholder="age" name="age"/>
    <input type="submit" value="Find"/>
</form>
</body>
</html>
