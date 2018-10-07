$(function(){
	$(".delete,.update,.add").mouseenter(function(){           //图标的变化
		$(this).css({
			"opacity":"1",
		})
	})
	$(".delete,.update,.add").mouseleave(function(){
		$(this).css({
			"opacity":"0.5",
		})
	})
	$(".delete,.update,.add").mousemove(function(){
		$(this).css({
			"opacity":"1",
		})
	})
    $("#sidebar ul li:nth-child(4) a").hover(function(){
        $(this).css({
            "background-color":"rgb(78,84,101)"
        });
    },function(){
        $(this).css({
            "background-color":"rgb(78,84,101)"
        });
    });

})