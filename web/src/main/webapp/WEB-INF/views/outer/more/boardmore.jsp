<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/9/15
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../../../../css/base/reset.css">
    <link rel="stylesheet" type="text/css" href='../../../../css/common/public.css'>
    <link rel="stylesheet" type="text/css" href="../../../../css/outer/home/home page.css">
    <link rel="stylesheet" type="text/css" href="../../../../css/outer/more/more.css">
    <title>更多公告</title>
</head>
<body>
<div id="body">
    <!-----------公共部分logo------------>
    <div class="header">
        <div class="logo">
            <img src="../../../../img/common/1.jpg">
            <img src="../../../../img/common/2.jpg">
        </div>
        <div class="button">
            <div class="button_inner" id="btn1">
                <button id="network" type="button">内网</button>
            </div>

        </div>
    </div>
    <div class="nav">
        <ul>
            <li id="home_page">
                <a class="link" href="">首页</a>
            </li>
            <li class="mainmenu">
                <a class="link" href="">卓音简介</a>
            </li>
            <li class="mainmenu">
                <a class="link" href="">部门介绍</a>
                <dl>
                    <dd> <a href="">产品部</a></dd>
                    <dd> <a href="">前端部</a></dd>
                    <dd> <a href="">后端部</a></dd>
                </dl>
            </li>
            <li class="mainmenu">
                <a class="link" href="">卓音成就</a>
                <dl>
                    <dd> <a href="http://www.dsjyw.net/">东北高师就业联盟网</a></dd>
                    <dd> <a href="http://careers.nenu.edu.cn/">东师就业指导服务中心</a></dd>
                </dl>
            </li>
            <li class="mainmenu">
                <a class="link" href="">卓音纳新</a>
                <dl>
                    <dd> <a href="">报名</a></dd>
                </dl>
            </li>
        </ul>
    </div>
    <div id="title_announce_more">
    <div id="title_announce">
        <div class="level_main">
            <div class="theme"><span>公告</span>
            </div>
        </div>
        <c:forEach items="${boardList}"  var="board" varStatus="status">
            <div class="level_detail">
                <div class="announce_detail">
                    <div class="annnounce_left"><p class="announce_day">${board.day}</p></div>
                    <div class="annnounce_right"><p class="announce_month">${board.month}</p><p class="announce_year">${board.year}</p></div>
                    <span>${board.content}</span>
                </div>
            </div>
        </c:forEach>
    </div>
    </div>
    <!-----------底部部分详情------------>
    <div class="footer_block">
        <div class="footer" id="footer_logo">
            <img src="../../../../img/common/1.jpg">
        </div>
        <div class="footer footer_middle" id="footer_message">
            <p><span>版权所有©东北师范大学卓音工作室</span></p>
            <p><span>邮箱：webmaster@nenu.edu.cn</span></p>
            <p><span>地址：吉林省长春市南关区人民大街5268号</span></p>
        </div>
        <div class="footer" id="footer_wechat">
            <img src="../../../../img/common/14.jpg" >
            <div class="note">
                <p><span>&nbsp;&nbsp;&nbsp;卓音官方微信</span> </p>
            </div>
        </div>
    </div>
</div>
</body>
</html>
