<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2018/10/12
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../../css/outer/entry/DownloadCSS.css">
    <script type="text/javascript" src="../../js/common/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="../../js/outer/entry/html2canvas.min.js"></script>
    <script type="text/javascript" src="../../js/outer/entry/jspdf.debug.js"></script>
    <script type="text/javascript" src="../../js/outer/entry/Download.js"></script>
    <title>报名表下载</title>
</head>

<body>
<button id="topdf" type="button" class="btn btn-success btn-sm " style="margin-left:30px" onclick="downPDF()">下载PDF</button>
<button id="return" type="button" class="btn btn-success btn-sm " style="margin-left:30px" onclick="re()">返回上一页</button>
<script>
    function re(){
        window.location.href="/entry/entry";
    }
</script>
<div id="pdf">
    <h1>卓音工作室报名表</h1>
    <table>
        <tr>
            <td class="miaomiaomiao"></td>
            <td class="miaomiaomiao"></td>
            <td class="miaomiaomiao"></td>
            <td class="miaomiaomiao"></td>
            <td class="miaomiaomiao"></td>
            <td class="miaomiaomiao"></td>
            <td class="miaomiaomiao"></td>
            <td class="miaomiaomiao"></td>
        </tr>
        <tr>
            <td>姓名</td>
            <td colspan="2" width="25%">
                <input type="text" name="name" id="name" class="fullinput" readonly="readonly" value="${Freshman.name}">
            </td>
            <td>学号</td>
            <td colspan="2" width="25%">
                <input type="text" name="number" id="number" class="fullinput" readonly="readonly" value="${Freshman.number}">
            </td>
            <td colspan="2" rowspan="5" width="25%">
                <img src="${Freshman.photo}" id="img" width="100%">
            </td>
        </tr>
        <tr>
            <td>性别</td>
            <td>
                <input type="text" name="sex" id="sex" class="fullinput" readonly="readonly" value="${Freshman.sex}">
            </td>
            <td>民族</td>
            <td>
                <input type="text" name="nation" id="nation" class="fullinput" readonly="readonly" value="${Freshman.nation}">
            </td>
            <td>排名</td>
            <td>
                <input type="text" name="rank" id="rank" class="fullinput" readonly="readonly" value="${Freshman.rank}">
            </td>
        </tr>
        <tr>
            <td>生源地</td>
            <td colspan="2">
                <input type="text" name="province" id="province" class="fullinput" readonly="readonly" value="${Freshman.nativePlace}">
            </td>
            <td>专业</td>
            <td colspan="2">
                <input type="text" name="major" id="major" class="fullinput" readonly="readonly" value="${Freshman.major}">
            </td>
        </tr>
        <tr>
            <td>手机</td>
            <td colspan="2">
                <input type="tel" name="phone" id="phone" class="fullinput" readonly="readonly" value="${Freshman.phone}">
            </td>
            <td>QQ</td>
            <td colspan="2">
                <input type="text" name="qq" id="qq" class="fullinput" readonly="readonly" value="${Freshman.qq}">
            </td>
        </tr>
        <tr>
            <td>服从调剂</td>
            <td colspan="2">
                <input type="text" name="yos"id="yos" class="fullinput" readonly="readonly" value="${yon}">
            </td>
            <td>ID</td>
            <td colspan="2">
                <input type="text" name="ID" id="ID" class="fullinput" readonly="readonly" value="${myId}">
            </td>
        </tr>
        <tr>
            <td>第一志愿</td>
            <td colspan="3">
                <input type="text" name="volunteer1" id="volunteer1" class="fullinput" readonly="readonly" value="${Freshman.volunteer1}">
            </td>
            <td>第二志愿</td>
            <td colspan="3">
                <input type="text" name="volunteer2" id="volunteer1" class="fullinput" readonly="readonly" value="${Freshman.volunteer2}">
            </td>
        </tr>
        <tr>
            <td>自我介绍</td>
            <td colspan="7">
						<textarea name="introduction" id="introduction" class="maxinput" readonly="readonly">
                            ${Freshman.introduction}
                        </textarea>
            </td>
        </tr>
        <tr>
            <td>加入理由</td>
            <td colspan="7">
						<textarea name="reason" id="reason" class="maxinput" readonly="readonly">
                            ${Freshman.reason}
                        </textarea>
            </td>
        </tr>
    </table>
</div>
</body>
</html>


