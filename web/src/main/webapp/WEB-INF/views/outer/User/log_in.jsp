<%--
  Created by IntelliJ IDEA.
  User: 迁旧。
  Date: 2018/8/3
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="../../../../css/outer/User/login.css" />
    <script type="text/javascript" src="../../../../js/common/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="../../../../js/outer/User/login.js" charset="utf-8" ></script>
</head>
<body>
<div class="login">
    <div class="studio">东北师范大学卓音工作室</div>
    <form action="${website}/user/serUser" method="post">
        <div class="int">
            <label for="username">账&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：</label>
            <input type="text" name="userName" id="username" class="required" />
        </div>
        <div class="int">
            <label for="password">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
            <input type="password" class="required" name="userPassword" id="pwd" placeholder="请输入密码"/>
        </div>
        <div class="sub">
            <input type="submit" value="提交" id="send" />
        </div>
    </form>
</div>
</body>
</html>
