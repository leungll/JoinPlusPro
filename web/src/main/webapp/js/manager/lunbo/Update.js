//轮播图管理部分
$(function(){
	$("#submit").click(function(){  
//		$("table").append()
//		return false;
	})
	$(".delete,.update").mouseenter(function(){           //删除的图标的变化
		$(this).css({
			"opacity":"1",
		})
	})
	$(".delete,.update").mouseleave(function(){
		$(this).css({
			"opacity":"0.5",
		})
	})
	$(".delete,.update").mousemove(function(){
		$(this).css({
			"opacity":"1",
		})
	})
	$("#path").click(function(){                 //把浏览和文本框改变为file
		$("#file").click()
	})
	$("#view").click(function(){
		$("#file").click()
		return false;
	})
	$("#path").change(function(){
		var path=$("#file").val()
		$(this).val(path)
	})
    $("#sidebar ul li:nth-child(2) a").hover(function(){
        $(this).css({
            "background-color":"rgb(78,84,101)"
        });
    },function(){
        $(this).css({
            "background-color":"rgb(78,84,101)"
        });
    });

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
