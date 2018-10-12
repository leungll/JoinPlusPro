// JavaScript Document
$(function(){

//	点击“开始报名”弹出表格
//	点击“开始报名”弹出表格
//	点击“开始报名”弹出表格
//	点击“开始报名”弹出表格
//	点击“开始报名”弹出表格
    $("#entry").click(function(){
        $("form").slideToggle(600);
        if($(this).text()=="开始报名"){
            $(this).text("保存并收起");
        }else if($(this).text()=="保存并收起"){
            $(this).text("继续填写");
        }else if($(this).text()=="继续填写"){
            $(this).text("保存并收起");
        }
    });
//上传图片预览功能
//上传图片预览功能
//上传图片预览功能
//上传图片预览功能
//上传图片预览功能
    $("#file").change(function(){
        var objUrl = getObjectURL(this.files[0]) ;
        if (objUrl) {
            $("#img").attr("src", objUrl) ;
        }
    }) ;
    function getObjectURL(file) {
        var url = null ;
        if (window.createObjectURL!=undefined) { // basic
            url = window.createObjectURL(file) ;
        } else if (window.URL!=undefined) { // mozilla(firefox)
            url = window.URL.createObjectURL(file) ;
        } else if (window.webkitURL!=undefined) { // webkit or chrome
            url = window.webkitURL.createObjectURL(file) ;
        }
        return url ;
    }
//提醒表单必填项
//提醒表单必填项
//提醒表单必填项
//提醒表单必填项
//提醒表单必填项
    //姓名
    $("#name").blur(function(){
        if($(this).val()==""){
            $(this).parent().prev().css({
                "color":"red"
            });
            $(this).attr({
                "placeholder":"请填写内容"
            });
        }
        else{
            $(this).parent().prev().css({
                "color":"#000000"
            });
        }
    });
    //学号
    $("#number").blur(function(){
        var str = $(this).val();
        var ret = /^\d{10}$/;//正则表达式
        if($(this).val()==""){
            $(this).parent().prev().css({
                "color":"red"
            });
            $(this).attr({
                "placeholder":"请填写内容"
            });
        }
        else if(!ret.test(str)){
            $(this).parent().prev().css({
                "color":"red"
            });
            $(this).val("");//清空错误的表单值
            $(this).attr({
                "placeholder":"请正确填写内容"
            });
        }
        else{
            $(this).parent().prev().css({
                "color":"#000000"
            });
        }
    });
    //照片
    //性别
    //民族
    //排名
    //生源地
    //专业
    $("#major").blur(function(){
        var str = $(this).val();
        var ret = /^[\u4e00-\u9fa5]{0,}$/;//正则表达式
        if($(this).val()==""){
            $(this).parent().prev().css({
                "color":"red"
            });
            $(this).attr({
                "placeholder":"请填写内容"
            });
        }
        else if(!ret.test(str)){
            $(this).parent().prev().css({
                "color":"red"
            });
            $(this).val("");//清空错误的表单值
            $(this).attr({
                "placeholder":"请正确填写内容"
            });
        }
        else{
            $(this).parent().prev().css({
                "color":"#000000"
            });
        }
    });
    //手机
    $("#phone").blur(function(){
        var str = $(this).val();
        var ret = /^(13[0-9]|14[0-9]|15[0-9]|166|17[0-9]|18[0-9]|19[8|9])\d{8}$/;//正则表达式
        if($(this).val()==""){
            $(this).parent().prev().css({
                "color":"red"
            });
            $(this).attr({
                "placeholder":"请填写内容"
            });
        }
        else if(!ret.test(str)){
            $(this).parent().prev().css({
                "color":"red"
            });
            $(this).val("");//清空错误的表单值
            $(this).attr({
                "placeholder":"请正确填写内容"
            });
        }
        else{
            $(this).parent().prev().css({
                "color":"#000000"
            });
        }
    });
    //QQ
    $("#qq").blur(function(){
        var str = $(this).val();
        var ret = /^\d{5,10}$/;//正则表达式
        if($(this).val()==""){
            $(this).parent().prev().css({
                "color":"red"
            });
            $(this).attr({
                "placeholder":"请填写内容"
            });
        }
        else if(!ret.test(str)){
            $(this).parent().prev().css({
                "color":"red"
            });
            $(this).val("");//清空错误的表单值
            $(this).attr({
                "placeholder":"请正确填写内容"
            });
        }
        else{
            $(this).parent().prev().css({
                "color":"#000000"
            });
        }
    });
    //服从调剂
    //审核状态
    //第一志愿
    //第二志愿
    //自我介绍//报名理由
    //
    //
    // $("#submit_button").click(function(){
    // 	if($(":radio:checked").length == 4&&$("select").val() != ""&&$(":text").val()!=""&&$(":file").val()!=""&&$("textarea").val()!=""){
    // 			window.location.href = "Download.html";
    // 	}else{
    // 		alert("请认真填写所有内容！")
    // 	}
    // })
//	$('#areaSelect').attr("disabled",false);
//	if($(":radio:checked").length == 0){
//		$("#submit").attr("disabled",true);
//	}
//          $("#public_top").load(public_top.html);
//          $("#public_bottom").load(public_bottom.html);
})