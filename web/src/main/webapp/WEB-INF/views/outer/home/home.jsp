<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/9/14
  Time: 9:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <link rel="stylesheet" type="text/css" href="../../../../css/base/reset.css">
    <link rel="stylesheet" type="text/css" href="../../../../css/outer/home/home page.css">  <!--官网首页-->
    <link rel="stylesheet" type="text/css" href="../../../../css/common/publicnew.css">  <!--公共部分-->
    <link rel="stylesheet" type="text/css" href="../../../../css/outer/carousel.css"> <!--轮播-->
    <script type="text/javascript" src="../../../../js/jquery-3.3.1.js"></script>   <!-- JQ库-->
    <script type="text/javascript" src="../../../../js/public.js"></script>   <!--公共部分-->
    <script type="text/javascript" src="../../../../js/outer/carousel_fade_i.js"></script>   <!--轮播-->
    <title>卓音工作室官网首页</title>
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
            <form class="button_inner" action="${website}/board/query">
                <table >
                    <tr>
                        <td class="search_bar_inner" id="input_block"><input id="input" name="keyword"type="text" placeholder="请输入要搜索的内容"></td>
                        <td class="search_bar_inner" id="btn2"><button id="search" type="submit">搜索</button></td>
                    </tr>
                </table>
            </form>
            <%--<div class="button_inner">--%>
            <%--<div class="search_bar_inner" id="input_block">--%>
            <%--<input id="input" type="text" placeholder="请输入要搜索的内容">--%>
            <%--</div>--%>
            <%--<div class="search_bar_inner" id="btn2">--%>
            <%--<button id="search" type="button">搜索</button>--%>
            <%--</div>--%>
            <%--</div>--%>
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
    <!------------文本提示块--------->
    <div class="content">
        <!------轮播图------>
        <div id="title_carousel">
            <!-----对应的小圆点---->
            <ul class="carousal-indicators">
            </ul>
            <!---轮播图---->
            <div class="carousal-img">
                <c:forEach items="${lunboList2}"  var="lunbo" varStatus="status">
                    <c:choose>
                        <c:when test = "${lunbo.status == 'Yes'}">
                            <img src="${lunbo.path}">
                        </c:when>
                    </c:choose>
                </c:forEach>
            </div>
            <!--左右的点击前进后退按键---->
            <div class="btn" id="left">&lt;</div>
            <div class="btn" id="right">&gt;</div>
        </div>
        <!-------公告-------->

        <div id="title_announce">

            <div class="level_main">
                <div class="theme"><span>公告</span></div>
                <div class="more">
                    <span>更多</span><a href="/activity/toBoardmore"><img src="../../../../img/outer/u91.jpg"></a>
                </div>
            </div>
            <div class="level_detail">
                <c:forEach items="${boardList}"  var="board" varStatus="status">
                    <c:choose>
                        <c:when test = "${board.state == 'yes'}">
                            <div class="announce_detail">
                                <div class="annnounce_left"><p class="announce_day">${board.day}</p></div>
                                <div class="annnounce_right"><p class="announce_month">${board.month}</p><p class="announce_year">${board.year}</p></div>
                                <span><a href="/board/list1/${board.title}">${board.title}</a></span>

                            </div>
                        </c:when>
                    </c:choose>
                </c:forEach>
            </div>

        </div>

        <!-------活动-------->
        <div id="title_activities">
            <div class="level_main">
                <div class="theme"><span>活动</span></div>
                <div class="more">
                    <span>更多</span><a href="/activity/toActivitymore"><img src="../../../../img/outer/u91.jpg"></a>
                </div>
            </div>

            <div class="level_detail">
                <c:forEach items="${activityList}"  var="activity" varStatus="status">
                    <c:choose>
                        <c:when test = "${activity.state == 'yes'}">
                            <div id="activities_detail">
                                <img src="../../../../img/outer/u75.jpg" >
                                <div id="activities_words">
                                    <p id="word_h">${activity.title}</p>
                                    <p id="word_p">${activity.content}</p>
                                </div>
                                <img src="../../../../img/outer/u75.jpg" >
                            </div>
                            <div id="activities_img">
                                <img src="${activity.image1}">
                                <img src="${activity.image2}">
                                <img src="${activity.image3}">
                            </div>
                        </c:when>
                    </c:choose>
                </c:forEach>
            </div>
        </div>
        <!-------卓音风采-------->
        <div id="title_mien">
            <div class="level_main">
                <div class="theme"><span>卓新风采</span></div>
            </div>
            <div class="level_detail">
                <c:forEach items="${beautyList2}"  var="beauty" varStatus="status">
                    <c:choose>
                        <c:when test = "${beauty.status == 'Yes'}">
                            <div class="mien_detail">
                                <div class="mien_h">${beauty.name}</div>
                                <div class="mien_img"><img src="${beauty.path}"></div>
                            </div>
                        </c:when>
                    </c:choose>
                </c:forEach>
            </div>
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
