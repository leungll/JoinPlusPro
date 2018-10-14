$(function(){
    //突出页面所在板块位置
    $("#sidebar ul li:nth-child(10) a").hover(function(){
        $(this).css({
            "background-color":"rgb(78,84,101)"
        });
    },function(){
        $(this).css({
            "background-color":"rgb(78,84,101)"
        });
    });

    //排与排之间不同颜色区分
    $("#Suggestions_form tr:odd").css("background-color","rgb(242,242,242)");
})