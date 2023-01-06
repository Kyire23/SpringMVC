<%--
  Created by IntelliJ IDEA.
  User: Kyire
  Date: 2023/1/4
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.5.1.js"></script>
</head>
<body>
<br><br>
<a href="javascript:showStu()">访问服务器返回学生集合</a>
<div id="mydiv">等待服务器返回数据</div>

<script type="text/javascript">
    function  showStu(){
        //使用jQuery封装ajax方法发送请求
        $.ajax({
            url:"${pageContext.request.contextPath}/list.action",
            type:"get",
            dataType:"json",
            success:function (stuList){
                var s = "";
                $.each(stuList,function (i,stu){
                    s+=stu.name + "---" +stu.age+"<br>";
                });
                //回显数据
                $("#mydiv").html(s);
            }
        })
    }
</script>
</body>
</html>
