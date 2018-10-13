$(function(){
    $("#sidebar ul li:nth-child(8) a").hover(function(){
        $(this).css({
            "background-color":"rgb(78,84,101)"
        });
    },function(){
        $(this).css({
            "background-color":"rgb(78,84,101)"
        });
    });
    $("#through").click(function(){
        $("#file_through").click();
        return false;
    });
    $("#photo_address").focus(function(){
        $("#file_through").click();
    });
    // 将图片路径显示在“浏览图片”按钮旁的输入框中
    $("#file_through").change(function(){			//当#file<input>框的值发生改变(开始输入文件路径)时
        $("#photo_address").val($(this).val());		//将获取到的属性值显示在文本框中(显示路径)
    });
    //如果未选择图片，则不能上传
    $("#photo_submit").click(function(){
        var $content = $("#photo_address").val();
        if($content == ""){
            alert("请选择需要上传的图片！");
            return false;
        }
    })
    $("#activitiesImg tr td:first-child").css({
        "width":"300px",
        "text-align":"center"
    });
    $("#activitiesImg tr td:last-child").css({
        "width":"200px",
        "text-align":"center"
    })
    //鼠标覆盖事件
    $("#activitiesImg tr:not(:first)").hover(function(){
        $(this).css("background-color","rgb(242,242,242)");
    },function(){
        $(this).css("background-color","white");
    });
    //???点击“修改”按钮，页面也跳转
    $("#change").click(function(){
        window.location.href="ActivitiesImg_change.html";
    })
})