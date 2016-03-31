package com.normal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 控制器
 * @author weiyong
 *
 */
@Controller
public class HomeController {
	
	/*** 
     * 首页 返回至/page/home.jsp页面 
     * @return 
     */  
    @RequestMapping("/home")  
    public ModelAndView index(){  
        //创建模型跟视图，用于渲染页面。并且指定要返回的页面为home页面  
        ModelAndView mav = new ModelAndView("home");  
        return mav;  
    }  

}
