<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html lang="en-US">

<head>
    <meta charset="UTF-8">
    <title>ueditor demo</title>
    <link rel="stylesheet" href="../../../css/inner/reset（inner).css" />
    <link rel="stylesheet" href="../../../css/inner/Inner.css" />
    <script type="text/javascript" src="../../../js/common/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="../../../js/inner/inner.js" ></script>
</head>

<body>
<!-- 加载编辑器的容器 -->
<%--<script id="container" name="content" type="text/plain">--%>
<%--这里写你的初始化内容--%>
<%--</script>--%>
<!-- 配置文件 -->
<script type="text/javascript" src="../../../UEditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" src="../../../UEditor/ueditor.all.js"></script>
<!-- 实例化编辑器 -->
<script type="text/javascript">
    var ue = UE.getEditor('container',{enterTag:'br'});
</script>

<!--固定的头部-->
<div class="top">
    <a href="#">工作室首页</a>
    <span style="color: #000000;">|</span>
    <a href="#">工作室内网</a>
    <div class="formbox">
        <form action="#" method="post">
            <input type="button" name="logout" value="退出登录" />
        </form>
        <form action="#" method="post">
            <input type="text" placeholder="搜索" />
            <input type="button" name="search" value="搜索" />
        </form>
    </div>
</div>
<!--工作室图标部分，也是固定的-->
<div class="studio">
    <p>东北师范大学卓音工作室</p>
