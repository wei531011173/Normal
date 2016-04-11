$(function(){
    $(".main-ul > li > a").click(function(){
         $(this).addClass("active").parents().siblings().find("a").removeClass("active");
         // $(this).parents().siblings().find(".main-nav-sub").hide(300);
         $(this).siblings(".main-nav-sub").toggle(300);      
    })
    // 首页焦点图轮播
    var slideBox = $("#slide");
    if (slideBox.length > 0) {
        slideBox.slide({
            mainCell:".bd ul",
            autoPlay:true
        });       
    }
    // 选项卡
    var list_title = $('.main-tab-nav').children('li');
    var list_box = $('.main-tab-content').children('div');
    list_title.click(function(){
        var index = $(this).index();
        $(this).addClass('active').siblings().removeClass('active');
        list_box.eq(index).removeClass('hide').show().siblings().addClass('hide').hide();
    });
})