$(function(){
    //突出页面所在板块位置
    $("#sidebar ul li:nth-child(9) a").hover(function(){
        $(this).css({
            "background-color":"rgb(78,84,101)"
        });
    },function(){
        $(this).css({
            "background-color":"rgb(78,84,101)"
        });
    });
    //设置表格样式
    $("#regi_table tr th:first-child").css("width","40px");
    $("#regi_table tr th:lt(6):not(:first)").css("width","90px");
    $("#regi_table tr th:gt(5):not(:eq(8)):not(:last)").css("width","100px");
    $("#regi_table tr th:eq(8)").css("width","160px");
    $("#regi_table tr th:last-child").css("width","110px");
    $("#regi_table tr:not(:first)").hover(function(){
        $(this).css("background-color","rgb(242,242,242)");
    },function(){
        $(this).css("background-color","white");
    });

    $(".examined_fail").click(function(){
        $(".department").fadeToggle(800);
        $(this).parent().parent().
            siblings().children("td").
                children(".department").hide();
    })
});