</div>
<!--以下是网页的主体部分-->
<div class="content">
    <!--通知栏的图标部分-->
    <div class="notice_pic">
        <img src="../../../img/inner/notice.jpg" />
        <div class="notice_a">
            <a>工作室通知</a>
            <span>|</span>
            <a>我的作业</a>
        </div>
    </div>
    <div class="ppt_and_calendar">
        <!--这是PPT以及日历的盒子-->
        <!--PPT-->
        <div id="notice">
            <div id="inside_table">
                <table>
                    <tr>
                        <!-- 数据库中存放图片 -->
                        <td><img src="../../../img/inner/message.jpg" /></td>
                        <!-- 数据库中存放文档标题 -->
                        <td></td>
                        <!-- 数据库中存放上传文档的日期 -->
                        <td></td>
                    </tr>
                </table>
            </div>
            <div id="bottom">
                <form action="StuNotice.html" method="post">
                    <input type="text" name="address" id="address" />
                    <input type="file" name="file" id="file" /><!-- 用#browse按钮代替#file<input> -->
                    <button type="button" name="browse" id="browse">浏览</button>
                    <button type="submite" name="submite" id="submite">上传</button>
                </form>
            </div>
        </div>
        <!--日历-->
        <div class="calendar">
            <span></span>
            <table>
                <tr class="first">
                    <th>Sun</th>
                    <th>Mon</th>
                    <th>Tue</th>
                    <th>Wed</th>
                    <th>Thu</th>
                    <th>Fri</th>
                    <th>Sat</th>
                </tr>
                <tr>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title="aaa"></td>
                    <td title=""></td>
                    <td title="aaa"></td>
                </tr>
                <tr>
                    <td title="aaa"></td>
                    <td title="aaa"></td>
                    <td title="aaa"></td>
                    <td title="aaa"></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                </tr>
                <tr>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                </tr>
                <tr>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                </tr>
                <tr>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                </tr>
                <tr>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                    <td title=""></td>
                </tr>
            </table>
        </div>
    </div>
    <div class="project_pic">
        <img src="../../../img/inner/browser.jpg" />
        <div class="project_a">
            <a>工作室项目</a>
            <span>|</span>
            <a>项目进度</a>
        </div>
    </div>
    <div class="project">
        <div class="hidden">
            <div class="project_child">
                <table>
                    <tr>
                        <td>编号</td>
                        <td>项目名称</td>
                        <td></td>
                        <td>项目进度</td>
                        <td>操作</td>
                    </tr>
                    <c:forEach items="${projectList}"  var="project" varStatus="status">
                        <tr>
                            <td>${status.index+1}</td>
                            <td><input value="${project.id}"  hidden class="sendid" hidden/></td>
                            <td>${project.project_name}</td>
                            <td>-------------------</td>
                            <td>${project.project_content}</td>
                            <td>
                                <a href="${website}project/del/${project.id}" id="delete_a"><img src="../../../img/manager/delete.jpg" /></a>
                                <a title="上传" class="update_a"><img src="../../../img/manager/update.jpg" /></a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
                <a>
                    <button type="submit" id="add_btn" value="增加">增加</button>
                </a>
            </div>
        </div>
        <div class="addcontent">
            <form action = "/project/add" method="post">
                <table>
                    <tr>
                        <td>项目名称：</td>
                        <td><input type="text" class="pro_name" name="project_name"/></td>
                        <td class="req_name"></td>
                    </tr>
                    <tr>
                        <td>开始时间：</td>
                        <td><input type="text" class="pro_start" name="project_date" /></td>
                        <td class="req_start"></td>
                    </tr>
                    <tr>
                        <td>结束时间：</td>
                        <td><input type="text" class="pro_finish" name="project_finish"/></td>
                        <td class="req_finish"></td>
                    </tr>
                    <tr>
                        <td>内容：</td>
                        <td><textarea class="pro_content" name="project_content"></textarea> </td>
                        <td class="req_content"></td>
                    </tr>
                    <tr>
                        <td colspan="3">
                            <a href="/project/list"><button type="button" value = "返回">返回</button></a>
                            <input type="submit" name="submit" id="addsubmit" value="添加" />
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <div class="updatecontent">
            <form action="/project/update" method="post">
                <input type="text" hidden id="hide_input" name="id"/>
                <table>
                    <tr>
                        <td>项目名称：</td>
                        <td>
                            <input type="text" class="pro_name" name="project_name"  />
                        </td>
                        <td class="req_name"></td>
                    </tr>
                    <tr>
                        <td>开始时间：</td>
                        <td><input type="text" class="pro_start" name="project_date" /></td>
                        <td class="req_start"></td>
                    </tr>
                    <tr>
                        <td>结束时间：</td>
                        <td><input type="text" class="pro_finish" name="project_finish"  /></td>
                        <td class="req_finish"></td>
                    </tr>
                    <tr>
                        <td>内容：</td>
                        <td><textarea class="pro_content" name="project_content"  ></textarea></td>
                        <td class="req_content"></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <a href="/project/list"><button type="button" value = "返回">返回</button></a>
                            <input type="submit" name="submit" id="addsubmit" value="上传" />
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <img src="../../../img/inner/projectmanagement.jpg" id="projectpic" />
    </div>
    <tr>
        <td colspan="7" align="right"><a href="/answer2/list1">前往超管页面</a></td>
    </tr>


    <div id="suggestion">
        <div id="sug_title">
            <img src="../../../img/inner/write.jpg" />
            <span>你问我答</span>
        </div>
        <div id="question">
            <form action="/answer2/add1" method="post">
                <div id="question_one">
                    <span>你对工作室有什么建议？</span><p></p>
                    <textarea class="question_one" name="inquiry_answer2" id= "container" type="text/plain"></textarea>
                    <div id="operate_tool">
                        <button type="button" name="cancel_question" class="cancel_question" value="取消">取消</button>
                        <button type="submit" name="submite" class="submite">提交</button>
                    </div>
                </div>
                <div id="submit_suggestions">
                    <table id="Suggestions_form">
                        <tr>
                            <th>建议</th>
                            <th>回复</th>
                        </tr>
                        <c:forEach items="${answer2List}"  var="answer2" varStatus="status">
                            <tr>
                                <td>${answer2.inquiry_answer2}</td>
                                <td>${answer2.inquiry_answer1}</td>
                            </tr>
                        </c:forEach>
                    </table>

                </div>
                <%--<tr>--%>
                <%--<td>--%>
                <%--&lt;%&ndash;<input type="text" name="inquiry_answer2"/>&ndash;%&gt;--%>
                <%--<textarea id="container" name="inquiry_answer2" type="text/plain"></textarea>--%>
                <%--</td>--%>
                <%--</tr>--%>
                <%--<th align="center">--%>
                <%--<a href="/answer2/list"><input type="button" value="取消" ></a>--%>
                <%--</th>--%>
                <%--<th align="right">--%>
                <%--<input type="submit" name="submit" value="添加"/>--%>
                <%--</th>--%>
                <%--</tr>--%>
            </form>
        </div>
    </div>
    <div class="footer">
        <p>东北师范大学卓音工作室Join&nbsp;Studio</p>
    </div>
</div>
</body>
</html>