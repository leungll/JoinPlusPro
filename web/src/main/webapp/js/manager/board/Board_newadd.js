$(function(){
    $("input").blur(function(){
        $(this).next(".formtipsonError").remove()
        //验证年份
        if ($(this).is("#year")) {
            if (this.value=="") {
                var errorMsg="请输入年！"
                $(this).after("<span class='formtipsonError'>"+errorMsg+"</span>")
            }
        }
        //验证月份
        if ($(this).is("#month")) {
            if (this.value=="") {
                var errorMsg="请输入月！"
                $(this).after("<span class='formtipsonError'>"+errorMsg+"</span>")
            }
        }
        //验证日
        if ($(this).is("#day")) {
            if (this.value=="") {
                var errorMsg="请输入日！"
                $(this).after("<span class='formtipsonError'>"+errorMsg+"</span>")
            }
        }
    }).keyup(function(){
        $(this).triggerHandler("blur")
    })
    $("textarea").blur(function(){
        $(this).next(".textareaonError").remove()
        if (this.value=="") {
            var errorMsg="请输入内容！"
            $(this).after("<span class='textareaonError'>"+errorMsg+"</span>")
        }
    }).keyup(function(){
        $(this).triggerHandler("blur")
    })
    $("#submit").click(function(){
        $("input").trigger("blur")
        $("textarea").trigger("blur")
        var errorNum=$("form span").length
        if (errorNum!=0) {
            alert("请注意完善公告信息！")
            return false;
        }else{
            alert("提交成功！")
        }
    })
    $("#sidebar ul li:nth-child(3) a").hover(function(){
        $(this).css({
            "background-color":"rgb(78,84,101)"
        });
    },function(){
        $(this).css({
            "background-color":"rgb(78,84,101)"
        });
    });
    $(".choose").click(function(){
        if($(".choose").is(":checked")){
            $(".hidden").val("1");
        }
        else{
            $(".hidden").val("0");
        }
    });
})