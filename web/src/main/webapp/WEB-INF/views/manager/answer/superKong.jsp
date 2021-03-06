<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../../../css/base/reset.css" />
    <link rel="stylesheet" type="text/css" href="../../../../css/common/Title&Sidebar.css" />
    <link rel="stylesheet" type="text/css" href="../../../../css/manager/answer/Suggestions.css" />
    <script type="text/javascript" src="../../../../js/common/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="../../../../js/common/Title&Sidebar.js"></script>
    <script type="text/javascript" src="../../../../js/manager/answer/Suggestions.js"></script>
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
                    <img src="../../../../img/e" width="35px" height="35px" />
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
        <li><a href="lessonFiles.html">课件管理</a></li>
        <li><a href="${website}activity/list">活动管理</a></li>
        <li><a href="${website}beauty/list">风采图片管理</a></li>
        <li><a href="${website}entry/listAll">报名人员管理</a></li>
        <li><a href="${website}answer2/list1">提交意见查看</a></li>
    </ul>
</div>
<div id="Suggestions_title">
    <span>提交意见查看</span>
</div>
<div id="submit_suggestions">

    <table id="Suggestions_form">

        <tr>
            <th>序号</th>
            <th>意见</th>
            <th>回复</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${answer1List}"  var="answer2" varStatus="status">
            <tr>
                <td>${status.index+1}</td>
                <td>${answer2.inquiry_answer2}</td>
                <td>${answer2.inquiry_answer1}</td>
                <td>
                    <a href="${website}answer2/toUpdate/${answer2.id}"><button type="submit" title="点此修改或添加回复">回复</button></a>
                    <a href="${website}answer2/del1/${answer2.id}"><button type="submit">删除</button></a>
                </td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
