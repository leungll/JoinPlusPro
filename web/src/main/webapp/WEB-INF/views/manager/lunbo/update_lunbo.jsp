<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liangll
  Date: 2018/8/3
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../../../css/base/reset.css" />
    <link rel="stylesheet" href="../../../../css/manager/lunbo/common_slide.css" />
    <link rel="stylesheet" href="../../../../css/manager/lunbo/update_new.css" />
    <script type="text/javascript" src="../../../../js/common/jquery-3.3.1.js" ></script>
    <script type="text/javascript" src="../../../../js/manager/lunbo/common_slide.js" ></script>
    <script type="text/javascript" src="../../../../js/manager/lunbo/Update.js" ></script>
    <title>修改页面</title>
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
        <li><a href="Suggestions.html">提交意见查看</a></li>
    </ul>
</div>
<div id="registration_form_title">
    <span>轮播图管理</span>
</div>
<!--修改部分-->
<div class="content">
    <form action="${website}lunbo/update/${lunbo.id}" method="post" enctype="multipart/form-data">
        <table border="1">
            <tr>
                <th>图片</th>
                <th>名称</th>
                <th>状态</th>
                <th>操作</th>
            </tr>
            <tr>
                <td>
                    <input type="text" name="path" value="${lunbo.path}" hidden/>
                    <img name="path" src="${lunbo.path}"/>
                </td>
                <td>
                    <input type="text" name="name" id="change" value="${lunbo.name}"/>
                </td>
                <td>
                        <input type="text" name="status" value="${lunbo.status}" id="status" disabled="disabled"/>
                </td>
                <td>
                    <input type="submit" name="submit" value="修改" id="besure" />
                    <a href="/lunbo/list"><button>取消</button></a>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
