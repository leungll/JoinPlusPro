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
    //hidden值改变
    $(".choice").click(function(){
        var length = $("input.choice:checked").length;
        if(length>6){
            alert("最多只能选中6张图片！");
            return false;
        }
        else{
            if($(this).is(":checked")){
                $(this).next("input.hidden").val("1");
                // $(this).parent().parent().
                //     siblings().children("input.hidden").val("0");
            }
            else{
                $(this).next("input.hidden").val("0");
            }
        }
    })
    //复选框状态
    // alert($("#activitiesImg span").length);
    var span_length=$("#activitiesImg span").length;
    for(var i=1;i<=span_length;i++){
        if($("#activitiesImg tr:eq("+i+") span").text()=="Yes"){
            $("#activitiesImg tr:eq("+i+") input.choice").prop("checked",true);
        }
        else{
            $("#activitiesImg tr:eq("+i+") input.choice").prop("checked",false);
        }
    }
})