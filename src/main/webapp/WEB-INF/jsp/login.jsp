<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/12
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form id="dl" action="${pageContext.request.contextPath}/login">
   用户名： <input type="text" id="username" name="username" value=""><br>
    密&nbsp&nbsp&nbsp&nbsp码：<input type="password" id="password" name="password" value=""><br>
    <input type="submit" value="登录">
</form>

</body>
</html>
