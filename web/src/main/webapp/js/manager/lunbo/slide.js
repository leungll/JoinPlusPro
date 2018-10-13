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
            $(this).next().val("1");
        }
        else{
            $(this).next().val("0");
        }
    })
    //复选框状态
	var span_length=$(".status").length;
    for(var i=1;i<=span_length;i++) {
    	if ($("table tr:eq("+i+") td span").text()=="Yes") {
    		$("table tr:eq("+i+") input.choice").prop("checked",true);
		}else{
            $("table tr:eq("+i+") input.choice").prop("checked",false);
        }
	};
    //限定只可以选中6张
	$(".choice").click(function() {
        var yes_length = $("input.choice:checked").length;
        if (yes_length > 6) {
            alert("最多只能选中6张图片！");
            return false;
        }
    })
})
