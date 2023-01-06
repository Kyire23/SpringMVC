<%--
  Created by IntelliJ IDEA.
  User: Kyire
  Date: 2023/1/4
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br><br>
<h2>测试不同请求方式</h2>
<form action="${pageContext.request.contextPath}/req.action" method="get">
    <input type="submit" value="提交">
</form>

<h2>1.单个数据提交</h2>
<form action="${pageContext.request.contextPath}/one.action">
    姓名:<input name="myname"><br>
    年龄:<input name="age"><br>
    <input type="submit" value="提交">
</form>

<h2>2.对象封装数据提交</h2>
<form action="${pageContext.request.contextPath}/tow.action">
    姓名:<input name="name"><br>
    年龄:<input name="age"><br>
    <input type="submit" value="提交">
</form>

<h2>3.动态占位符提交</h2>
<a href="${pageContext.request.contextPath}/three/张胜男/22.action">
    动态提交
</a>

<h2>4.参数名称不一致解决方案</h2>
<form action="${pageContext.request.contextPath}/four.action">
    姓名:<input name="name"><br>
    年龄:<input name="age"><br>
    <input type="submit" value="提交">
</form>

<h4>5.手工提取数据</h4>
<form action="${pageContext.request.contextPath}/five.action">
    姓名:<input name="name"><br>
    年龄:<input name="age"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
