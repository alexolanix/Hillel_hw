<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<fmt:setBundle basename="com.hillel.i18n.messages" />
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="menu.jsp"/>

<form action="delete" method="post">
    <input type="text" placeholder=<fmt:message key="title.age"/> name="age"/>
    <input type="submit" value=<fmt:message key="button.find"/>/>
</form>
</body>
</html>
