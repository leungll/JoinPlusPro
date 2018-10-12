<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/10/12
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../../../css/base/reset.css" />
    <link rel="stylesheet" type="text/css" href="../../../../css/common/Title&Sidebar.css" />
    <link rel="stylesheet" type="text/css" href="../../../../css/manager/entry/detail.css" />
    <script type="text/javascript" src="../../../../js/common/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="../../../../js/common/Title&Sidebar.js"></script>
    <script type="text/javascript" src="../../../../js/manager/entry/detail_registration.js"></script>
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
        <li><a href="lessonFiles.html">课件管理</a></li>
        <li><a href="${website}activity/list">活动管理</a></li>
        <li><a href="${website}beauty/list">风采图片管理</a></li>
        <li><a href="${website}entry/listAll">报名人员管理</a></li>
        <li><a href="Suggestions.html">提交意见查看</a></li>
    </ul>
</div>
<div id="detail_table_title">
    <span>东北师范大学卓音工作室报名表</span>
    <a href="${website}entry/listAll"><button type="button" id="back">返回</button></a>
</div>
<div id="detail_table">
    <table>
        <tr>
            <th style="width: 120px; height: 50px;">姓名</th>
            <td style="width: 100px;">${freshman.name}</td>
            <th style="width: 120px;">性别</th>
            <td style="width: 100px;">${freshman.sex}</td>
            <th style="width: 120px;">民族</th>
            <td style="width: 100px;">${freshman.nation}</td>
            <td colspan="2" rowspan="3"><img src="${freshman.photo}" width="118px" height="165.2px" /></td>
        </tr>
        <tr>
            <th style="height: 50px;">学号</th>
            <td>${freshman.number}</td>
            <th>专业</th>
            <td>${freshman.major}</td>
            <th>排名</th>
            <td>${freshman.rank}/${freshman.rankAll}</td>
        </tr>
        <tr>
            <th style="height: 50px;">生源地</th>
            <td>${freshman.nativePlace}</td>
            <th>第一志愿</th>
            <td>${freshman.volunteer1}</td>
            <th>第二志愿</th>
            <td>${freshman.volunteer2}</td>
        </tr>
        <tr>
            <th style="height: 50px;">手机</th>
            <td>${freshman.phone}</td>
            <th>QQ</th>
            <td>${freshman.qq}</td>
            <th>是否服从调剂</th>
            <td>${yon}</td>
            <th style="width: 80px;">审核结果</th>
            <td style="width: 80px;">${freshman.pass}</td>
        </tr>
        <tr>
            <th>自我介绍</th>
            <td colspan="7">${freshman.introduction}</td>
        </tr>
        <tr>
            <th>加入工作室的理由</th>
            <td colspan="7" >${freshman.reason}</td>
        </tr>
    </table>
</div>
</body>
</html>

