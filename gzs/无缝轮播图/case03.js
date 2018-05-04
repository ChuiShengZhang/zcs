var i = 0;           // 当前显示的图片索引
var timer = null;    // 定时器
var delay = 2000;    // 图片自动切换的间隔时间
var speed = 1000;     // 动画时间
var w;            //每张图片大小
var h;          //每张图片高度
//1、设置每张图片大小正好占满容器div
function setImgSize() {
    console.log($("html").width(),$("html").height(),$("body").width(),$("body").height(),$(".banner").width(),$(".banner").height());
    w = $(".banner").width();
    h = $(".banner").height();
    $(".banner>.hot").find("img").width(w).height(h);
}
//2、页面加载就绪后需要做三件事件
//1)初始化所有图片大小
//2)复制列表中的第一个图片，追加到列表最后，设置ul的宽度为图片张数 * 图片宽度
//3）设置周期计时器setInterval，实现图片自动切换
$(function() {
    setImgSize();
    var firstimg = $('.hot li').first().clone(true);
    console.log(firstimg.find("img").height());
    console.log(w,h);

    $('.hot').append(firstimg).width($('.hot li').length * w);
    $('.hot').height(h);
    console.log($('.hot').width(),$('.hot').height());
    timer = setInterval(imgChangeR, delay);
});
//3、自动切换图片函数，默认向右切换 ..图片左移
//思想：利用jQuery动画animate实现移动
//1)图片移动
//2)圆点样式切换
function imgChangeR() {
    ++i;
    console.log(i);
    if (i == $('.hot li').length) {
        i = 1;
        $('.hot').css({left: 0});
    }
    $('.hot').animate({left: -i*w}, speed);
    dotChange();
}
//4、自动切换图片函数，默认向左切换
//思想：利用jQuery动画animate实现移动
//1)图片移动
//2)圆点样式切换
function imgChangeL() {
    --i;
    console.log(i);
    if(i==-1){
        i=$(".hot li").length-2;
        $(".hot").css({left:-(i+1)*w});
    }
    $(".hot").animate({left:-i*w},speed);
    dotChange();
}

// 5、设置左右切换的箭头显示和隐藏
$('.banner').hover(function () {
    $(".arrow").show();
},function () {
    $(".arrow").hide();
});
// 6、点击向右箭头，向右切换图片
$('.next').click(function() {
    imgChangeR();
});
// 7、鼠标移入，暂停自动播放clearInterval，移出，开始自动播放setInterval
$('.banner').hover(function() {
    clearInterval(timer);
}, function() {
    timer = setInterval(imgChangeR, delay);
});
//8. 点击向左箭头，向左移动图片
$('.prev').click(function() {
    imgChangeL();
});
//9、自动切换对应的圆点：圆点的样式on切换
function dotChange() {
    console.log(i);
    if (i == $('.hot li').length - 1) {
        $('.dot li').eq(0).addClass('on').siblings().removeClass('on');
    } else {
        $('.dot li').eq(i).addClass('on').siblings().removeClass("on");
    }
}
// 10、鼠标划入圆点
$('.dot li').mouseover(function() {
    i = $(this).index();
    $('.hot').animate({left: -i * w}, "fast");
    dotChange();
});