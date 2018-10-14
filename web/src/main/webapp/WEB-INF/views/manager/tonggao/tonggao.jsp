<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 终老。
  Date: 2018/8/2
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../../css/base/reset.css" />
    <link rel="stylesheet" type="text/css" href="../../css/common/Title&Sidebar.css" />
    <link rel="stylesheet" type="text/css" href="../../css/widget/lessonFiles.css" />
    <script type="text/javascript" src="../../js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="../../js/Title&Sidebar.js"></script>
    <script type="text/javascript" src="../../js/lessonFiles.js"></script>
</head>
<body>
<div id="title">
    <div id="title_words">
        <span>卓音工作室后台管理</span>
    </div>
    <div id="user">
        <ul>
            <li id="head_img">
                <a href="">
                    <img src="../../resource/img/ensure.png" width="35px" height="35px" />
                    <span>haha,欢迎您</span>
                </a>
            </li>
            <li>
                <a href="首页">
                    注销
                </a>
            </li>
        </ul>
    </div>
</div>
<div id="sidebar">
    <ul>
        <li></li>
        <li><a href="${website}lunbo/list">轮播图管理</a></li>
        <li><a href="${website}board/list">公告管理</a></li>
        <li><a href="${website}user/list">部门成员管理</a></li>
        <li><a href="">日历管理</a></li>
        <li><a href="${website}TongGao/getall1">课件管理</a></li>
        <li><a href="${website}activity/list">活动管理</a></li>
        <li><a href="${website}beauty/list">风采图片管理</a></li>
        <li><a href="${website}entry/listAll">报名人员管理</a></li>
        <li><a href="${website}answer2/list1">提交意见查看</a></li>
    </ul>
</div>

<div id="lessonFiles_title">
    <span>课件管理</span>
</div>
<div id="lesson">
    <table id="lesson_form">
        <tr>
            <th style="width: 50px;">序号</th>
            <th style="width: 400px;">课件名称</th>
            <th style="width: 200px;">操作</th>
        </tr>

        <c:forEach items="${list}" var="tg">
            <tr>
                <td>${tg.id}</td>
                <td>${tg.title}</td>
                <td>
                    <a href="/TongGao/downLoad?filename=${tg.file}"><button type="button">下载</button></a>
                    <a href="/TongGao/delTongGao?id=${tg.id}"><button type="button">删除</button></a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>


</body>
</html>
