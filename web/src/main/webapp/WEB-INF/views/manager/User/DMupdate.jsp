<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 迁旧。
  Date: 2018/8/3
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../../../css/base/reset.css" />
    <link rel="stylesheet" href="../../../../css/common/common.css" />
    <link rel="stylesheet" href="../../../../css/manager/User/DMadd.css" />
    <script type="text/javascript" src="../../../../js/jquery-3.3.1.js" ></script>
    <script type="text/javascript" src="../../../../js/common/common.js" ></script>
    <script type="text/javascript" src="../../../../js/manager/User/DMadd.js" ></script>
    <title>公告管理修改界面</title>
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
        <li><a href="">轮播图管理</a></li>
        <li><a href="">公告管理</a></li>
        <li><a href="">部门成员管理</a></li>
        <li><a href="">日历管理</a></li>
        <li><a href="">课件管理</a></li>
        <li><a href="">活动管理</a></li>
        <li><a href="">风采图片管理</a></li>
        <li><a href="">报名人员管理</a></li>
        <li><a href="">提交意见查看</a></li>
    </ul>
</div>
<div id="registration_form_title">
    <span>公告管理</span>
</div>
<!--公告后台管理页面的修改页面-->
<div class="content">
    <%--<form action="${website}/user/updateUser?id=<%=request.getParameter("id")%>" method="post">--%>
        <form action="${website}/user/updateUser?id=${id}" method="post">
        <table>
            <tr>
                <td>姓名:</td>
                <td>
                    <input type="text" name="userName" placeholder="姓名" id="name"/>
                    <!--<div class="photobox">
                        <img src="" id="photo"/>
                    </div>-->
                </td>
                <td colspan="2" rowspan="2">
                    <div class="photobox">
                        <img src="" id="photo" />
                    </div>
                </td>
            </tr>
            <tr>
                <td>部门:</td>
                <td>
                    <input type="text" name="userDepartment" placeholder="前端、后端、产品" id="department"/>
                </td>
            </tr>
            <tr>
                <td>学号：</td>
                <td>
                    <input type="text" name="userNumber" placeholder="请输入学号" id="studentNumber"/>
                </td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td>年级:</td>
                <td>
                    <input type="text" name="userGrade" placeholder="请输入年级" id="grade"/>
                </td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td>职务：</td>
                <td>
                    <input type="text" name="userJob" placeholder="请输入职务" id="job"/>
                </td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td>自我介绍：</td>
                <td colspan="3">
                    <textarea placeholder="请输入自我介绍..." name="userIntroduction"></textarea>
                </td>
            </tr>
            <tr>
                <td colspan="4">
                    <!--注意type=button-->
                    <input type="text" name="path" id="path" />
                    <button type="button" id="view">浏览</button>
                    <input type="file" name="file" id="file" />
                    <a href="/user/list"><button type="button">返回</button></a>
                    <input type="submit" name="" value="修改" id="submit" />
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>