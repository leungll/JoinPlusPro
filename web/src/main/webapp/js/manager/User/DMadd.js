$(function(){
	$("input").blur(function(){
		$(this).next(".formtipsonError").remove()
		//验证姓名是否为空
		if ($(this).is("#name")) {                  
			if (this.value=="") {
				var errorMsg="请输入姓名！"
				$(this).after("<span class='formtipsonError'>"+errorMsg+"</span>")
			}
		}
		//验证部门是否为空
		if ($(this).is("#department")) {                  
			if (this.value=="") {
				var errorMsg="请输入部门！"
				$(this).after("<span class='formtipsonError'>"+errorMsg+"</span>")
			}
		}
		//验证学号是否为空
		if ($(this).is("#studentNumber")) {                  
			if (this.value=="") {
				var errorMsg="请输入学号！"
				$(this).after("<span class='formtipsonError'>"+errorMsg+"</span>")
			}
		}
		//验证年级是否为空
		if ($(this).is("#grade")) {
			if (this.value=="") {
				var errorMsg="请输入年级！"
				$(this).after("<span class='formtipsonError'>"+errorMsg+"</span>")
			}
		}
		//验证职务是否为空
		if ($(this).is("#job")) {
			if (this.value=="") {
				var errorMsg="请输入职位！"
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
		if ($("#photo").attr("src")=="") {
			alert("是否放弃上传照片？")
		}
		var errorNum=$("form span").length
		if (errorNum!=0) {
			alert("请注意完善公告信息！")
			return false;
		}else{
			alert("提交成功！")
		}
	})
	$("#path").click(function(){                 //把浏览和文本框改变为file
		$("#file").click()
	})
	$("#view").click(function(){
		$("#file").click()
		return false;
	})
	$("#file").change(function(){
		var path=$("#file").val()
		$("#path").val(path)
	})
})