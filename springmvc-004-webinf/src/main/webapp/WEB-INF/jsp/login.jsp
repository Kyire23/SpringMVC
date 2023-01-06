<%--
  Created by IntelliJ IDEA.
  User: Kyire
  Date: 2023/1/5
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>登录</h2>
<form action="${pageContext.request.contextPath}/login">
    姓名:<input name="name"><br>
    密码:<input type="password" name="pwd"><br>
    <input type="submit" value="登录">
</form><br><br>
${msg}
</body>
</html>
