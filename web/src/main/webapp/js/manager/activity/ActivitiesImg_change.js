$(function(){
    $("#simgle_photo tr td:first-child").css({
        "width":"150px",
        "text-align":"center"
    });
    $("#simgle_photo tr td:nth-child(3)").css({
        "width":"60px",
        "text-align":"center"
    });
    $("#simgle_photo tr td:nth-child(3) input").css({
        "width":"20px",
        "height":"20px"
    })
    $("#simgle_photo tr td:last-child").css({
        "width":"300px",
        "text-align":"center"
    })

    //图片标题更改
    $("#sure_change").click(function(){
        $("#new_title").focus()
    })

    //hidden值改变
    $(".choice").click(function(){
        if($(".choice").is(":checked")){
            $(".hidden").val("1");
        }
        else{
            $(".hidden").val("0");
        }
    })
    //复选框状态
    if($("#status").text() == "Yes"){
        $(".choice").prop("checked",true);
    }
})