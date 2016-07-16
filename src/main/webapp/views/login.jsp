<%--
  Created by IntelliJ IDEA.
  User: VYA
  Date: 09.06.2016
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form method="post" action="/myCabinet" modelAttribute="loginpage">
        <form:label path="email">Email</form:label>
        <form:input path="email"/>
        <form:label path="password">Password</form:label>
        <form:input path="password"/>
        <form:button>Login</form:button>
    </form:form>
</body>
</html>
