<%--
  Created by IntelliJ IDEA.
  User: 芋头
  Date: 2018/6/2
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../../../css/base/reset.css" />
    <link rel="stylesheet" type="text/css" href="../../../../css/common/Title&Sidebar.css" />
    <link rel="stylesheet" type="text/css" href="../../../../css/manager/beauty/ActivitiesImg_change.css" />
    <script type="text/javascript" src="../../../../js/common/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="../../../../js/common/Title&Sidebar.js"></script>
    <script type="text/javascript" src="../../../../js/manager/beauty/ActivitiesImg_Change.js"></script>
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
        <li><a href="">轮播图管理</a></li>
        <li><a href="">公告管理</a></li>
        <li><a href="">部门成员管理</a></li>
        <li><a href="">日历管理</a></li>
        <li><a href="lessonFiles.html">课件管理</a></li>
        <li><a href="">活动管理</a></li>
        <li><a href="ActivitiesImg.html">风采图片管理</a></li>
        <li><a href="registration_form.html">报名人员管理</a></li>
        <li><a href="Suggestions.html">提交意见查看</a></li>
    </ul>
</div>
<div id="change_title">
    <span>图片修改</span>
</div>
<div id="load_table">
    <form action="${website}beauty/update/${beauty.id}" method="post" enctype="multipart/form-data">
        <table id="simgle_photo">
            <tr>
                <th>标题</th>
                <th>图片</th>
                <th>状态</th>
                <th>操作</th>
            </tr>
            <tr>
                <td>
                    <input type="text" name="name" value="${beauty.name}"/>
                </td>
                <td>
                    <img name="path" src="${beauty.path}" width="230px" height="180px"/>
                    <input type="text" name="path" value="${beauty.path}" hidden/>
                </td>
                <td>
                    <input type="text" name="status" value="${beauty.status}" id="status" disabled="disabled"/>
                </td>
                <td>
                    <button type="submit">确认</button>
                    <a href="/beauty/list"><button type="button">取消</button></a>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
