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

<form action="actorsNfilms" method="post">
    <input type="text" placeholder=<fmt:message key="title.quantity"/> name="filmQ"/>
    <input type="submit" value=<fmt:message key="button.find"/>/>
</form>
<c:if test="${not empty multyactors}">
    ${multyactors}

</c:if>


</body>
</html>
