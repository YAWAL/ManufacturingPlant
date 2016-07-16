<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: VYA
  Date: 09.06.2016
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <sec:authorize access="isAnonymous()"> <a href="/login">Login</a> </sec:authorize>
    <sec:authorize access="isAuthenticated()">Hello, <a href="/myCabinet=${loginedUser.id}">${loginedUser.name}</a> <a href="/loguot">Logout</a> </sec:authorize>

    <h1>Заголовок</h1>
</body>
</html>
