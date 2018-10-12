// JavaScript Document
function downPDF(){ 
	//要转成PDF的标签的范围。
    html2canvas($("#pdf"), {  
    height:3000,  
    onrendered: function(canvas) {           
        var imgData = canvas.toDataURL('image/png');  
        var doc = new jsPDF('p', 'px','a3');  
        //第一列 左右边距  第二列上下边距  第三列是图片左右拉伸  第四列 图片上下拉伸  
        doc.addImage(imgData, 'PNG',-325,30,1300,3000);  
        doc.addPage();  
//        doc.addImage(imgData, 'PNG', -9, -900,650,1500);  
        //test.pdf是下载的pdf的名称
        doc.save('报名表.pdf');
    }  
  });  
}

