<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html lang="en-US">

<head>
    <meta charset="UTF-8">
    <title>ueditor demo</title>
</head>

<body>
<!-- 加载编辑器的容器 -->
<script id="container" name="content" type="text/plain">
        这里写你的初始化内容
    </script>
<!-- 配置文件 -->
<script type="text/javascript" src="UEditor/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" src="UEditor/ueditor.all.js"></script>
<!-- 实例化编辑器 -->
<script type="text/javascript">
    var ue = UE.getEditor('container');
</script>
<a href="/beauty/list">点击进入风采界面</a>
<a href="/lunbo/list">点击进入轮播图界面</a>
<a href="/user/home">点击进入登录界面</a>
<a href="/entry/entry">点击进入报名界面</a>
<a href="/board/list">点击进入公告界面</a>
<a href="/activity/list">点击进入活动界面</a>
<a href="/project/list">点击进入内网界面</a>
<a href="/TongGao/getall">点击进入通告页面</a>
<a href="/activity/toHome">点击进入官网首页页面</a>
<a href="/activity/list2">点击进入官网首页页面</a>
<a href="/user/show1">点击进入测试首页页面</a>
<a href="/user/list">点击进入测试后台页面</a>
<a href="/TongGao/inner">点击进入内网inner界面 肖瑶日历的test</a>
</body>

</html>
