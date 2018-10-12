<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/10/12
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="../../../../css/base/reset.css" />
    <link rel="stylesheet" type="text/css" href="../../../../css/common/Title&Sidebar.css" />
    <link rel="stylesheet" type="text/css" href="../../../../css/manager/entry/Registrate_Form.css" />
    <script type="text/javascript" src="../../../../js/common/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="../../../../js/common/Title&Sidebar.js"></script>
    <script type="text/javascript" src="../../../../js/manager/entry/registration_Form.js"></script>
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
<div id="registration_form_title">
    <span>报名人员管理</span>
</div>
<div id="registration">
    <div id="research">
        <form action="${website}entry/searchVolunteer" method="post">
            <button type="submit" value="前端" name="volunteer">前端</button>
            <button type="submit" value="后端" name="volunteer">后端</button>
            <button type="submit" value="产品" name="volunteer">产品</button>
        </form>
        <form action="${website}entry/searchPass" method="post">
            <button type="submit" value="通过" name="pass">通过</button>
            <button type="submit" value="不通过" name="pass">不通过</button   >
        </form>
    </div>
    <div id="regi_table">
        <table>
            <tr>
                <th>序号</th>
                <th>姓名</th>
                <th>专业</th>
                <th>ID</th>
                <th>第一志愿</th>
                <th>第二志愿</th>
                <th>联系电话</th>
                <th>QQ</th>
                <th>操作</th>
                <th>审核状态</th>
                <th>通过部门</th>
            </tr>
            <c:forEach items="${freshmanList}"  var="Freshman" varStatus="status">
                <tr>
                    <td>${status.index+1}</td>
                    <td>${Freshman.name}</td>
                    <td>${Freshman.major}</td>
                    <td>${Freshman.id}</td>
                    <td>${Freshman.volunteer1}</td>
                    <td>${Freshman.volunteer2}</td>
                    <td>${Freshman.phone}</td>
                    <td>${Freshman.qq}</td>
                    <td>
                        <a href="${website}entry/searchById/${Freshman.id}"><button type="button" name="detail" class="de_form">详情</button></a>
                        <form action="${website}entry/deleteFreshman/${Freshman.id}">
                            <button type="submit" name="cancel" class="cancel">删除</button>
                        </form>
                    </td>
                    <td> <span class="status">${Freshman.pass}</span></td>
                    <td>
                        <div class="department" style="display: none;">
                            <form action="${website}entry/getById/${Freshman.id}">
                                <button type="submit" name="examine" class="examined_qianduan" value="前端">前端</button>
                            </form>
                            <form action="${website}entry/getById/${Freshman.id}">
                                <button type="submit" name="examine" class="examined_houduan" value="后端">后端</button>
                            </form>
                            <form action="${website}entry/getById/${Freshman.id}">
                                <button type="submit" name="examine" class="examined_chanpin" value="产品">产品</button>
                            </form>
                        </div>
                        <button type="button" name="examine" class="examined_fail" value="通过">通过</button>
                        <form action="${website}entry/getById/${Freshman.id}">
                            <button type="submit" name="examine" class="examined_fail" value="不通过">不通过</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>

