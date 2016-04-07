$(function(){
    $(".main-ul > li > a").click(function(){
         $(this).addClass("active").parents().siblings().find("a").removeClass("active");
         // $(this).parents().siblings().find(".main-nav-sub").hide(300);
         $(this).siblings(".main-nav-sub").toggle(300);      
    })
    // 首页焦点图轮播
    $("#slide").slide({
        mainCell:".bd ul",
        autoPlay:true
    });
})