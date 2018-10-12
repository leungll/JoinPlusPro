$(function(){
    //设置标题栏样式
    $("#user ul li:first-child").css("width","120px");
    $("#user ul li:first-child a").css("width","120px");
    $("#user ul li:last-child").css("width","60px");
    $("#user ul li:last-child a").css("width","60px");
    //头像的鼠标hover事件
    $("#user ul li:first-child a").hover(function(){
        $("#head_img a img").css("border","1px solid white");
    },function(){
        $("#head_img a img").css("border","1px solid rgb(35,38,46)");
    });
    //“注销”点击提示
    $("#user ul li:last-child a").click(function(){
        alert("已注销账号");
    })

    //设置侧栏样式
    $("#sidebar ul li:first").css({
        "height":"35px",
        "background-color":"rgb(74,80,100)",
    });
    $("#sidebar ul li:gt(0) a").css({
        "width":"200px",
        "height":"45px",
        "line-height":"45px",
        "color":"rgb(189,190,193)"
    }).hover(function(){
        $(this).css({
            "color":"white",
            "background-color":"rgb(78,84,101)"
        });
    },function(){
        $(this).css({
            "color":"rgb(189,190,193)",
            "background-color":"rgb(57,61,73)"
        });
    });
})