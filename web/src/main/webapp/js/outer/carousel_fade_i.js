$(function(){
    //初始化必要变量
    var i = 0;                                //变量i，代表图片索引值
    var size = $(".carousal-img img").length; //变量size获取图片的个数
    var point = function(e){                  //变量point代表轮播图对应圆点样式，即每个索引值对应圆点添加active样式并且同辈元素移去样式
        $(".carousal-indicators li").eq(e).addClass('active').siblings().removeClass('active');
    };
    //自动播放
    timer = setInterval(function(){            // 计时器每隔2000毫秒开始执行一次函数，开始执行！！！
        i++;
        if(i > size - 1){                       //当最后一张图片结束还时回到第一张，图片索引值为i
            i = 0;
            $(".carousal-img").animate({left:"0px"},800);
        }

        $(".carousal-img img").eq(i).fadeIn(800).siblings().fadeOut(800);//索引值依次对应的每张图片800毫秒时间内逐渐出现，同辈元素800毫秒时间内逐渐淡出
        point(i);                                                        //下方圆点也对应相同索引值图片
    },2000);
    //鼠标移出停止轮播
    $(".btn").hover(function(){                 //鼠标悬浮在左右按钮时清空计时器,轮播停止
        clearInterval(timer);                   //停止计时器的时间间隔，要注意如果var timer定义在function内，则无法清除！
    },function(){                               //鼠标不悬浮时继续执行自动播放
        timer = setInterval(function(){
            i++;
            if(i > size - 1){
                i = 0;
            }
            $(".carousal-img img").eq(i).stop().fadeIn(800).siblings().stop().fadeOut(800);
            point(i);
        },2000);
    });
    //动态添加小圆点，与后台交互时可以采用？？如果不确定轮播图片张数时可以采用
    for(j = 0;j < size;j++){
        $(".carousal-indicators").append('<li></li>');
    }
    //鼠标点击左箭头切换，索引值i减一，如果第一张结束再点击向左按钮，索引值小于0，变为索引值size-1,即为最后一张的图片
    $("#left").click(function(){
        i--;
        if(i < 0){
            i = size - 1;
        }
        $(".carousal-img img").eq(i).stop().fadeIn(800).siblings().stop().fadeOut(400);
        point(i);
    });
    //鼠标点击右箭头切换，索引值i加一，如果最后一张结束再点击向右按钮，索引值大于size-1，变为索引值0,即为第一张的图片
    $("#right").click(function(){
        i++;
        if(i > size - 1){
            i = 0;
        }
        $(".carousal-img img").eq(i).stop().fadeIn(800).siblings().stop().fadeOut(400);
        point(i);
    });
    //鼠标点击圆点切换
    $(".carousal-indicators li").click(function(){
        var index = $(this).index();      //设置变量index是下方圆点，返回指定元素相对于其他指定元素的 index位置。
        $(".carousal-img img").eq(index).stop().fadeIn(800).siblings().stop().fadeOut(400);//索引值为index的轮播图片800毫秒时间内逐渐出现，同辈元素800毫秒时间内逐渐淡出
        i = index - 1;                    //更改点击结束轮播图片的索引值，i++ = index,保证正常顺序进行轮播
        point(index);                     //下方圆点对应相同索引值
    });

});
