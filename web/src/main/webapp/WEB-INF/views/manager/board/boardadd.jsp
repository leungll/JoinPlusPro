<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/9/5
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../../../css/base/reset.css" />
    <link rel="stylesheet" href="../../../../css/common/common2.css" />
    <link rel="stylesheet" href="../../../../css/manager/board/Board_newadd.css" />
    <script type="text/javascript" src="../../../../js/common/jquery-3.3.1.js" ></script>
    <script type="text/javascript" src="../../../../js/common/common2.js" ></script>
    <script type="text/javascript" src="../../../../js/manager/board/Board_newadd.js" ></script>
    <title>公告管理增加界面</title>
</head>
<body>
<!--公共部分-->
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
        <li><a href="${website}answer2/list1">提交意见查看</a></li>
    </ul>
</div>
<div id="registration_form_title">
    <span>公告管理</span>
</div>
<!--公告后台管理页面的修改页面-->
<div class="content">
    <form action="${website}/board/new" method="post">
        <table>
            <tr>
                <td>年：</td>
                <td>
                    <input type="text" name="year" placeholder="输入当前年" id="year"/>
                </td>
            </tr>
            <tr>
                <td>月：</td>
                <td>
                    <input type="text" name="month" placeholder="输入当前月" id="month"/>
                </td>
            </tr>
            <tr>
                <td>日：</td>
                <td>
                    <input type="text" name="day" placeholder="输入当前日" id="day"/>
                </td>
            </tr>
            <tr>
                <td>标题：</td>
                <td>
                    <input name="title" placeholder="输入公告标题..."/>
                </td>
            </tr>
            <tr>
                <td>内容：</td>
                <td>
                    <textarea name="content" placeholder="输入公告内容..."></textarea>
                </td>
            </tr>
            <tr>
                <td>状态：</td>
                <td>
                    <input type="checkbox" name="chose" class="choose"/>
                    <input type="hidden" name="state" class="hidden" value="0" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <!--注意type=button-->
                    <a href="${website}/board/list"><button type="button">返回</button></a>
                    <input type="submit" name="" value="提交" id="submit" />
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>