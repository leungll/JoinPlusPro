<%--
  Created by IntelliJ IDEA.
  User: 迁旧。
  Date: 2018/9/26
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../../../../css/common/public.css">
    <link rel="stylesheet" type="text/css" href="../../../../css/outer/User/intrduction_department_achievement.css">
    <title>产品部</title>
</head>
<body>
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
            <a class="link" href="/activity/list2">首页</a>
        </li>
        <li class="mainmenu">
            <a class="link" href="/activity/introduction">卓音简介</a>
        </li>
        <li class="mainmenu">
            <a class="link" href="" >部门介绍</a>
            <dl>
                <dd> <a href="/user/show1">产品部</a></dd>
                <dd> <a href="/user/show2">前端部</a></dd>
                <dd> <a href="/user/show3">后端部</a></dd>
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
                <dd> <a href="entry.jsp">报名</a></dd>
            </dl>
        </li>
    </ul>
</div>
<div class="introduction_content">
    <div class="block_1_1">
        <div class="title">基本介绍</div>
        <div class="text_pic1">
            <div class="text" class="text_pic_in" id="text2">
                <p><span>&nbsp;&nbsp; &nbsp; &nbsp; 产品部作为工作室的“指挥部”，主要负责老师及技术部之间
							的沟通和网页原型设计，还有工作室的文化建设与制度制定，推微信，写策划，做表格，组织日常
							会议和大小活动，哪里工作室需要，哪里就有产品活跃的身影。</span></p>
            </div>
            <div class="pic" class="text_pic_in" id="pic2"><img src="../../../../img/outer/User/17.png"></div>
        </div>
    </div>
</div>
<div class="member">
    <div class="title">部门成员</div>
    <div class="leagure">
        <table>
            <c:forEach items="${showAllMember1}" var="user">
                <tr>
                    <td><img src="../../../../img/outer/User/5.png"> </td>
                    <td>
                        <span class="name">姓名：${user.userName}</span><br/>
                        <span class="userDepartment">部门：${user.userDepartment}</span><br/>
                        <span class="userJob">职务：${user.userJob}</span><br/>
                        <span class="userNumber">学号：${user.userNumber}</span><br/>
                        <span class="userIntroduction">个人简介：${user.userIntroduction}</span><br/>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
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
        <img src="../../../../img/outer/User/14.png" >
        <div class="note">
            <p><span>&nbsp;&nbsp;&nbsp;卓音官方微信</span> </p>
        </div>
    </div>
</div>
</body>
</html>
