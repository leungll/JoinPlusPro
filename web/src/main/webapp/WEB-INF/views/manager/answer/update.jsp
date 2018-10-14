<%--
  Created by IntelliJ IDEA.
  User: 芋头
  Date: 2018/6/2
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
    <title>回复</title>
    <link rel="stylesheet" type="text/css" href="../../../../css/base/reset.css" />
    <link rel="stylesheet" type="text/css" href="../../../../css/common/Title&Sidebar.css" />
    <link rel="stylesheet" type="text/css" href="../../../../css/manager/answer/Suggestions.css" />
    <script type="text/javascript" src="../../../../js/common/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="../../../../js/common/Title&Sidebar.js"></script>
    <script type="text/javascript" src="../../../../js/manager/answer/Suggestions.js"></script>
</head>
<body>
<script type="text/javascript" src="../../../../UEditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" src="../../../../UEditor/ueditor.all.js"></script>
<!-- 实例化编辑器 -->
<script type="text/javascript">
    var ue = UE.getEditor('container',{enterTag:'br'});
</script>
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
    <span>回复匿名建议</span>
</div>
<div id="reply">
    <form action="${website}answer2/update2/${answer2.id}" method="post">
        <table border="1">
            <tr>
                <th>回复</th>
                <td>
                    ${answer2.inquiry_answer1}
                </td>
            </tr>
            <tr>
                <th>修改</th>
                <td>
                    <textarea  name="inquiry_answer1" id= "container" type="text/plain"></textarea>
                </td>
                <td>
                    <input type="text" name="inquiry_answer2" value="${answer2.inquiry_answer2}" hidden />
                </td>
            </tr>
        </table>
        <div id="tool">
            <button type="submit" name="submit" value="修改">修改</button>
            <a href="/answer2/list1"><button type="button" value="取消" >取消</button></a>
        </div>
    </form>
</div>
</body>
</html>
