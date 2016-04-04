package com.normal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.normal.model.User;
import com.normal.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	/*** 
     * 首页 返回至/page/home.jsp页面 
     * @return 
     */  
    @RequestMapping("/user")  
    public ModelAndView index(){  
        //创建模型跟视图，用于渲染页面。并且指定要返回的页面为home页面  
    	
    	User u = new User();
    	u.setBuyTime(20160101);
    	u.setShopId(1);
    	u.setDayCount(30);
    	u.setSmsCount(10);
    	userService.save(u);
        ModelAndView mav = new ModelAndView("home");  
        return mav;  
    }
	
	

}
