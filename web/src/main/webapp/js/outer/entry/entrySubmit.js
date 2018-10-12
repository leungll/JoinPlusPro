// JavaScript Document
function NewPage(){
    //获取页面的高度和宽度
    var sHeight = document.documentElement.scrollHeight;
    var sWidth = document.documentElement.scrollWidth;

    var oMask = document.createElement("div");
    oMask.id = "mask";
    oMask.style.height = sHeight+"px";
    oMask.style.width = sWidth+"px";
    document.body.appendChild(oMask);

    var oPopup = document.createElement("div");
    oPopup.id = "popup";
    oPopup.innerHTML="<form action=\"${website}entry/update/${id}\" method=\"post\" enctype=\"multipart/form-data\"><input type=\"button\" value=\"修改报名信息\" onclick=\"NewPage\"><%--id为${myId}--%><table><tr><td class=\"miaomiaomiao\"></td><td class=\"miaomiaomiao\"></td><td class=\"miaomiaomiao\"></td><td class=\"miaomiaomiao\"></td><td class=\"miaomiaomiao\"></td><td class=\"miaomiaomiao\"></td><td class=\"miaomiaomiao\"></td><td class=\"miaomiaomiao\"></td></tr><tr><td>姓名</td><td colspan=\"2\" width=\"25%\"><input type=\"text\" name=\"name\" id=\"name\" class=\"fullinput\"></td><td>学号</td><td colspan=\"2\" width=\"25%\"><input type=\"text\" name=\"number\" id=\"number\" class=\"fullinput\"></td><td colspan=\"2\" rowspan=\"5\" width=\"25%\"><img src=\"\" id=\"img\" width=\"100%\"><input type=\"file\" name=\"uploadFile\" id=\"file\" multiple=\"multiple\"></td></tr><tr><td>性别</td><td><input type=\"radio\" name=\"sex\" value=\"男\" id=\"sex\">男<input type=\"radio\" name=\"sex\" value=\"女\" id=\"sex\">女 </td><td>民族</td><td><select name=\"nation\" id=\"nation\"><option value=\"汉族\">汉族</option><option value=\"蒙古族\">蒙古族</option><option value=\"回族\">回族</option><option value=\"藏族\">藏族</option><option value=\"维吾尔族\">维吾尔族</option><option value=\"苗族\">苗族</option><option value=\"彝族\">彝族</option><option value=\"壮族\">壮族</option><option value=\"布依族\">布依族</option><option value=\"朝鲜族\">朝鲜族</option><option value=\"满族\">满族</option><option value=\"侗族\">侗族</option><option value=\"瑶族\">瑶族</option><option value=\"白族\">白族</option><option value=\"土家族\">土家族</option><option value=\"哈尼族\">哈尼族</option><option value=\"哈萨克族\">哈萨克族</option><option value=\"傣族\">傣族</option><option value=\"黎族\">黎族</option><option value=\"傈僳族\">傈僳族</option><option value=\"佤族\">佤族</option><option value=\"畲族\">畲族</option><option value=\"高山族\">高山族</option><option value=\"拉祜族\">拉祜族</option><option value=\"水族\">水族</option><option value=\"东乡族\">东乡族</option><option value=\"纳西族\">纳西族</option><option value=\"景颇族\">景颇族</option><option value=\"柯尔克孜族\">柯尔克孜族</option><option value=\"土族\">土族</option><option value=\"达斡尔族\">达斡尔族</option><option value=\"仫佬族\">仫佬族</option><option value=\"羌族\">羌族</option><option value=\"布朗族\">布朗族</option><option value=\"撒拉族\">撒拉族</option><option value=\"毛南族\">毛南族</option><option value=\"仡佬族\">仡佬族</option><option value=\"锡伯族\">锡伯族</option><option value=\"阿昌族\">阿昌族</option><option value=\"普米族\">普米族</option><option value=\"塔吉克族\">塔吉克族</option><option value=\"怒族\">怒族</option><option value=\"乌孜别克族\">乌孜别克族</option><option value=\"俄罗斯族\">俄罗斯族</option><option value=\"鄂温克族\">鄂温克族</option><option value=\"德昂族\">德昂族</option><option value=\"保安族\">保安族</option><option value=\"裕固族\">裕固族</option><option value=\"京族\">京族</option><option value=\"塔塔尔族\">塔塔尔族</option><option value=\"独龙族\">独龙族</option><option value=\"鄂伦春族\">鄂伦春族</option><option value=\"赫哲族\">赫哲族</option><option value=\"门巴族\">门巴族</option><option value=\"珞巴族\">珞巴族</option><option value=\"基诺族\">基诺族</option></select></td><td>排名</td><td><input type=\"number\" name=\"rank\" id=\"rank\" class=\"mininput\">/<input type=\"number\" name=\"rankAll\" id=\"rankAll\" class=\"mininput\"></td></tr><tr><td>生源地</td><td colspan=\"2\"><select name=\"nativePlace\" id=\"province\" class=\"smallinput\"><option value=\"省份\" selected=\"selected\">省份</option></select><%--<select name=\"nativePlace\" id=\"city\" class=\"smallinput\">--%><%--<option value=\"城市\" selected=\"selected\">市县</option>--%><%--</select>--%></td><td>专业</td><td colspan=\"2\"><input type=\"text\" name=\"major\" id=\"major\" class=\"fullinput\"></td></tr><tr><td>手机</td><td colspan=\"2\"><input type=\"tel\" name=\"phone\" id=\"phone\" class=\"fullinput\"></td><td>QQ</td><td colspan=\"2\"><input type=\"text\" name=\"qq\" id=\"qq\" class=\"fullinput\"></td></tr><tr><td>服从调剂</td><td colspan=\"2\"><input type=\"radio\" name=\"yon\" value=1 id=\"yon\">服从<input type=\"radio\" name=\"yon\" value=0 id=\"yon\">不服从 </td><td>ID</td><td colspan=\"2\"><input type=\"text\" readonly placeholder=\"第一次报名后，将分配ID，请牢记\" class=\"fullinput\"></td></tr><tr><td>第一志愿</td><td colspan=\"3\"><input type=\"radio\" name=\"volunteer1\" value=\"前端\" id=\"volunteer1\">前端<input type=\"radio\" name=\"volunteer1\" value=\"后端\" id=\"volunteer1\">后端<input type=\"radio\" name=\"volunteer1\" value=\"产品\" id=\"volunteer1\">产品 </td><td>第二志愿</td><td colspan=\"3\"><input type=\"radio\" name=\"volunteer2\" value=\"前端\" id=\"volunteer1\">前端<input type=\"radio\" name=\"volunteer2\" value=\"后端\" id=\"volunteer1\">后端<input type=\"radio\" name=\"volunteer2\" value=\"产品\" id=\"volunteer1\">产品 </td></tr><tr><td>自我介绍</td><td colspan=\"7\"><textarea name=\"introduction\" id=\"introduction\" class=\"maxinput\"></textarea></td></tr><tr><td>加入理由</td><td colspan=\"7\"><textarea name=\"reason\" id=\"reason\" class=\"maxinput\"></textarea></td></tr></table><input type=\"submit\" id=\"submit\"></form>";
    document.body.appendChild(oPopup);
    //获取可视区域的宽度和高度
    var wHeight = document.documentElement.clientHeight;
    var wWidth = document.documentElement.clientWidth;
    //获取popup的宽度和高度
    var dHeight = oPopup.offsetHeight;
    var dWidth = oPopup.offsetWidth;
    //设置popup居中位置
    oPopup.style.left=(wWidth-dWidth)/2+"px";
    oPopup.style.top=(wHeight-dHeight)/2+"px";
    //关闭
    oMask.onclick = function(){
        document.body.removeChild(oMask);
        document.body.removeChild(oPopup);
    }
}