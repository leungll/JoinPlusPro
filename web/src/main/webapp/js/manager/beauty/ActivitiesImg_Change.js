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
    $("#simgle_photo tr td:first-child").css({
        "width":"150px",
        "text-align":"center"
    });
    $("#simgle_photo tr td:nth-child(3)").css({
        "width":"60px",
        "text-align":"center"
    });
    $("#simgle_photo tr td:nth-child(3)").css({
        "width":"100px",
        "height":"20px"
    })
    $("#simgle_photo tr td:last-child").css({
        "width":"200px",
        "text-align":"center"
    })

    //图片标题更改
    $("#change_through1").click(function(){
        $("#change_file1").click();
    });
    $("#photo_address1").focus(function(){
        $("#change_file1").click();
    });
    $("#change_file1").change(function(){
        $("#photo_address1").val($(this).val());
    });

    //复选框状态
    if($("#status").text() == "Yes"){
        $(".choice").prop("checked",true);
    }
})